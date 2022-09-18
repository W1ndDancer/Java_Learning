package javastudy;

public class Seminar2Task1 {
        public static void main(String[] args) {
            int n = 8;
            char c1 = 'a';
            char c2 = 'b';
            StringBuilder result = new StringBuilder();
            for (int i = 0; i < n ; i++) {
                if (i % 2 == 0) result.append(c1);
                else result.append(c2);
            }
            System.out.print(result);
        }
}
