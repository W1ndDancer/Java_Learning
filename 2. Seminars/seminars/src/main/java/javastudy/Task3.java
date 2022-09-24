package javastudy;

public class Task3 {
    public static void main(String[] args) {
        String word = "qwe wert ertz rtzui";
        String[] arrword = word.split(" ");
        StringBuilder newWord = new StringBuilder("");
        for (int i = arrword.length - 1; i >= 0; i--) {
            if (i == 0)
                newWord.append(arrword[i]);
            else
                newWord.append(arrword[i] + " ");
        }
        System.out.println(newWord);
    }
}
