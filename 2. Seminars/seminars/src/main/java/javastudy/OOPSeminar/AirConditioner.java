package javastudy.OOPSeminar;

public class AirConditioner {

    private int status;

    public int getStatus(){
        return status;
    }

    public void On(){
        this.status = 1;
        System.out.println("Air conditioner is on");
    }

    public void Off(){
        this.status = 0;
        System.out.println("Air conditioner is off");
    }
}
