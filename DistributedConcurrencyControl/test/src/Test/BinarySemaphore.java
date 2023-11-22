package Test;

public class BinarySemaphore {
    boolean value;

    public BinarySemaphore(boolean value) {
        this.value = value;
    }
    public synchronized void P(){

        if(!this.value){
            //wait
        }
        value=false;
    }
    public synchronized void V(){
        value=true;
        notify();
    }
}
