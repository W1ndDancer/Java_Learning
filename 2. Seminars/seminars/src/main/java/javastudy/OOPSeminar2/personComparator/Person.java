package javastudy.OOPSeminar.OOPSeminar2.personComparator;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

public class Person implements Comparable<Person>{
    String name;
    int age;
    int weight;
    int height;

    public Person(String name, int age, int weight, int height) {
        this.name = name;
        this.age = age;
        this.weight = weight;
        this.height = height;
    }

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", weight=" + weight +
                ", height=" + height +
                '}';
    }

    @Override
    public int compareTo(Person o) {
        if (this.name.compareTo(o.name) == 0){
            if (this.age == o.age) return 0;
            else if(this.age>o.age) return 1;
            else return -1;
        }
        return this.name.compareTo(o.name);
    }

    public static void main(String[] args) {
        ArrayList<Person> ppls = new ArrayList<>();
        ppls.add(new Person("Basil",12, 40,150));
        ppls.add(new Person("Vasilij",18, 66,165));
        ppls.add(new Person("Exon",14, 50,160));
        ppls.add(new Person("Taxon",20, 60,170));
        ppls.add(new Person("Wally",666, 10,103));
        ppls.add(new Person("Wally",555, 14,101));
        ppls.add(new Person("Wally",766, 19,100));

        //Collections.sort(ppls);
        ppls.sort(new Comparator<Person>() {
            @Override
            public int compare(Person o1, Person o2) {
                return Integer.compare(o1.height,o2.height);
            }
        });
        for (Person pers: ppls){
            System.out.println(pers);
        }
    }
}
