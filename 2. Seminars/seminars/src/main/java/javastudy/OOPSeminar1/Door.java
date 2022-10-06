package javastudy.OOPSeminar1;

public class Door {
    private int status = 0;

    public int getStatus(){
        return status;
    }

    public void Action(String action){
        this.status = status++;
        System.out.println("Door is " + action);
    }
}
