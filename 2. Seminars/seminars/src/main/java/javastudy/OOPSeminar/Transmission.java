package javastudy.OOPSeminar;

public class Transmission implements CheckAble{

    private int grNum;

    public int getGrNum() {
        return grNum;
    }

    public void SwitchGR(int num) {
        this.grNum = num;
        System.out.printf("Transmission switched on %d%n", num);
    }
    @Override
    public void check() {
        System.out.println("ok");
    }
}
