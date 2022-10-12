package OOPHW4;

public class Main {
    public static void main(String[] args) {
        Box<Orange> orangesBox1 = new Box<>();
        orangesBox1.put(new Orange());
        orangesBox1.put(new Orange());
        orangesBox1.put(new Orange());
        System.out.println("Orange box 1 weight: " + orangesBox1.getWeight());

        Box<Apple> applesBox = new Box<>();
        applesBox.put(new Apple());
        applesBox.put(new Apple());
        applesBox.put(new Apple());
        System.out.println("Apple box weight: " + applesBox.getWeight());

        System.out.println("Do orange and apple boxes have the same weight? " + orangesBox1.equals(applesBox));

        Box<Orange> orangesBox2 = orangesBox1.sprinkle();
        System.out.println("Orange box 1 weight now is: " + orangesBox1.getWeight());
        System.out.println("Orange box 2 weight is: " + orangesBox2.getWeight());
    }

}