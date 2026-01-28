package Project;

public class MyQueue<T> {
    private Object[] data = new Object[10];
    private int front = 0;
    private int rear = 0;

    public void enqueue(T item) {
        data[rear++] = item;
    }

    public T dequeue() {
        if (front == rear) return null;
        return (T) data[front++];
    }
}
