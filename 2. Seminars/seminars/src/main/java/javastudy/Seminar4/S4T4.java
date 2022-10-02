package javastudy.Seminar4;

import java.util.LinkedList;

/*
1) Написать метод, который принимает массив элементов, помещает их в стэк и выводит на консоль содержимое стэка.
2) Написать метод, который принимает массив элементов, помещает их в очередь и выводит на консоль содержимое очереди.
 */
public class S4T4 {
    public static void main(String[] args) {
        Object[] obj = {1,2,3,4,5,6,7,8,9,10};
        AddStack(obj);
        System.out.println("----");
        AddQueue(obj);
    }
    public static void AddStack(Object[] obj) {
        LinkedList<Object> lobj = new LinkedList<>();
        for (Object o: obj) {
            lobj.push(o);
        }
        System.out.println(lobj);
        lobj.pop();
        System.out.println(lobj);
    }
    public static void AddQueue(Object[] obj) {
        LinkedList<Object> lqueue = new LinkedList<>();
        for (Object o: obj) {
            lqueue.offer(o);
        }
        System.out.println(lqueue);
        lqueue.poll();
        System.out.println(lqueue);
    }
}
