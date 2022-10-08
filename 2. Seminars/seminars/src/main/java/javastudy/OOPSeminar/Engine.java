package javastudy.OOPSeminar;

public abstract class Engine implements CheckAble{

    private boolean work;
    public void Start() {
        this.work = true;
        startInternal();
    }
    protected abstract void startInternal();
    protected abstract void stopInternal();
    protected abstract void throttleUptInternal(int level);

    public void Stop() {
        this.work = false;
        stopInternal();
    }

    public void ThrottleUp(int level) {
        if(this.work) {
            throttleUptInternal(level);
        }
    }

    public Boolean getWork() {
        return this.work;
    }
}
