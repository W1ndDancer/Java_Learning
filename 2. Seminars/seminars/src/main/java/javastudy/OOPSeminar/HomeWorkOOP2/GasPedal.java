package javastudy.OOPSeminar.HomeWorkOOP2;

public class GasPedal extends Pedal implements WorkAble{

    @Override
    public void action() {
        System.out.println("gas!");
    }
    @Override
    public void workTest() {
        System.out.println("Gas pedal is working");
    }
}
