package Domain;

import java.util.Comparator;

public class FlyTimeComrparator implements Comparator<Ticket> {
    @Override
    public int compare(Ticket o1, Ticket o2) {
        return o1.getTimeFly()- o2.getTimeFly();
    }
}
