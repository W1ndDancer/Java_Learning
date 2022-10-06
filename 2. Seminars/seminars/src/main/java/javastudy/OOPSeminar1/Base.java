package javastudy.OOPSeminar1;

public class Base {
    private Engine e;
    private Wheel w1;
    private Wheel w2;
    private Wheel w3;
    private Wheel w4;
    private Transmission t;
    private Pedal p;
    private SteeringWheel sw;
    private AirConditioner air;

    private Door driverdoor;

    public Base() {
        e = new Engine();
        w1 = new Wheel();
        w2 = new Wheel();
        w3 = new Wheel();
        w4 = new Wheel();
        t = new Transmission();
        p = new Pedal();
        sw = new SteeringWheel();
        air = new AirConditioner();
        driverdoor = new Door();
    }
    public void Start(){
        driverdoor.Action("opened");
        e.Start();
        driverdoor.Action("closed");
    }
    public void Drive(){
        if(e.getWork()){
            t.SwitchGR(1);
            w1.Rotate();
            w2.Rotate();
            w3.Rotate();
            w4.Rotate();
        }
    }
    public void Stop(){
        p.setSpeed(0);
        t.SwitchGR(0);
        w1.Brake();
        w2.Brake();
        if(air.getStatus() == 1){
            air.Off();
        }
        e.Stop();
    }
    public void Reverse(){
        if (e.getWork()) {
            if ((p.getS() != 0)) {
                p.setSpeed(0);
                w1.Brake();
                w2.Brake();
            }
            t.SwitchGR(-1);
            w1.Rotate();
            w2.Rotate();
        }
    }
    public void TownSpeed(){
        if (e.getWork()) {
            p.setSpeed(50);
            t.SwitchGR(2);
        }
    }
    public void HighwaySpeed(){
        if (e.getWork()) {
            p.setSpeed(110);
            t.SwitchGR(3);
        }
    }
    public void TurnLeft(){
        if (e.getWork()) {
            sw.Turning("left");
            w1.Turning("left");
        }
    }
    public void TurnRight(){
        if (e.getWork()) {
            sw.Turning("right");
            w1.Turning("right");
        }
    }
    public void CondionerOn(){
        if(e.getWork()) air.On();
    }
    public void CondionerOff(){
        if(e.getWork()) air.Off();
    }
}
