import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Scanner;




public class MyArrayList<T  extends Comparable<T>> {
    private Object[] arr;
    private int length = 0;
    private int capacity = 3;

    public MyArrayList() {
        arr = new Object[capacity];
    }


    public void add(T item) {
        if (length == capacity)
            increaseCapacity();

        arr[length++] = item;
    }

    private void increaseCapacity() {
        capacity = 2 * capacity;
        Object[] old = arr;
        arr = new Object[capacity];

        for (int i = 0; i < old.length; i++)
            arr[i] = old[i];
    }
    public boolean remove(Object item) {
        int idx=indexOf(item);
        if(idx==-1) return false;
        remove(idx);
        return true;
    }


    public int indexOf(Object o) {
        for (int i = 0; i < length; i++) {
            if(arr[i].equals(o)){
                return i;
            }
        }
        return -1;
    }
    public T get(int index) {
        return (T)arr[index];
    }
    private void set(int index,T data){
        arr[index]=data;
    }
    public void swap(int index1,int index2){
        T data = (T) arr[index1];
        set(index1, (T) arr[index2]);
        set(index2,data);
    }
    public int size() {
        return length;
    }
}
