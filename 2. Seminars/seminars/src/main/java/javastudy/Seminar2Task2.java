package javastudy;

public class Seminar2Task2 {
    public static void main(String[] args) {
        String str = "AaaaAAAbbbCCCjjjjSSssskK";
        StringBuilder result = new StringBuilder();
        int count = 1;
        for (int i = 0; i < str.length() - 1; i++) {
            if (str.charAt(i) == str.charAt(i+1)) count++;
            else if (str.charAt(i) != str.charAt(i+1)) {
                result.append(str.charAt(i));
                result.append(count);
                count = 1;
            }
            if (str.charAt(i) == str.charAt(i+1) && (i == str.length() - 2)) {
                result.append(str.charAt(i));
                result.append(count);
            }
            else if (str.charAt(i) != str.charAt(i+1) && (i == str.length() - 2)) {
                result.append(str.charAt(i + 1));
                result.append(1);
            }
        }
        System.out.println(result);
    }
}
