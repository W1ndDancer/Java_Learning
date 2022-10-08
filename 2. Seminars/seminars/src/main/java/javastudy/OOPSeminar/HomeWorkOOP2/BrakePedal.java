package javastudy.OOPSeminar.HomeWorkOOP2;

public class BrakePedal extends Pedal implements WorkAble{
    @Override
    public void action(){
        System.out.println("brake!");
    }

    @Override
    public void workTest() {
        System.out.println("Brake pedal is working");
    }
}
