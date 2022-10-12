package javastudy.OOPSeminar.OOPSeminar2;

import java.util.Iterator;

public class StringEvenIterator implements Iterable<Character>{

    private final String string;

    public StringEvenIterator(String string) {
        this.string = string;
    }

    @Override
    public Iterator<Character> iterator() {
        return new Iterator<>() {
            private int counter = 0;
            @Override
            public boolean hasNext() {
                return counter < string.length() ;
            }
            @Override
            public Character next() {
                char ch = string.charAt(counter);
                counter+=2;
                return ch ;
            }
        };
    }

    public static void main(String[] args) {
        StringEvenIterator exmpl = new StringEvenIterator("Valerij");
        for(Character each: exmpl){
            System.out.println(each);
        }
    }
}
