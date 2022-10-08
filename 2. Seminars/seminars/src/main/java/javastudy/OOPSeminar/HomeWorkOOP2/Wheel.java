package javastudy.OOPSeminar.HomeWorkOOP2;

import javastudy.OOPSeminar.CheckAble;

public abstract class Wheel implements CheckAble, WorkAble, SteeringWheel {
    public abstract void Rotate();
    public   abstract void Brake();
    public abstract void Turning(String direct);
}
