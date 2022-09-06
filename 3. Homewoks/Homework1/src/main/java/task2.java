import java.util.Arrays;
import java.util.Scanner;

public class task2 {
    /*
    2. Напишите функцию, для поиска наиболее длинного общего префикса, среди массива строк.
    Если общего префикса нет, то возвращать пустую строку.
    Пример ["aabb", "aabbb", "aaabb"] - ответ "aa"
     */
    public static void main(String[] args) {
        String[] arr = CreateArray();
        System.out.println("Ur array: " + Arrays.toString(arr));
        String result = String.valueOf(FindPrefix(arr));
        System.out.println("Common prefix is: " + result);
    }
    public static String[] CreateArray() {
        Scanner iScanner = new Scanner(System.in);
        String[] arr = new String[5];
        for (int i = 0; i < 5; i++) {
            System.out.print("element " + (i+1) + ": ");
            arr[i] = iScanner.nextLine();
        }
        return arr;
    }
    public static StringBuilder FindPrefix(String[] arr) {
        char prefix = arr[0].charAt(0);
        int countMin = 0;
        int count = 0;
        StringBuilder ans = new StringBuilder();;
        for (String i : arr) {
            for (int j = 0; j < i.length(); j++) {
                if (i.charAt(j) == prefix) {
                    count++;
                    if (i.charAt(j) != i.charAt(j + 1)) break;
                } else if (i.charAt(0) != prefix) {
                    countMin = -1;
                    break;
                }
            }
            if (countMin == 0 || countMin > count) {
                countMin = count;
            }
            count = 0;
        }
        if (countMin == -1) return ans;
        else ans.append(String.valueOf(prefix).repeat(Math.max(0, countMin)));
        return ans;
    }
}
