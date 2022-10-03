package hw5;

/*
1. Реализуйте структуру телефонной книги с помощью HashMap, учитывая, что 1 человек может иметь несколько телефонов.
 */

import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class HW5T1 {
    public static Map<String, List<Integer>> telBook = Map.of(
            "Иван Иванов", List.of(123, 234),
            "Петька", List.of(345, 456, 567),
            "Олег Работа", List.of(678),
            "Елена Васильевна", List.of(789, 890, 987),
            "Дмитрий", List.of(876));

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.print("Введите фамилию для поиска в тел. книге: ");
        String name = scn.nextLine();
        if (telBook.containsKey(name)) System.out.println("ФИО: " + name + "\nНомера телефонов: " + telBook.get(name));
        else System.out.println("Данного человека нет в телефонном справочнике");
    }
}
