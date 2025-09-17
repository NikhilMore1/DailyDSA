package collection_Framework.Comparator;

import java.util.Comparator;

public class SortByRoll implements Comparator<Students> {
    @Override
    public int compare(Students o1,Students o2){
        return o1.getRoll().compareTo(o2.getRoll());
    }
}
