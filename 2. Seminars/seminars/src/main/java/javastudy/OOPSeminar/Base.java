package javastudy.OOPSeminar;

import javastudy.OOPSeminar.HomeWorkOOP2.*;

import java.util.List;

public class Base {
    private Engine e;
    private Wheel w1;
    private Wheel w2;
    private Wheel w3;
    private Wheel w4;
    private Transmission t;
    private GasPedal gasPedal;
    private BrakePedal brakePedal;
    private AirConditioner air;
    private Door driverdoor;
    private List<CheckAble> checkAbles;
    private List<WorkAble> workTest;

    public Base() {
        e = new BenzinEngine();
        w1 = new WinterWheel();
        w2 = new WinterWheel();
        w3 = new SummerWheel();
        w4 = new SummerWheel();
        t = new Transmission();
        gasPedal = new GasPedal();
        brakePedal = new BrakePedal();
        air = new AirConditioner();
        driverdoor = new Door();
        checkAbles = List.of(e, w1, w2, w3, w4, t);
        workTest = List.of(w1, w2, w3, w4, gasPedal, brakePedal);
    }
    public void Start(){
        driverdoor.Action("opened");
        e.Start();
        driverdoor.Action("closed");
    }
    public void Drive(){
        if(e.getWork()){
            gasPedal.action();
            w1.Rotate();
            w2.Rotate();
            w3.Rotate();
            w4.Rotate();
        }
    }
    public void Stop(){
        brakePedal.action();
        t.SwitchGR(0);
        w1.Brake();
        w2.Brake();
        if(air.getStatus() == 1){
            air.Off();
        }
        e.Stop();
    }
    public void Reverse(){
            t.SwitchGR(-1);
            gasPedal.action();
            w1.Rotate();
            w2.Rotate();

    }
    public void TurnLeft(){
        if (e.getWork()) {
            w1.Turning("left");
        }
    }
    public void TurnRight(){
        if (e.getWork()) {
            w1.Turning("right");
        }
    }
    public void CondionerOn(){
        if(e.getWork()) air.On();
    }
    public void CondionerOff(){
        if(e.getWork()) air.Off();
    }
    public void checkall() {
        for (CheckAble element: checkAbles) {
            element.check();
        }
    }

    public void wheelsTest() {
        workTest = List.of(w1, w2, w3, w4, brakePedal, gasPedal);
        for (WorkAble element: workTest) {
            element.workTest();
        }

    }
}
