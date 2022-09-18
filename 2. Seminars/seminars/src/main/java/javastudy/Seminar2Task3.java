package javastudy;

public class Seminar2Task3 {
    public static void main(String[] args) {
        String str = "asdfdsa";
        for (int i = 0; i < str.length()/2; i++) {
            if (str.charAt(i) != str.charAt(str.length() - 1 - i)) {
                System.out.print("not palindrome");
                return;
            }
        }
        System.out.print("Palindrome");
    }
}
