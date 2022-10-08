package javastudy.OOPSeminar;

public class BenzinEngine extends Engine{
    @Override
    protected void startInternal() {
        System.out.println("Запустился бензиновый двигатель");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Заглушили бенз двигатель");
    }

    @Override
    protected void throttleUptInternal(int level) {
        System.out.printf("Бенз дроссель открыт %d%n", level);
    }
    @Override
    public void check() {
        System.out.println("Benzin ok");
    }
}
