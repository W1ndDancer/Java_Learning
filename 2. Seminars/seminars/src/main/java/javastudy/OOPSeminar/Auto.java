package javastudy.OOPSeminar;

/*
1. Основываясь на примере с урока продолжить развивать систему классов, описывающих структуру и функционирование легкового автомобиля.
Добавить сам класс автомобиля, который будет включать созданную нами базу.
Помимо базы добавить такие компоненты, как двери, кондиционер, рулевое управление и др. Наладить их взаимодействие.
2***. Поискать места в которых можно было бы использовать абстрактные классы и наследование
 */

public class Auto extends Base {

    public String name;

    public String serial;
    private static int id;

    static {
        id = 1;
    }

    public Auto(String name, String serial) {
        if (name.isEmpty() || name.equals("unknown")) {
            this.name = String.format("unknown_%d", id++);
        }
        else this.name = name;
        this.serial = serial;
    }

    public Auto(String name) {
        this(name, "none");
    }

    public Auto() {
        this("unknown");
    }

    public String getInfo() {
        return String.format("Name: %s  Serial: %s", this.name, this.serial);
    }

}
