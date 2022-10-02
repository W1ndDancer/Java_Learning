package hw4;/*
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
        if (index < array.length) this.array[index++] = value;
        else System.out.println("Error. Value cant be added. Out of bounds");
    }
    public T peek() {
        if (index > 0) return this.array[index - 1];
        else {
            System.out.println("ERROR. hw4.Stack is empty.");
            return null;
        }
    }
    public T pop(){
        if (index > 0) return this.array[--index];
        else {
            System.out.println("ERROR. hw4.Stack is empty. Element cant be deleted.");
            return null;
        }
    }

    public static void main(String[] args) {
        Stack<String> stack = new Stack<>(3);
        stack.push("String 1");
        stack.push("String 2");
        stack.push("String 3");
        stack.push("String 3");
        System.out.println("peak = " + stack.peek());
        System.out.println(stack.pop());
        System.out.println(stack.pop());
        System.out.println(stack.pop());


    }
}
