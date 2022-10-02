package javastudy.Seminar3;

import java.util.ArrayList;

/*
Создать список типа ArrayList<Object>.
Поместить в него как строки, так и целые числа.
Пройти по списку, найти и удалить целые числа.
 */
public class S3T3 {
    public static void main(String[] args) {
        ArrayList<Object> list = new ArrayList<>();
        list.add("kj");
        list.add(1);
        list.add("xxxx");
        list.add("sdc");
        list.add("kj");
        list.add(13);
        list.add("LL");
        list.add(1);

        int i = 0;
        while (i < list.size()){
            if (list.get(i) instanceof Number) list.remove(i);
            else i++;
        }
        System.out.println(list);
    }
}
