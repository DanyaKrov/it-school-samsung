import java.util.Iterator;

public class MyArrayList<T extends Comparable<T>> implements Iterable<T> {
    private T[] data;
    private int size;

    public MyArrayList(int n) {
        data = (T[]) new Comparable[n];
    }
    public MyArrayList() {
        this(10);
    }
    public T get(int i) {
        return (T)data[i];
    }

    public void set(int i, T obj) {
        data[i] = obj;
    }
    public void add (T obj)
    {
        if (size == data.length){
            T[] nData = (T[]) new Comparable[size * 2];
            System.arraycopy(data, 0, nData, 0, size);
            data = nData;
        }
        data[size] = obj;
        size++;
    }
    public void remove(int i) {
        if (i != size - 1)
            System.arraycopy(data, i + 1, data, i, size - i);
        // очищаем последний элемент
        data[size - 1] = null;
        size--;
    }
    public boolean addAll(Iterable<T> list){
        if (list == null || !list.iterator().hasNext())
            return false;
        while (list.iterator().hasNext()){
            this.add(list.iterator().next());
        }
        return true;
    }
    public boolean contains(T key){
        return indexOf(key) >= 0;
    }
    public int indexOf(T key){
        int mid = 0;
        int low = 0;
        int hi = size;
        while (low <= hi){
            mid = (low + hi) >>> 1;
            final T d = data[mid];
            if (key.compareTo(d) == 0)
                return mid;
            else if (key.compareTo(d) < 0)
                hi = mid - 1;
            else
                low = ++mid;
        }
        return -mid - 1;
    }

    @Override
    public Iterator iterator() {

        return new Itr();
    }

    private class Itr implements Iterator {
        int cursor;

        @Override
        public boolean hasNext() {
            if (cursor < size)
                return true;
            else
                return false;
        }

        @Override
        public Object next() {
            cursor++;
            return data[cursor - 1];
        }

        @Override
        public void remove() {
            MyArrayList.this.remove(cursor);
        }
    }
}