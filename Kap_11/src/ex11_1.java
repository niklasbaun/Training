import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.function.Predicate;

public class ex11_1 {
    /**
     * Removes all elements from the list that satisfy the filter.
     * @param list the list to be filtered
     * @param filter the filter to be applied
     */
    public static <T> void removeIf(ArrayList<T> list, Predicate<T> filter){
        Iterator iter = list.iterator();

        while (iter.hasNext()){
            T t = (T) iter.next();
            if (filter.test(t)){
                iter.remove();
            }
        }
    }

    /**
     * Sorts the list according to the comparator.
     * @param list the list to be sorted
     * @param comparator the comparator to be used
     */
    public static <T> void sortBy(ArrayList<T> list, Comparator<T> comparator){
        list.sort(comparator);
    }

    /**
     * Returns a string representation of the list.
     * @param list the list to be converted to a string
     * @return a string representation of the list
     */
    public static <T> String listToString(ArrayList<T> list){
        StringBuilder sb = new StringBuilder();
        for (T t : list){
            sb.append(t.toString()).append("\n");
        }
        return sb.toString();
    }
}
