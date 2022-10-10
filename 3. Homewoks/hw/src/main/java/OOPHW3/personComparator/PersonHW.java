package OOPHW3.personComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/*
2. Для класса Person, рассмотренного на уроке написать миниму три реализации интерфейса Comparable,
 которые будут сортровать набор экземпляров класса Person по разным наборам полей
 */

public class PersonHW implements Comparable<PersonHW>{
    String name;
    int age;
    int weight;
    int height;

    public PersonHW(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return  "name ='" + name +
                ", age = " + age +
                ", weight = " + weight +
                ", height = " + height;
    }

    //Первая реализация метода compare.
    /*
    @Override
    public int compareTo(PersonHW o) {
        if (this.name.compareTo(o.name) == 0){
            if (this.age == o.age){
                if (this.weight == o.weight){
                    return Integer.compare(this.height,o.height);
                }
                return Integer.compare(this.weight,o.weight);
            }
            return Integer.compare(this.age, o.age);
        }
        return this.name.compareTo(o.name);
    }
    */

    //Вторая реализация метода compare
    /*
    @Override
    public int compareTo(PersonHW o) {
        return Integer.compare(this.age, o.age);
    }
    */
    //Третья реализация метода compare
    /*
    @Override
    public int compareTo(PersonHW o) {
        if (this.age == o.age){
            if (this.weight == o.weight){
                return Integer.compare(this.height,o.height);
            }
            return Integer.compare(this.weight,o.weight);
        }
        return Integer.compare(this.age, o.age);
    }
     */

    //Четвертая реализация метода compare
    @Override
    public int compareTo(PersonHW o) {
        if(o.height == this.height){
            if(o.weight == this.weight){
                if(o.age == this.age) {
                    return o.name.compareTo(this.name);
                }
                return Integer.compare(o.age,this.age);
            }
            return Integer.compare(o.weight,this.weight);
        }
        return Integer.compare(o.height,this.height);
    }

    public static void main(String[] args) {
        ArrayList<PersonHW> ppls = new ArrayList<>();
        ppls.add(new PersonHW("Борис",12, 40,150));
        ppls.add(new PersonHW("Василий",18, 66,165));
        ppls.add(new PersonHW("Елена",14, 50,160));
        ppls.add(new PersonHW("Анатолий",20, 60,190));
        ppls.add(new PersonHW("Анатолий",20, 60,160));
        ppls.add(new PersonHW("Анатолий",20, 60,170));
        ppls.add(new PersonHW("Глеб",28, 70,180));
        ppls.add(new PersonHW("Глеб",28, 75,171));
        ppls.add(new PersonHW("Глеб",28, 68,175));
        ppls.add(new PersonHW("Авраам",24, 68,190));
        ppls.add(new PersonHW("Катерина",27, 68,190));
        ppls.add(new PersonHW("Зоран",24, 68,190));

        Collections.sort(ppls);
        //ppls.sort((o1, o2) -> Integer.compare(o1.height, o2.height));

        for (PersonHW pers: ppls){
            System.out.println(pers);
        }
    }
}
