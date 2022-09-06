import java.util.Arrays;
import java.util.Random;
import java.util.Scanner;

public class task1 {
    /*
    1. Задан массив, например, nums = [1,7,3,6,5,6].
    Написать программу, которая найдет индекс i для этого массива такой,
    что сумма элементов с индексами < i равна сумме элементов с индексами > i.
     */
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.print("Size: ");
        int size = Integer.parseInt(iScanner.nextLine());

        int[] nums = CreateArray(size);
        System.out.println("Ur array: " + Arrays.toString(nums));

        int result = FindIndex(nums);

        if (result == -1) System.out.print("There is no needed index");
        else System.out.println("Index is: " + result);
    }
    public static int FindIndex(int[] arr) {
        int sumBefore = 0;
        int sumAfter = 0;
        int index = -1;
        for (int i = 1; i < arr.length - 1; i++) {
            for (int j = 0; j < arr.length; j++) {
                if (j < i) sumBefore += arr[j];
                else if (j > i) sumAfter += arr[j];
            }
            if (sumBefore == sumAfter) index = i;
            sumBefore = 0;
            sumAfter = 0;
        }
        return index;
    }

    public static int[] CreateArray(int size) {
        Random rand = new Random();
        int []arr = new int[size];
        for (int i = 0; i < size; i++) {
            arr[i] = rand.nextInt(11);
        }
        return arr;
    }
}

