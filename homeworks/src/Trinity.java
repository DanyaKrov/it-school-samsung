public class Trinity<T extends Comparable<T>> {
    T first;
    T second;
    T third;
    private void sortElements(){
        T template;
        if (first.compareTo(second) > 0){
            template = second;
            second = first;
            first = template;
        }
        if (second.compareTo(third) > 0){
            template = second;
            second = third;
            third = template;
        }
        if (first.compareTo(second) > 0){
            template = second;
            second = first;
            first = template;
        }
    }
    public Trinity(T first, T second, T third){
        this.first = first;
        this.second = second;
        this.third = third;
        sortElements();
    }
    public void setFirst(T first){
        this.first = first;
        sortElements();
    }
    public T getFirst(){
        return first;
    }
    public void setSecond(T second){
        this.second = second;
        sortElements();
    }
    public T getSecond(){
        return second;
    }
    public void setThird(T third){
        this.third = third;
        sortElements();
    }
    public T getThird(){
        return third;
    }
}
