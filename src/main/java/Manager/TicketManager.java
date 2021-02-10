package Manager;

import Domain.FlyTimeComrparator;
import Domain.Ticket;
import Repository.TicketRepository;

import java.util.Arrays;
import java.util.Comparator;


public class TicketManager {
    TicketRepository ticketRepository = new TicketRepository();


    public void add(Ticket item) {
        ticketRepository.save(item);

    }

    public Ticket[] searchAllByFromAndTo(String from, String to, Comparator comparator) {
        Ticket[] result = new Ticket[0];
        for (Ticket ticket : ticketRepository.findAll()) {
            if (matches(ticket, from) && matches(ticket,to)) {
                Ticket[] tmp = new Ticket[result.length + 1];
                System.arraycopy(result, 0, tmp, 0, result.length);
                tmp[tmp.length - 1] = ticket;
                result = tmp;
                comparator = new FlyTimeComrparator();
                Arrays.sort(result, comparator);
            }


        }

        return result;
    }

    public boolean matches(Ticket ticket, String search) {

        if (ticket.getFrom().equalsIgnoreCase(search)) {
            return true;
        } else if (ticket.getTo().equalsIgnoreCase(search)) {
            return true;
        }
        return false;
    }
}