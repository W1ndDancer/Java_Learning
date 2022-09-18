package javastudy;

import java.io.*;
import java.util.Arrays;
/*
File file = new File("/Users/aleks/dev/geek-java-basics/file.txt");
        try (BufferedReader br = new BufferedReader(new FileReader(file))) {
        br.readLine();
        } catch (IOException ex) {
        System.out.println(ex.getLocalizedMessage());
        }

        try (PrintWriter wr = new PrintWriter(file)) {
        wr.println("aaa");
        } catch (IOException ex) {
        System.out.println(ex.getLocalizedMessage());
        }
*/
/*
public class Seminar2Task4 {
    public static void main(String[] args) {
        File file = new File("/Users/wind/Desktop/Study/7. Java/2. Seminars/seminars/src/main/java/javastudy/file.txt");
        try (PrintWriter wr = new PrintWriter(file)) {
            wr.println("file+".repeat(100));
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
 */

public class Seminar2Task4 {
    public static void main(String[] args) {
        File file = new File("/Users/wind/Desktop/Study/7. Java/2. Seminars/seminars/src/main/java/javastudy/file.txt");
        File showFiles = new File("/Users/wind/Desktop/Study/7. Java/2. Seminars/seminars/src/main/java/javastudy/");
        File[] listFiles = showFiles.listFiles();
        try (PrintWriter wr = new PrintWriter(file)) {
            assert listFiles != null;
            for (File f: listFiles) {
                wr.println(f);
            }
        } catch (IOException ex) {
            System.out.println(ex.getLocalizedMessage());
        }
    }
}
