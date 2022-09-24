package javastudy;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.Random;

/*
1.Заполнить список названиями планет с повторениями. Пройтись по списку и вывести название планеты и количество повторений.
2. Пройтись по списку еще раз и удалить повторения.
Меркурий, Венера, Земля, Марс, Юпитер, Сатурн, Уран, Нептун
 */
public class S3T2 {
    public static void main(String[] args) {
        int count = 0;
        Random rnd = new Random();
        StringBuilder res = new StringBuilder();
        String[] plan = {"Меркурий", "Венера", "Земля", "Марс", "Юпитер", "Сатурн", "Уран", "Нептун"};
        ArrayList<String> planets = new ArrayList<>();

        for (int i = 0; i < 10 ; i++) planets.add(i, plan[rnd.nextInt(0, 8)]);

        planets.sort(Comparator.naturalOrder());
        System.out.println(planets);

        for (int i = 0; i < planets.size()-1; i++) {
            count++;
            if (!planets.get(i).equals(planets.get(i+1))) {
                res.append(planets.get(i)).append("  -> ").append(count);
                System.out.println(res);
                res.setLength(0);
                count = 0;
            }
        }
        res.append(planets.get(planets.size()-1)).append(" -> ").append(count +1);
        System.out.println(res);

        int i = 0;
        while (i < planets.size() - 1){
            if (planets.get(i).equals(planets.get(i+1))) planets.remove(i);
            else i++;
        }
        System.out.println(planets);
    }
}
