package Test;

public class ReadWrite {
    int numRead=0;
    BinarySemaphore mutex=new BinarySemaphore(true);
    BinarySemaphore wlock=new BinarySemaphore(true);
    public void startRead(){
        mutex.P();
        numRead++;
        if(numRead==1) wlock.P();
        mutex.V();
    }
    public void endRead(){
        mutex.P();
        numRead--;
        if(numRead==0) wlock.V();
        mutex.V();
    }
    public void startWrite(){
        wlock.P();
    }
    public void endWrite(){
        wlock.V();
    }
}
