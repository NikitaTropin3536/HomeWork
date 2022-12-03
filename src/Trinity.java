public class Trinity<T extends Comparable<T>> {
    private T first; // поле first
    private T second; // поле second

    private T third; // поле third
    public Trinity(T first, T second, T third) { // конструктор
        this.first = first;
        this.second = second;
        this.third = third;
        sort();
    }

    public void setFirst (T first) {
        this.first = first;
        sort();
    }

    public void setSecond (T second) {
        this.second = second;
        sort();
    }

    public void setThird (T third) {
        this.third = third;
        sort();
    }

    public T getFirst() {
        return first;
    }

    public T getSecond() {
        return second;
    }

    public T getThird() {
        return third;
    }

    private boolean compare(T t1, T t2) {
        return t1.compareTo(t2) < 0; // проверка t1 > t2 или t2 > t1
    }

    private void sort() {
        T t;
        // меняем значения first - a и second - a
        if (compare(getFirst(), getSecond())) {
            t = getFirst();
            setFirst(getSecond());
            setSecond(t);
        }

        // меняем значения second - a и third - a
        if (compare(getSecond(), getThird())) {
            t = getSecond();
            setSecond(getThird());
            setThird(t);
        }
    }

    // вывод троицы на экран
    public String toString() {
        return "Trinity: " + "\n"  +
                "first = " + first + "\n"  +
                "second = " + second + "\n" +
                "third = " + third;
    }

}