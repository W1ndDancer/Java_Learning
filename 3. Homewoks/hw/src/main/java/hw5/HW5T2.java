package hw5;

import java.util.*;

/*
Пусть дан список сотрудников:
Иван Иванов
Иван Мечников
Иван Ежов
Иван Юрин
Светлана Петрова
Кристина Белова
Анна Мусина
Анна Крутова
Анна Владимирова
Петр Петин
Петр Лыков
Петр Чернышов
Павел Чернов
Мария Федорова
Мария Савина
Мария Рыкова
Марина Лугова
Марина Светлова

Написать программу, которая найдет и выведет повторяющиеся имена с количеством повторений. Отсортировать по убыванию популярности.
 */
public class HW5T2 {

    public static Map<Integer, List<String>> Sort(Map<String, List<String>> mapToSort) {
        Map<Integer, List<String>> sortedMap = new TreeMap<>(Collections.reverseOrder());
        for (var item : mapToSort.entrySet()) {
            int repeatamount = item.getValue().size();
            if (sortedMap.containsKey(repeatamount)) sortedMap.get(repeatamount).add(item.getKey());
            else {
                ArrayList<String> temp = new ArrayList<>();
                temp.add(item.getKey());
                sortedMap.put(item.getValue().size(), temp);
            }
        }
        return sortedMap;
    }

        public static void main (String[]args){
            Map<String, List<String>> workers = new HashMap<>();
            workers.put("Иван", List.of("Иванов", "Мечников", "Ежов", "Юрин"));
            workers.put("Светлана", List.of("Петрова"));
            workers.put("Кристина", List.of("Белова"));
            workers.put("Анна", List.of("Мусина", "Крутова", "Владимирова"));
            workers.put("Петр", List.of("Петин", "Лыков", "Чернышов"));
            workers.put("Павел", List.of("Чернов"));
            workers.put("Мария", List.of("Федорова", "Савина", "Рыкова"));
            workers.put("Марина", List.of("Светлова", "Лугова"));

            System.out.println(Sort(workers));
        }
}
