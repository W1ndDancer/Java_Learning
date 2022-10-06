package javastudy.seminar5;

import java.util.ArrayList;
import java.util.List;
import java.util.TreeMap;

/*
Взять набор строк, например,Мороз и солнце день чудесный Еще ты дремлешь друг прелестный Пора красавица проснись.
Написать метод, который отсортирует эти строки по длине с помощью TreeMap. Строки с одинаковой длиной не должны “потеряться”.
 */

public class S5T4 {
    public static void main(String[] args) {
        System.out.println(verse("Взять набор строк, " +
                "например,Мороз и солнце день чудесный " +
                "Еще ты дремлешь друг прелестный" +
                "Пора красавица проснись." +
                "Написать метод, который отсортирует " +
                "эти строки по длине с помощью TreeMap." +
                "Строки с одинаковой длиной не должны “потеряться”."));

    }
    public static TreeMap<Integer, List<String>> verse(String str) {
        TreeMap<Integer, List<String>> treeMap = new TreeMap<>();
        String[] strArray = str.replaceAll("[,.]","").split(" ");
        for (String s : strArray) {
            int lenght = s.length();
            if (treeMap.containsKey(lenght)) treeMap.get(lenght).add(s);
            else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(s);
                treeMap.put(lenght, temp);
            }
        }
        return treeMap;
    }
}
