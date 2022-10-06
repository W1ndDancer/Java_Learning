package javastudy.Seminar6;

import java.util.*;

/*
1. Напишите метод, который заполнит массив из 1000 элементов случайными цифрами от 0 до 24.
2. Создайте метод, в который передайте заполненный выше массив и с помощью Set вычислите процент уникальных значений в
данном массиве и верните его в виде числа с плавающей запятой.
Для вычисления процента используйте формулу:
процент уникальных чисел = количество уникальных чисел * 100 / общее количество чисел в массиве.
 */
public class S6T1 {
    public static Integer[] FillArray(int size) {
        Integer[] array = new Integer[size];
        Random rnd = new Random();
        for (int i = 0; i < size; i++) {
            array[i] = rnd.nextInt(0, 25);
        }
        return array;
    }

    public static double FindPercentOfUniqNumbers(Integer[] array) {
        Set<Integer> temp = new HashSet<>(List.of(array));
        return (temp.size()*100.0) / array.length;
    }

    public static void main(String[] args) {
        Integer[] arr = FillArray(10000);
        System.out.println(FindPercentOfUniqNumbers(arr));
    }
}
