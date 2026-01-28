package Project;

public class MyList<T> {
    private Object[] data;
    private int size;

    public MyList() {
        data = new Object[4];
        size = 0;
    }

    public void add(T item) {
        if (size == data.length) {
            resize();
        }
        data[size++] = item;
    }

    private void resize() {
        Object[] newData = new Object[data.length * 2];
        for (int i = 0; i < data.length; i++) {
            newData[i] = data[i];
        }
        data = newData;
    }

    public T get(int index) {
        return (T) data[index];
    }

    public int size() {
        return size;
    }
}