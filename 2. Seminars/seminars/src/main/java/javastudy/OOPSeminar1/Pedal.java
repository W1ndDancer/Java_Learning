package javastudy.OOPSeminar1;

public class Pedal {

    private int s;

    public int getS(){
        return s;
    }

    public void setSpeed(int speed){
        this.s = speed;
        System.out.printf("Speed set on %d km/h%n", speed);
    }
}
