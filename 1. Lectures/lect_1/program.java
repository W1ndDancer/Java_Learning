import java.io.*;

public class program {

    /*
     * import java.util.Scanner; импорт сверху
     * // Ввод - ввыод инфы через терминал
     * public static void main(String[] args) {
     * Scanner iScanner = new Scanner(System.in);
     * System.out.printf("name: ");
     * String name = iScanner.nextLine();
     * System.out.printf("Привет, %s!", name);
     * iScanner.close();
     * }
     * 
     * public static void main(String[] args) {
     * Scanner iScanner = new Scanner(System.in);
     * System.out.printf("int a: ");
     * int x = iScanner.nextInt();
     * System.out.printf("double a: ");
     * double y = iScanner.nextDouble();
     * System.out.printf("%d + %f = %.2f", x, y, x + y);
     * iScanner.close();
     * }
     * 
     * // Проверка на воод нужного типа данных
     * public static void main(String[] args) {
     * Scanner iScanner = new Scanner(System.in);
     * System.out.printf("int a: ");
     * boolean flag = iScanner.hasNextInt();
     * System.out.println(flag);
     * int i = iScanner.nextInt();
     * System.out.println(i);
     * iScanner.close();
     * }
     */

    // Форматированный вывод
    // public static void main(String[] args) {
    // int a = 1, b = 2;
    // int c = a + b;
    // String res = a + " + " + b + " = " + c;
    // System.out.println(res);
    // }

    // public static void main(String[] args) {
    //     int a = 1, b = 2;
    //     int c = a + b;
    //     String res = String.format("%d + %d = %d \n", a, b, c);
    //     System.out.printf("%d + %d = %d \n", a, b, c);
    //     System.out.println(res);
    // }

    // do while

    // public static void main(String[] args) {
    //     int value = 321;
    //     int count = 0;

    //     do {
    //         value /= 10;
    //         count++;
    //     } while (value != 0);
    //     System.out.println(count);
    // }

    // Работа с файлами. Запись и чтение
    // import java.io.FileWriter;
    // import java.io.IOException;
    // import java.io.*; на чтение

    // public static void main(String[] args) {
    //     try (FileWriter fw = new FileWriter("file.txt", false)) {
    //         fw.write("line 1");
    //         fw.append('\n');
    //         fw.append('2');
    //         fw.append('\n');
    //         fw.write("line 3");
    //         fw.flush();
    //     } catch (IOException ex) {
    //         System.out.println(ex.getMessage());
    //     }
    // }

    // Посимвольно считать

    // public static void main(String[] args) throws Exception {
    //     FileReader fr = new FileReader("file.txt");
    //     int c;
    //     while ((c = fr.read()) != -1) {
    //         char ch = (char) c;
    //         if (ch == '\n') {
    //             System.out.print(ch);
    //         } else {
    //             System.out.print(ch);
    //         }
    //     }
    // } 

    // Построчно считать
        public static void main(String[] args) throws Exception {
            BufferedReader br = new BufferedReader(new FileReader("file.txt"));
            String str;
            while ((str = br.readLine()) != null) {
                System.out.printf("== %s ==\n", str);
            }
            br.close();
        }

}
