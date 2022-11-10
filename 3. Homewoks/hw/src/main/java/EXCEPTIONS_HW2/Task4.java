package EXCEPTIONS_HW2;

/*
Разработайте программу, которая выбросит Exception, когда пользователь вводит пустую строку.
 Пользователю должно показаться сообщение, что пустые строки вводить нельзя
 */

import java.util.Scanner;

public class Task4 {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter something");
        String msg = scn.nextLine();
        if (msg.equals("")){
           throw new RuntimeException("U cant enter empty string");
        }
        else {
            System.out.println(msg);
        }
    }
}
