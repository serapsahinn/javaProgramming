package chapter10;

public class StackOfIntegers
{
    private int[] elements;
    private int size;

    public StackOfIntegers() {
        elements = new int[100];
        size = 0;
    }

    public void push(int value) {
        elements[size++] = value;
    }

    public int pop() {
        return elements[--size];
    }

    public boolean isEmpty() {
        return size == 0;
    }
}
