package javastudy.OOPSeminar1;

public class testProg {
    public static void main(String[] args) {
        Auto myAuto = new Auto("Škoda");
        System.out.println(myAuto.getInfo());
        System.out.println();
        myAuto.Start();
        System.out.println();
        myAuto.Reverse();
        System.out.println();
        myAuto.Drive();
        System.out.println();
        myAuto.CondionerOn();
        System.out.println();
        myAuto.TownSpeed();
        System.out.println();
        myAuto.TurnLeft();
        System.out.println();
        myAuto.HighwaySpeed();
        System.out.println();
        myAuto.TurnRight();
        System.out.println();
        myAuto.Stop();
    }
}
