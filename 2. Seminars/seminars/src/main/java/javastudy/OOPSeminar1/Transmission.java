package javastudy.OOPSeminar1;

public class Transmission {

    private int grNum;

    public int getGrNum() {
        return grNum;
    }

    public void SwitchGR(int num) {
        this.grNum = num;
        System.out.printf("Transmission switched on %d%n", num);
    }
}
