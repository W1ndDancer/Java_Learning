package javastudy;

import java.util.LinkedList;
import java.util.Scanner;

/*
Реализовать консольное приложение, которое:
Принимает от пользователя и “запоминает” строки.
Если введено print, выводит строки так, чтобы последняя введенная была первой в списке, а первая - последней.
Если введено revert, удаляет предыдущую введенную строку из памяти.
 */
public class S4T3 {
    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        LinkedList<String> llist = new LinkedList<>();

        while (true) {
            System.out.print("ent elem: ");
            String str = scn.nextLine();
            if (str.equalsIgnoreCase("print")) System.out.println("Ur list: " + llist);
            else if (str.equalsIgnoreCase("revert")) llist.pop();
            else if (str.equalsIgnoreCase("break")) break;
            else llist.push(str);
        }
    }
}
