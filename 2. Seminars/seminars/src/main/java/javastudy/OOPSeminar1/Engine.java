package javastudy.OOPSeminar1;

public class Engine {

    private boolean work;
    public void Start() {
        this.work = true;
        System.out.println("Engine started... BRRRRR...");
    }

    public void Stop() {
        this.work = false;
        System.out.println("Engine stoped.... Zzzz...");
    }

    public void ThrottleUp(int level) {
        if(this.work) {
            System.out.printf("Throttle up %d%n", level);
        }
    }

    public Boolean getWork() {
        return this.work;
    }
}
