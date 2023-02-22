public class Main {
    public static void main(String[] args) {
    }
    public static <T extends Comparable<T>> int binarySearch(T[] a, int low, int hi, T key){
        if (low > hi)
            throw new IllegalArgumentException("The start index is higher than " +
                "the finish index.");
        if (low < 0 || hi > a.length)
             throw new ArrayIndexOutOfBoundsException("One of the indices is out " +
                "of bounds.");
        int mid = 0;
        while (low <= hi){
            mid = (low + hi) >>> 1;
            final T d = a[mid];
            if (key.compareTo(d) == 0)
                return mid;
            else if (key.compareTo(d) < 0)
                hi = mid - 1;
            else
                low = ++mid;
        }
        return -mid - 1;
        }
}