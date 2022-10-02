package hw3;

import java.util.ArrayList;
import java.util.Random;

public class H3T1 {
    //1. Пусть дан произвольный список целых чисел, удалить из него четные числа
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        int count = 0;

        for (int i = 0; i < 10; i++) list.add(rnd.nextInt(10));
        System.out.println("Genereted list: " + list);

        while (count < list.size()){
            if (list.get(count)%2 == 0) list.remove(count);
            else count++;
        }
        System.out.println("Result: " + list);
    }
}
