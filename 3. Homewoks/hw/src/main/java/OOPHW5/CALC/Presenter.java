package OOPHW5.CALC;

import java.util.List;

public class Presenter {
    private final CalcModel model;
    private final View view;

    public Presenter(CalcModel model, View view) {
        this.model = model;
        this.view = view;
    }
    public void execute() {
        model.setFirst(view.getValue("Enter first number "));
        model.setSecond(view.getValue("Enter second number "));
        String choose = view.getStrValue(
                """
                        Enter a number to choose operation:
                        1. Find sum
                        2. Find difference
                        3. Find product
                        4. Find division
                        5. Find percent
                        6. Quit
                        """
        );

        while(!List.of("1","2","3","4","5","6").contains(choose)) {
           choose = view.getStrValue("Try again --> ");
        }

        switch (choose) {
            case "1" -> {
                view.print("Sum is " + model.getSum() + "\n");
            }
            case "2" -> {
                view.print("Difference is " + model.getDifference() + "\n");
            }
            case "3" -> {
                view.print("Product is " + model.getProduct() + "\n");
            }
            case "4" -> {
                view.print("Division is " + model.getDivision() + "\n");
            }
            case "5" -> {
                view.print("Percent is " + model.getPercent() + "\n");
            }
            default -> {
            }
        }
    }
    private static class MockView implements View {
        private int count = 0;
        private int countSTR = 0;
        private int i = 0;
        private final String[] operList = {"1", "2", "3", "4", "5", "6"};
        @Override
        public int getValue(String message) {
            count++;
            return 1;
        }

        @Override
        public String getStrValue(String massage) {
            countSTR++;
            return operList[i];
        }

        @Override
        public void print(String message) {
            if (    !(message.equals("Sum is 2\n")
                    || message.equals("Difference is 0\n")
                    || message.equals("Product is 1\n")
                    || message.equals("Division is 1.0\n")
                    || message.equals("Percent is 0.01\n"))) {
                throw new AssertionError("Incorrect output");
            }
            else {
                i++;
                System.out.print(message);
            }
        }
        public int getCount() {
            return count;
        }
        public int getCountSTR(){
            return countSTR;
        }
    }

    public static void main(String[] args) {
        CalcModel model = new CalcModel();
        MockView mockView = new MockView();
        Presenter presenter = new Presenter(model, mockView);
        presenter.execute();
        if ((mockView.getCount() != 2) || (mockView.getCountSTR() != 1)) {
            throw new AssertionError("Incorrect call of getValue() or getSTRValue()");
        }

        presenter = new Presenter(model, mockView);
        presenter.execute();
        if ((mockView.getCount() != 4) || (mockView.getCountSTR() != 2)) {
            throw new AssertionError("Incorrect call of getValue() or getSTRValue()");
        }

        presenter = new Presenter(model, mockView);
        presenter.execute();
        if ((mockView.getCount() != 6) || (mockView.getCountSTR() != 3)) {
            throw new AssertionError("Incorrect call of getValue() or getSTRValue()");
        }

        presenter = new Presenter(model, mockView);
        presenter.execute();
        if ((mockView.getCount() != 8) || (mockView.getCountSTR() != 4)) {
            throw new AssertionError("Incorrect call of getValue() or getSTRValue()");
        }

        presenter = new Presenter(model, mockView);
        presenter.execute();
        if ((mockView.getCount() != 10) || (mockView.getCountSTR() != 5)) {
            throw new AssertionError("Incorrect call of getValue() or getSTRValue()");
        }
    }
}
