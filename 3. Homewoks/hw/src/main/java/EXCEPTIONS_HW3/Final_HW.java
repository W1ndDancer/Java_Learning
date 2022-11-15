package EXCEPTIONS_HW3;

import java.io.FileWriter;
import java.io.IOException;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Final_HW {
    /**
     * Так как данные можно ввести в абсолютно произвольном порядке например: Имя / дата рождения / Фвмилия / Телефон / отчество / пол,
     * то я решил за необходимое ввести в программу своеобразную БД с именами, фамилиями и отчествами людей
     * иначе я не вижу способа определить какая строка имя, какая фамилия и какая отчество. И соответвенно выполнить поставленную
     * задачу будет невозможно, те назвать файл - фамилией и в самом файле ввести отсортированные данные: Фамилия имя отчество.
     * просто какое-то изменения для пул реквеста
     */
    private static final List<String> surnames= List.of("Ivanov","Petrov","Sidorov","Bobrov");
    private static final List<String> names= List.of("Ivan","Petr","Dmitriy","Oleg");
    private static final List<String> patronymics= List.of("Olegovich","Genadievich","Vasilievich","Michailovich");

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        System.out.println("Enter ur data: Full name, birthday(dd.mm.yyyy), phone number and sex(m or f).\n " +
                "U can enter the data in any order, but you must separate them with a space");
        String[] data = scn.nextLine().split(" ");
        if (data.length == 6) {
            String[] data1 = {"-1","-1","-1","-1","-1","-1"};
            for (String i: data){
                if (surnames.contains(i)) {
                    data1[0] = i;
                }
                if (names.contains(i)) {
                    data1[1] = i;
                }
                if (patronymics.contains(i)) {
                    data1[2] = i;
                }
                if (i.length() == 10 && (i.contains("."))) {
                    data1[3] = i;
                }
                if (isNumber(i)) {
                    data1[4] = i;
                }
                if (i.equals("m") || i.equals("f")) {
                    data1[5] = i;
                }
            }
            for (int i = 0; i < data1.length; i++) {
                if(data1[i].equals("-1")) {
                    switch (i) {
                        case 0 -> throw new RuntimeException("Ur surname is not in database. Pls extend database");
                        case 1 -> throw new RuntimeException("Ur name is not in database. Pls extend database");
                        case 2 -> throw new RuntimeException("Ur patronymic is not in database. Pls extend database");
                        case 3 -> throw new RuntimeException("Incorrect birthday format");
                        case 4 -> throw new RuntimeException("Incorrect phone number format");
                        case 5 -> throw new RuntimeException("Incorrect sex format");
                    }
                }
            }
            try (FileWriter writer = new FileWriter(String.format("%s.txt",data1[0]), true)){
                writer.write(Arrays.toString(data1)+"\n");
                writer.flush();
            } catch (IOException e) {
                e.printStackTrace();
            }
        }
        else if (data.length > 6){
            throw new RuntimeException("U entered too much information");
        }
        else {
            throw new RuntimeException("U entered too little information");
        }
    }

    public static boolean isNumber (String s) {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException ex) {
            return false;
        }
    }
}
