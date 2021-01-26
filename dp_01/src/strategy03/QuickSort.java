package strategy03;

import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class QuickSort implements SortStrategy{
    @Override
    public <T> void sort(List<T> items) {
        System.out.println("Quick sort\n" + items);
    }
}
