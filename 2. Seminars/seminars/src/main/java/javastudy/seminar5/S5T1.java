package javastudy.seminar5;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

/*
Создать структуру для хранения Номеров паспортов и Фамилий сотрудников организации.
123456 Иванов
321456 Васильев
234561 Петрова
234432 Иванов
654321 Петрова
345678 Иванов
Вывести данные по сотрудникам с фамилией Иванов.
 */
public class S5T1 {

    public static Map<Integer, String> passes = Map.of(123456,  "Иванов",
            321456, "Васильев",
            234561, "Петрова",
            234432, "Иванов",
            654321, "Петрова ",
            345678, "Иванов");

    public static Map<String, List<Integer>> surnames = Map.of("Иванов",List.of(123456,234432,345678),
            "Васильев",List.of(12,23,34),
            "Петрова",List.of(56,4432));

    public static void main(String[] args) {
        ShowPasses1("Иванов");
        ShowPasses2("Иванов");
    }

    public static void ShowPasses1 (String surname) {
        var entries = passes.entrySet();
        for (Map.Entry<Integer, String> entry : entries) {
            if(entry.getValue().equals("Иванов")) System.out.println(entry.getKey());
        }
    }

    public static void ShowPasses2 (String surname) {
        System.out.println(surnames.get(surname));
    }
}
