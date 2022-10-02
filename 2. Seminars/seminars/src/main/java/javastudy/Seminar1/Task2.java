package javastudy.Seminar1;

public class Task2 {
    public static void main(String[] args) {
        int[] arr = {1,1,0,0,1,1,1,1,0,1,1,1};
        int count = 0;
        int countMax = 0;
        for (int i = 0; i < arr.length; i++) {
            if (arr[i]==1)
                count++;
            else if (arr[i]==0 || i == arr.length-1) {
                if (count > countMax)
                    countMax = count;
                count = 0;
            }
        }
        System.out.println(countMax);
    }
}
