import java.util.*;

public class H3T2 {
    //2. Задан целочисленный список ArrayList. Найти минимальное, максимальное и среднее из этого списка.
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        Random rnd = new Random();
        StringBuilder res = new StringBuilder();

        for (int i = 0; i < 10; i++) list.add(rnd.nextInt(10));
        System.out.println("Genereted list: " + list);
        int max = Collections.max(list);
        int min = Collections.min(list);
        double sum = 0;
        for (int i: list) {
            sum+=i;
        }
        double avr = sum/list.size();
        System.out.println(res.append("max: ").append(max).append("\n").append("min: ").append(min).append("\n").append("avr: ").append(avr));
    }
}
