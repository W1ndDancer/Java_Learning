package OOPHW3;

import java.util.Iterator;
import java.util.Random;

/*
1. Написать итератор, который будет выдавать N случайных целых чисел
 */
public class RandomIterator implements Iterable<Integer>{

    private final int numberOfIterations;
    public RandomIterator(int numberOfIterations) {
        this.numberOfIterations = numberOfIterations;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            final Random rnd = new Random();
            private final int end = numberOfIterations;
            private int counter = 0;
            private int value;

            @Override
            public boolean hasNext() {
                return counter < end;
            }
            @Override
            public Integer next() {
                counter++;
                return value = rnd.nextInt(100);
            }
        };
    }

    public static void main(String[] args) {
        RandomIterator it = new RandomIterator(5);
        for (Integer each: it){
            System.out.println(each);
        }
    }
}
