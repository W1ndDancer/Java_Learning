package javastudy.OOPSeminar.HomeWorkOOP2;

public class SummerWheel extends Wheel{

    @Override
    public void Rotate() {
        System.out.println("Summer wheel is running");
    }
    @Override
    public    void Brake() {
        System.out.println("Summer wheel is braking");
    }
    @Override
    public void Turning(String direct){
        System.out.println("Summer wheel is turning " + direct);
    }
    @Override
    public void check() {
        System.out.println("Summer wheel is ok");
    }
    @Override
    public void workTest() {
        System.out.println("Pressure in summer wheel is ok");
    }
}
