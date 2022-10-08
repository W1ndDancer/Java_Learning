package javastudy.OOPSeminar.HomeWorkOOP2;

public class WinterWheel extends Wheel{

    @Override
    public void Rotate() {
        System.out.println("Winter Wheel is running");
    }
    @Override
    public    void Brake() {
        System.out.println("Winter wheel is braking");
    }
    @Override
    public void Turning(String direct){
        System.out.println("Winter wheel is turning " + direct);
    }
    @Override
    public void check() {
        System.out.println("Winter wheel is ok");
    }
    @Override
    public void workTest() {
        System.out.println("Pressure in winter wheel is ok");
    }
}
