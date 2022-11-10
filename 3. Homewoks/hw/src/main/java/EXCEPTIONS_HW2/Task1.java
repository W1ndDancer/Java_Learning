package EXCEPTIONS_HW2;

/*
Реализуйте метод, который запрашивает у пользователя ввод дробного числа (типа float),
и возвращает введенное значение. Ввод текста вместо числа не должно приводить к падению приложения,
вместо этого, необходимо повторно запросить у пользователя ввод данных.
 */

import java.util.InputMismatchException;
import java.util.Scanner;

public class Task1 {
    public static void main(String[] args) {
        System.out.println(returnFloat());
    }
    public static float returnFloat() {
        float num;
        while (true){
            System.out.println("Input float number");
            try {
                return new Scanner(System.in).nextFloat();
            } catch (InputMismatchException ex) {
                System.out.println("U should enter float number. Try again!");
            }
        }
    }
}
