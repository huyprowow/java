package Test;

public class CountingSemaphore {
    int value;

    public CountingSemaphore(int value) {
        this.value = value;
    }
    public synchronized void P(){
        value--;
        if(this.value<0){
            //wait
        }
    }
    public synchronized void V(){
        value++;
        if(this.value>=0){
            notify();
        }
    }
}
