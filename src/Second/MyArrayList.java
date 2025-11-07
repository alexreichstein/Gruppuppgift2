package Second;

public class MyArrayList <T> {
    private Object[] elements;
    private int size;
    private final int capacity = 2;

    public MyArrayList() {
        elements = new Object[capacity];
        size = 0;
    }

    public void add(T value) {
        if (size == capacity) {
            expand();
        }
        elements[size++] = value;
    }

    public T get(int index) {
        return (T) elements[index];
    }

    public void remove(int index) {
        for (int i = index; i < size - 1; i++) {
            elements[i] = elements[i + 1];
        }
        elements[--size] = null;
    }

    public void clear() {
        for (int i = 0; i < size; i++) {
            elements[i] = null;
        }
        size = 0;
    }

    public void expand() {
        int newCapacity = capacity + 10;
        Object[] newElements = new Object[newCapacity];
        System.arraycopy(elements, 0, newElements, 0, size);
        elements = newElements;
    }

    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        for (int i = 0; i < size; i++) {
            sb.append(elements[i] + ", ");
        }
        return sb.toString();
    }
}

