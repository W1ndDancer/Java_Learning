package EXCEPTIONS_HW2;

//Если необходимо, исправьте данный код (задание 2)
/* try {
   int d = 0;
   double catchedRes1 = intArray[8] / d;
   System.out.println("catchedRes1 = " + catchedRes1);
} catch (ArithmeticException e) {
   System.out.println("Catching exception: " + e);
}
*/
public class Task2 {
    public static void main(String[] args) {
            int d = 0;
            int[] intArray = new int[8];
            for (int num : intArray) {
                try {
                    int catchedRes1 = num / d;
                    System.out.println("catchedRes1 = " + catchedRes1);
                } catch (ArithmeticException ex) {
                    System.out.println("Catching exception: " + ex);
                }
            }

        }
    }
