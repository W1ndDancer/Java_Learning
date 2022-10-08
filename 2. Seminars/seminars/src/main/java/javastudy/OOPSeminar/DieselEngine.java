package javastudy.OOPSeminar;

public class DieselEngine extends Engine{
    @Override
    protected void startInternal() {
        System.out.println("Запустился дизельный двигатель");
    }

    @Override
    protected void stopInternal() {
        System.out.println("Заглушили дизельный двигатель");
    }

    @Override
    protected void throttleUptInternal(int level) {
        System.out.printf("Дизельный дроссель открыт %d%n", level);
    }

    @Override
    public void check() {
        System.out.println("ok");
    }
}
