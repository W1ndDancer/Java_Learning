package javastudy.Seminar6;

import java.util.*;

/*
1. Создайте HashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
2. Создайте LinkedHashSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
3. Создайте TreeSet, заполните его следующими числами: {1, 2, 3, 2, 4, 5, 6, 3}. Распечатайте содержимое данного множества.
 */
public class S6T0 {
    public static void main(String[] args) {
        Set<Integer> hset = new HashSet<>(List.of(1, 4, 3, 2, 9, 5, 6, 3));
        for (Integer i: hset) {
            System.out.print(i + "; ");
        }
        System.out.println();
        Set<Integer> lhset = new LinkedHashSet<>(List.of(1, 4, 3, 2, 9, 5, 6, 3));
        for (Integer i: lhset) {
            System.out.print(i + "; ");
        }
        System.out.println();
        Set<Integer> treeset = new TreeSet<>(List.of(1, 4, 3, 2, 9, 5, 6, 3));
        for (Integer i: treeset) {
            System.out.print(i + "; ");
        }
    }
}
