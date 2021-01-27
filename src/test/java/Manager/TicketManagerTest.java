package Manager;

import Domain.Ticket;

import org.junit.jupiter.api.Test;


import static org.junit.jupiter.api.Assertions.assertArrayEquals;

class TicketManagerTest {

    @Test
    void searchAllByFromAndTo() {
        TicketManager ticketManager = new TicketManager();
        Ticket sochi = new Ticket(1, 12500, "Vnukovo", "Sochi", 120);
        Ticket kazan = new Ticket(2, 16500, "Domodedovo", "Kazan", 180);
        Ticket simpheropol = new Ticket(3, 15500, "Sheremetevo", "Simpheropol", 150);
        Ticket vladivostok = new Ticket(4, 32500, "Vnukovo", "Vladivostok", 480);
        Ticket sochi2 = new Ticket(5, 13500, "Domodedovo", "Sochi", 120);
        Ticket kazan2 = new Ticket(6, 14500, "Vnukovo", "Kazan", 190);
        Ticket simpheropol2 = new Ticket(7, 160000, "Domodedovo", "Simpheropol", 140);
        Ticket vladivostok2 = new Ticket(8, 33500, "Sheremetevo", "Vladivostok", 450);
        Ticket sochi3 = new Ticket(9, 10500, "Vnukovo", "Sochi", 120);
        Ticket sochi4 = new Ticket(10, 15500, "Vnukovo", "Sochi", 120);
        Ticket sochi5 = new Ticket(11, 9500, "Vnukovo", "Sochi", 120);
        Ticket sochi6 = new Ticket(12, 13500, "Vnukovo", "Sochi", 120);

        ticketManager.ticketRepository.save(sochi);
        ticketManager.ticketRepository.save(kazan);
        ticketManager.ticketRepository.save(simpheropol);
        ticketManager.ticketRepository.save(vladivostok);
        ticketManager.ticketRepository.save(sochi2);
        ticketManager.ticketRepository.save(kazan2);
        ticketManager.ticketRepository.save(simpheropol2);
        ticketManager.ticketRepository.save(vladivostok2);
        ticketManager.ticketRepository.save(sochi3);
        ticketManager.ticketRepository.save(sochi4);
        ticketManager.ticketRepository.save(sochi5);
        ticketManager.ticketRepository.save(sochi6);


        Ticket[] actual = ticketManager.searchAllByFromAndTo("Vnukovo", "Sochi");
        Ticket[] expected = new Ticket[]{sochi5, sochi3, sochi, sochi6, sochi4};

        assertArrayEquals(actual, expected);

    }

    @Test
    void searchAllByFromAndToNoMatch() {
        TicketManager ticketManager = new TicketManager();
        Ticket kazan = new Ticket(2, 16500, "Domodedovo", "Kazan", 180);
        Ticket simpheropol = new Ticket(3, 15500, "Sheremetevo", "Simpheropol", 150);
        Ticket vladivostok = new Ticket(4, 32500, "Vnukovo", "Vladivostok", 480);
        Ticket sochi2 = new Ticket(5, 13500, "Domodedovo", "Sochi", 120);
        Ticket kazan2 = new Ticket(6, 14500, "Vnukovo", "Kazan", 190);
        Ticket simpheropol2 = new Ticket(7, 160000, "Domodedovo", "Simpheropol", 140);
        Ticket vladivostok2 = new Ticket(8, 33500, "Sheremetevo", "Vladivostok", 450);

        ticketManager.ticketRepository.save(kazan);
        ticketManager.ticketRepository.save(simpheropol);
        ticketManager.ticketRepository.save(vladivostok);
        ticketManager.ticketRepository.save(sochi2);
        ticketManager.ticketRepository.save(kazan2);
        ticketManager.ticketRepository.save(simpheropol2);
        ticketManager.ticketRepository.save(vladivostok2);

        Ticket[] actual = ticketManager.searchAllByFromAndTo("Vnukovo", "Sochi");
        Ticket[] expected = new Ticket[]{};


        assertArrayEquals(actual, expected);
    }

    @Test
    void searchAllByFromAndToOneMatch() {
        TicketManager ticketManager = new TicketManager();
        Ticket kazan = new Ticket(2, 16500, "Domodedovo", "Kazan", 180);
        Ticket simpheropol = new Ticket(3, 15500, "Sheremetevo", "Simpheropol", 150);
        Ticket vladivostok = new Ticket(4, 32500, "Vnukovo", "Vladivostok", 480);
        Ticket sochi2 = new Ticket(5, 13500, "Domodedovo", "Sochi", 120);
        Ticket kazan2 = new Ticket(6, 14500, "Vnukovo", "Kazan", 190);
        Ticket simpheropol2 = new Ticket(7, 160000, "Domodedovo", "Simpheropol", 140);
        Ticket vladivostok2 = new Ticket(8, 33500, "Sheremetevo", "Vladivostok", 450);

        ticketManager.ticketRepository.save(kazan);
        ticketManager.ticketRepository.save(simpheropol);
        ticketManager.ticketRepository.save(vladivostok);
        ticketManager.ticketRepository.save(sochi2);
        ticketManager.ticketRepository.save(kazan2);
        ticketManager.ticketRepository.save(simpheropol2);
        ticketManager.ticketRepository.save(vladivostok2);

        Ticket[] actual = ticketManager.searchAllByFromAndTo("Domodedovo", "Sochi");
        Ticket[] expected = new Ticket[]{sochi2};


        assertArrayEquals(actual, expected);
    }
}