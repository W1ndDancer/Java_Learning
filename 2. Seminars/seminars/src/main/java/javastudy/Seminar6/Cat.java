package javastudy.Seminar6;

import java.util.HashSet;
import java.util.Objects;
import java.util.Set;
import java.util.TreeSet;

public class Cat implements Comparable<Cat>{
    private int id;
    private int age;
    private int weight;
    private String name;
    private String poroda;
    private String color;
    private String recept;

    public Cat(int id, int age, int weight, String name, String poroda, String color, String recept) {
        this.id = id;
        this.age = age;
        this.weight = weight;
        this.name = name;
        this.poroda = poroda;
        this.color = color;
        this.recept = recept;
    }

    public Cat(int id, String name) {
        this.id = id;
        this.name = name;
    }

    public Cat(String name) {
        this(0, 0, 0, name, null, null, null);
    }

    public Cat() {
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public int getWeight() {
        return weight;
    }

    public void setWeight(int weight) {
        this.weight = weight;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getRecept() {
        return recept;
    }

    public void setRecept(String recept) {
        this.recept = recept;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Cat cat = (Cat) o;
        return id == cat.id && Objects.equals(name, cat.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(id, name);
    }

    @Override
    public String toString() {
        return "Cat{" +
                "id=" + id +
                ", age=" + age +
                ", weight=" + weight +
                ", name='" + name + '\'' +
                ", poroda='" + poroda + '\'' +
                ", color='" + color + '\'' +
                ", recept='" + recept + '\'' +
                '}';
    }

    @Override
    public int compareTo(Cat o) {
        return Integer.compare(this.age, o.age);
    }

    public static void main(String[] args) {
        Set<Cat> set = new HashSet<>();
        set.add(new Cat(1, "name1"));
        set.add(new Cat(1, "name1"));
        set.add(new Cat(1, 1, 1, "name2", "poroda1", "black", "some"));
        set.add(new Cat(2, 2, 2, "name3", "poroda2", "black", "some"));
        for (Cat c : set) {
            System.out.println(c);
        }
        System.out.println("--------------------");
        Set<Cat> treeSet = new TreeSet<>(set);
        treeSet.add(new Cat(1, 2, 1, "name2", "poroda1", "black", "some"));
        treeSet.add(new Cat(1, 3, 1, "name2", "poroda1", "black", "some"));
        treeSet.add(new Cat(1, 3, 1, "name2", "poroda1", "black", "some"));
        treeSet.add(new Cat(1, 4, 1, "name2", "poroda1", "black", "some"));
        for (Cat c : treeSet) {
            System.out.println(c);
        }
    }
}
