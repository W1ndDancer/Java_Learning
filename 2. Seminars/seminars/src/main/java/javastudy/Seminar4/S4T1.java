package javastudy.Seminar4;

import java.util.ArrayList;
import java.util.LinkedList;

public class S4T1 {
    public static void main(String[] args) {
        ArrayList<Integer> list = new ArrayList<>();
        LinkedList<Integer> list1 = new LinkedList<>();
        long t1 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list.add(list.size()/2, i);
        }
        System.out.println(System.currentTimeMillis() - t1);

        long t2 = System.currentTimeMillis();
        for (int i = 0; i < 100000; i++) {
            list1.add(list1.size()/2, i);
        }
        System.out.println(System.currentTimeMillis() - t2);
    }
}
