package EXCEPTIONS_HW1;

//Реализуйте метод, принимающий в качестве аргументов два целочисленных массива,
//и возвращающий новый массив, каждый элемент которого равен частному элементов
//двух входящих массивов в той же ячейке. Если длины массивов не равны, необходимо
//как-то оповестить пользователя. Важно: При выполнении метода единственное исключение,
//которое пользователь может увидеть - RuntimeException, т.е. ваше.

import java.util.Arrays;

public class Task2{
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        int[] arr2 = {1, 0, 3, 4, 5, 6, 7, 8, 9};
        int[] arrDiv = divOfArr(arr1, arr2);
        System.out.println(Arrays.toString(arrDiv));
    }

    private static int[] divOfArr(int[] arr1, int[] arr2) {
        if (arr1 == null || arr2 == null){
            throw new RuntimeException("Some array is null");
        }
        if (arr1.length != arr2.length){
            throw new RuntimeException("Arrays lengths aren't equal");
        }
        int[] arr = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            if (arr2[i] == 0) {
                throw new RuntimeException("Divide by 0 exception. Some element of  second array is 0");
            }
            arr[i] = arr1[i] / arr2[i];
        }
        return arr;
    }
}

