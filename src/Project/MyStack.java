package Project;

public class MyStack<T> {
    private MyList<T> list = new MyList<>();

    public void push(T item) {
        list.add(item);
    }

    public T pop() {
        if (list.size() == 0) return null;
        return list.get(list.size() - 1);
    }
}