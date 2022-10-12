package javastudy.OOPSeminar.OOPSeminar2;

import java.util.Iterator;

public class IterableIterator implements Iterable<Integer>{

    private final int start;
    private final int end;

    public IterableIterator(int start, int end) {
        this.start = start;
        this.end = end;
    }

    @Override
    public Iterator<Integer> iterator() {
        return new Iterator<>() {
            private int counter = start;
            @Override
            public boolean hasNext() {
                return counter <= end;
            }

            @Override
            public Integer next() {
                return counter++;
            }
        };
    }

    public static void main(String[] args) {
        IterableIterator it = new IterableIterator(1,10);
        for (Integer each: it){
            System.out.println(each);
        }
    }

}
