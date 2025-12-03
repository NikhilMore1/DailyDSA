package EPAM.coding;

import java.util.Comparator;

public class SortByEmail implements Comparator<ComparatorEx> {
    @Override
    public int compare(ComparatorEx o1, ComparatorEx o2) {
        return o1.mail.compareTo(o2.mail);
    }
}
