/*
2. Написать реализацию очереди на основе массива; Реализовать методы size(), empty(), offer(), poll(), peek()
 */

public class Queue<T> {
    private T[] array;
    private int index;

    public Queue(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
    }

    public int size() {
        return this.index;
    }
    public boolean empty() {
        return this.size() == 0;
    }
    public void offer(T value) {
        if (index < array.length) this.array[index++] = value;
        else System.out.println("Error. Value cant be added. Out of bounds");
    }
    public T peek() {
        if (index <= array.length) return this.array[array.length - index];
        else {
            System.out.println("ERROR. Stack is empty.");
            return null;
        }
    }
    public T poll() {
        if (index > 0) return this.array[array.length - index--];
        else {
            System.out.println("ERROR. Stack is empty. Element cant be deleted.");
            return null;
        }
    }

    public static void main(String[] args) {
        Queue<String> stack = new Queue<>(3);
        stack.offer("String 1");
        stack.offer("String 2");
        stack.offer("String 3");
        System.out.println("peak = " + stack.peek());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
        System.out.println(stack.poll());
    }
    }

