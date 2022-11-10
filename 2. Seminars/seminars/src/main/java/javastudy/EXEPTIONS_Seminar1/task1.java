package javastudy.EXEPTIONS_Seminar1;

//Реализуйте метод, принимающий в качестве аргумента целочисленный массив и некоторое значение.
//Метод ищет в массиве заданное значение и возвращает его индекс. При этом, например:
//если длина массива меньше некоторого заданного минимума, метод возвращает -1, в качестве кода ошибки.
//если искомый элемент не найден, метод вернет -2 в качестве кода ошибки.
//если вместо массива пришел null, метод вернет -3

public class task1 {
    static final int MIN_LENGTH = 12;
    public static void main(String[] args) {
        int[] array = new int[10];
        System.out.println(findindexofnumb(array, 5));;
    }

    public static int findindexofnumb(int[] array, int num){
        if (array == null) {
            throw new RuntimeException("Array is null");
        }
        else if (array.length< MIN_LENGTH) {
            throw new RuntimeException("Array length is too small");
        }
        for (int i = 0; i < array.length; i++) {
            if (array[i] == num) {
                return i;
            }
        }
        throw new RuntimeException("Num is not found in Array");
    }
}
