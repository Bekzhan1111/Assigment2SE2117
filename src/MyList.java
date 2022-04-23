import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;

public interface MyList<T> {
    int size();
    boolean contains(Object o);
    void add(T item);
    void add(T item, int index);
    boolean remove(T item);
    T remove(int index);
    void clear();
    T get(int index);
    int indexOf(Object o);
    int lastIndexOf(Object o);
    void sort();
}
