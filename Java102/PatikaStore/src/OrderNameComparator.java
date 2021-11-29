import java.util.Comparator;

public class OrderNameComparator implements Comparator<Notebook> {

    @Override
    public int compare(Notebook o1, Notebook o2) {
        return o1.getBrandName().compareTo(o2.getBrandName());
    }
}
