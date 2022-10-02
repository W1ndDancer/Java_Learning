package javastudy.Seminar4;

/*
1. Взять за основу реализацию стека, написанную в конце семенара.
 Добавить проверку граничных условий и выводить сообщения об ошибках,
 если мы пытаемся извлечь элемент из пустого стека, добавить элемент в полностью заполненный стек и тд
 */

public class Stack<T> {
    private T[] array;
    private int index;

    public Stack(int length) {
        this.index = 0;
        this.array = (T[]) new Object[length];
    }

    public int size() {
        return this.index;
    }
    public boolean empty() {
        return this.size() == 0;
    }
    public void push(T value) {
        this.array[index++] = value;
    }
    public T peek() {
        return this.array[index - 1];
    }
    public T pop(){
        return this.array[--index];
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(100);
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
    }
}