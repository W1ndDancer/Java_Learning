package javastudy.Seminar3;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/*
Заполнить список десятью случайными числами.
Отсортировать список методом sort() и вывести его на экран.
 */
public class S3T1 {
    public static void main(String[] args) {
        ArrayList<Integer> list1 =new ArrayList<>(10);
        Random rnd = new Random();
        for (int i = 0; i < 10; i++) list1.add(i, rnd.nextInt(0,11));
        list1.sort(Comparator.naturalOrder());
        System.out.println(list1);
    }
}
