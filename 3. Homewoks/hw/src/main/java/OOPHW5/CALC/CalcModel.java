package OOPHW5.CALC;

public class CalcModel {

    private int first;
    private int second;
    public void setFirst(int first) {
        this.first = first;
    }
    public void setSecond(int second) {
        this.second = second;
    }

    public int getSum() {
        return first + second;
    }

    public int getDifference() {
        return first - second;
    }

    public int getProduct() {
        return first * second;
    }

    public double getDivision() {
        if (second == 0) {
            throw new AssertionError("Division by 0");
        }
        else {
            return (double) first/second;
        }
    }
    public double getPercent() {
        if (second < 0) {
            throw new AssertionError("Percent cant be negative");
        }
        else {
            return (double) first*second/100;
        }
    }

    public static void main(String[] args) {
        CalcModel calcModel = new CalcModel();

        calcModel.setFirst(1);
        calcModel.setSecond(1);
        if (calcModel.getSum() != 2) {
            throw new AssertionError("Incorrect test result(sum)");
        }
        calcModel.setFirst(3);
        calcModel.setSecond(1);
        if (calcModel.getDifference()!= 2) {
            throw new AssertionError("Incorrect test result(diff)");
        }
        calcModel.setFirst(2);
        calcModel.setSecond(2);
        if (calcModel.getProduct()!= 4) {
            throw new AssertionError("Incorrect test result(prod)");
        }
        calcModel.setFirst(2);
        calcModel.setSecond(2);
        if (calcModel.getDivision()!= 1) {
            throw new AssertionError("Incorrect test result(div)");
        }
        calcModel.setFirst(100);
        calcModel.setSecond(5);
        if (calcModel.getPercent()!= 5) {
            throw new AssertionError("Incorrect test result(percent)");
        }

    }
}
