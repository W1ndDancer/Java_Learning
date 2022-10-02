package javastudy.Seminar4;

import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя строку вида
text~num
Нужно рассплитить строку по ~, сохранить text в связный список на позицию num.
Если введено print~num, выводит строку из позиции num в связном списке и удаляет её из списка.
 */

public class S4T2 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        LinkedList<String> ll = new LinkedList<>();

        while (true){
            String[] str = scan.nextLine().split("~");
            int num = Integer.parseInt(str[1]);
            if ( num > ll.size()) System.out.println("num is out of bounds. Repeat");
            else {
                if (str[0].equalsIgnoreCase("print")) {
                    System.out.println(ll.get(num));
                    ll.remove(num);
                    System.out.println("element is removed");
                }
                else if (str[0].equalsIgnoreCase("stop")) {
                    break;
                }
                else {
                    ll.add(num, str[0]);
                    System.out.println("element is added");
                }
            }
        }
    }
}
