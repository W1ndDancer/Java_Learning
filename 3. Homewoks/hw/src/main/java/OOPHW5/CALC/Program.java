package OOPHW5.CALC;

/*
1. Взять за основу код калькулятора, написанный на уроке. Добавить в него четыре арифметических действия.
Подумать над автоматическими тестами в методе main, которые нужно дописать.
 */

import java.util.Scanner;

public class Program {

    public static void main(String[] args) {
        Scanner scn = new Scanner(System.in);
        CalcModel model = new CalcModel();
        View view = new ViewImpl(scn, System.out);
        Presenter presenter = new Presenter(model, view);
        presenter.execute();
    }
}
