package Test;

public class Test implements Runnable {
    int value;
    public Test(int value) {
        this.value=value;
    }

    @Override
    public void run() {
        System.out.println("x"+value);
    }

    public static void main(String[] args) {
        Thread t=new Thread(new Test(1),"test thread");
        Thread t2=new Thread(new Test(2),"test thread");
        t.start();
        t2.start();
    }
}
