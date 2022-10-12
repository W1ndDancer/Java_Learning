package OOPHW4;

import java.util.ArrayList;
import java.util.List;

public class Box<E extends Fruit>{
    private final List<E> box;
    public Box() {
        box = new ArrayList<>();
    }

    public void put(E fruit){
        this.box.add(fruit);
    }

    public float getWeight(){
        if(box.isEmpty()){
            return 0;
        } else {
            E w1 = box.get(0);
            return this.box.size()* w1.weight();
        }
    }

    public boolean equals(Box<?> box) {
        return this.getWeight() == box.getWeight();
    }

    public Box<E> sprinkle() {
        Box<E> newBox = new Box<>();
        for (E fruit : this.box) {
            newBox.put(fruit);
        }
        this.box.clear();
        return newBox;
    }

}
