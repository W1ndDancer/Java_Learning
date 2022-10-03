package hw6;

import java.util.*;

/*
Подумать над структурой класса Ноутбук для магазина техники - выделить поля и методы. Реализовать в java.
Создать множество ноутбуков.
Написать метод, который будет запрашивать у пользователя критерий (или критерии) фильтрации и выведет ноутбуки,
отвечающие фильтру. Критерии фильтрации можно хранить в Map. Например:
“Введите цифру, соответствующую необходимому критерию:
1 - ОЗУ
2 - Объем ЖД
3 - Операционная система
4 - Цвет …
Далее нужно запросить минимальные значения для указанных критериев - сохранить параметры фильтрации можно также в Map.
Отфильтровать ноутбуки их первоначального множества и вывести проходящие по условиям.
 */
public class hw6 {
    public static void main(String[] args) {
        Set<Notebook> notebookSet = new HashSet<>();
        notebookSet.add(new Notebook(1, "apple", "macbook air", 1200, "M1", "8 core", "13,3", 8 , 256, "white"));
        notebookSet.add(new Notebook(2, "apple", "macbook air", 1300, "M1", "8 core", "13,3", 8, 256, "gray"));
        notebookSet.add(new Notebook(3, "apple", "macbook pro", 2800, "M2 pro", "16 core", "14,2", 16, 512, "white"));
        notebookSet.add(new Notebook(4, "lenovo", "legion 5", 1200, "AMD Ryzen 5 5600H 3.3", "NVIDIA GeForce GTX 1650", "15,6", 4, 512, "gray"));
        notebookSet.add(new Notebook(5, "lenovo", "Idea pad 3", 600, "AMD Ryzen 5 5500U 2.1", "AMD Radeon Graphics", "15,6", 8, 512, "arctic grey"));
        notebookSet.add(new Notebook(6, "hp", "victus", 1250, "AMD Ryzen 7 5800H", "NVIDIA GeForce RTX 3060", "16,1", 16, 512, "black"));
        notebookSet.add(new Notebook(7, "hp", "victus limited edition", 1300, "AMD Ryzen 7 5800H", "NVIDIA GeForce RTX 3060", "16,+", 16, 512, "white"));
        notebookSet.add(new Notebook(8, "hp", "ProBook", 1000, "AMD Ryzen 5 5600U", "AMD Radeon Graphics", "15,6", 512, 16, "silver"));
        notebookSet.add(new Notebook(9, "razer", "blade 15", 3300, "Intel Core i7-10750H", "NVIDIA GeForce RTX 3060", "15,6", 16, 512, "black"));
        notebookSet.add(new Notebook(10, "msi", "pulse", 1900, "Intel Core i7-11800H", "NVIDIA GeForce RTX 3070", "15,6", 16, 512, "black"));

        ShowNotebooksByFilter(notebookSet);
        }

    private static boolean isNumber(String s) throws NumberFormatException {
        try {
            Integer.parseInt(s);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
    }

    public static void ShowNotebooksByFilter(Set<Notebook> notebookSet) {
        Set<String> savedFilters = new HashSet<>();
        Scanner scn = new Scanner(System.in);
        StringBuilder res = new StringBuilder();
        String minPrice = "0";
        String minRAM = "0";
        String minSSD = "0";
        String ans = "y";
        List<String>correctAns = List.of("y", "n", "yes", "no");
        List<String>correctParams = List.of("1", "2", "3", "4", "5", "6", "7", "8", "9");

        System.out.println(
                "To filter notebooks enter the number corresponding to the desired filter:\n" +
                        "1. id\n" +
                        "2. Brand\n" +
                        "3. Model\n" +
                        "4. Price\n" +
                        "5. CPU\n" +
                        "6. GPU\n" +
                        "7. Screen diagonal\n" +
                        "8. RAM\n" +
                        "9. SSD\n" +
                        "10. Colour");
        while (!(ans.equals("n") || ans.equals("no"))) {
            System.out.print("Enter the number corresponding to the desired filter: ");
            String param = scn.nextLine();
            if (correctParams.contains(param)) {
                savedFilters.add(param);
                if (param.equals("4")) {
                    System.out.println("For price U can enter min value.\n" +
                            "Lets do this?");
                    ans = scn.nextLine();
                    while (!correctAns.contains(ans)) {
                        System.out.print("Answer must be in: y, yes, n, no. Try again. ");
                        ans = scn.nextLine().toLowerCase();
                    }
                    if (ans.equals("yes") || ans.equals("y")) {
                        System.out.print("Enter min value for a price: ");
                        minPrice = scn.nextLine();
                        while (!isNumber(minPrice)) {
                            System.out.print("Price must be an integer number: ");
                            minPrice = scn.nextLine();
                        }
                    }
                }
                if (param.equals("8")) {
                    System.out.println("For RAM U can enter min value.\n" +
                            "Lets do this?");
                    ans = scn.nextLine();
                    while (!correctAns.contains(ans)) {
                        System.out.print("Answer must be in: y, yes, n, no. Try again. ");
                        ans = scn.nextLine().toLowerCase();
                    }
                    if (ans.equals("yes") || ans.equals("y")) {
                        System.out.print("Enter min value for RAM capacity: ");
                        minRAM = scn.nextLine();
                        while (!isNumber(minRAM)) {
                            System.out.print("RAM capacity must be an integer number: ");
                            minRAM = scn.nextLine();
                        }
                    }
                }
                if (param.equals("9")) {
                    System.out.println("For SSD U can enter min value.\n" +
                            "Lets do this?");
                    ans = scn.nextLine();
                    while (!correctAns.contains(ans)) {
                        System.out.print("Answer must be in: y, yes, n, no. Try again. ");
                        ans = scn.nextLine().toLowerCase();
                    }
                    if (ans.equals("yes") || ans.equals("y")) {
                        System.out.print("Enter min value for SSD capacity: ");
                        minSSD = scn.nextLine();
                        while (!isNumber(minSSD)) {
                            System.out.print("Capacity must be an integer number: ");
                            minSSD = scn.nextLine();
                        }
                    }
                }
                System.out.print("Do u wanna add one more parameter for a filter? ");
            }
            else {
                System.out.print("Wrong parameter. This parameter isn't added. Try again? ");
            }
            ans = scn.nextLine().toLowerCase();
            if (!correctAns.contains(ans)) {
                while (!correctAns.contains(ans)) {
                    System.out.print("Answer must be in: y, yes, n, no. Try again. ");
                    ans = scn.nextLine().toLowerCase();
                }
            }
        }

        for (Notebook i : notebookSet) {
            for (String j: savedFilters) {
                if(j.equals("1")
                        && (i.getPrice() >= Integer.parseInt(minPrice))
                        && (i.getRam() >= Integer.parseInt(minRAM))
                        && (i.getSsd() >= Integer.parseInt(minSSD))) {
                    res.append("ID: << ").append(i.getId()).append(" >> ");
                }
                else if(j.equals("2")
                        && (i.getPrice() >= Integer.parseInt(minPrice))
                        && (i.getRam() >= Integer.parseInt(minRAM))
                        && (i.getSsd() >= Integer.parseInt(minSSD))) {
                    res.append("Brand: << ").append(i.getBrand()).append(" >> ");
                }
                else if(j.equals("3")
                        && (i.getPrice() >= Integer.parseInt(minPrice))
                        && (i.getRam() >= Integer.parseInt(minRAM))
                        && (i.getSsd() >= Integer.parseInt(minSSD))) {
                    res.append("Model: << ").append(i.getModel()).append(" >> ");
                }
                else if(j.equals("4")
                        && (i.getPrice() >= Integer.parseInt(minPrice))
                        && (i.getRam() >= Integer.parseInt(minRAM))
                        && (i.getSsd() >= Integer.parseInt(minSSD))) {
                    res.append("Price: << ").append(i.getPrice()).append("$ >> ");
                }
                else if(j.equals("5")
                        && (i.getPrice() >= Integer.parseInt(minPrice))
                        && (i.getRam() >= Integer.parseInt(minRAM))
                        && (i.getSsd() >= Integer.parseInt(minSSD))) {
                    res.append("CPU: << ").append(i.getCpu()).append(" >> ");
                }
                else if(j.equals("6")
                        && (i.getPrice() >= Integer.parseInt(minPrice))
                        && (i.getRam() >= Integer.parseInt(minRAM))
                        && (i.getSsd() >= Integer.parseInt(minSSD))) {
                    res.append("GPU: << ").append(i.getVideo()).append(" >> ");
                }
                else if(j.equals("7")
                        && (i.getPrice() >= Integer.parseInt(minPrice))
                        && (i.getRam() >= Integer.parseInt(minRAM))
                        && (i.getSsd() >= Integer.parseInt(minSSD))) {
                    res.append("Screen diagonal: << ").append(i.getDiagonal()).append(" >> ");
                }
                else if(j.equals("8")
                        && (i.getPrice() >= Integer.parseInt(minPrice))
                        && (i.getRam() >= Integer.parseInt(minRAM))
                        && (i.getSsd() >= Integer.parseInt(minSSD))) {
                    res.append("RAM: << ").append(i.getRam()).append(" >> ");
                }
                else if(j.equals("9")
                        && (i.getPrice() >= Integer.parseInt(minPrice))
                        && (i.getRam() >= Integer.parseInt(minRAM))
                        && (i.getSsd() >= Integer.parseInt(minSSD))) {
                    res.append("SSD: << ").append(i.getSsd()).append(" >> ");
                }
                else if(j.equals("10")
                        && (i.getPrice() >= Integer.parseInt(minPrice))
                        && (i.getRam() >= Integer.parseInt(minRAM))
                        && (i.getSsd() >= Integer.parseInt(minSSD))) {
                    res.append("Colour: << ").append(i.getColor()).append(" >> ");
                }
            }
            if (!res.isEmpty()) {
                System.out.println(res);
                res.setLength(0);
            }
        }
    }

}
