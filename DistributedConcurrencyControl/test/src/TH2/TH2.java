package TH2;//https://docs.google.com/document/d/1z2RTSNDCfgG61MAJmirSE2A3y3nLQI6t2w12djadMQU/edit#

import java.util.Random;

public class TH2 implements Runnable{
    Dekker lock;
    int tid;
    static int kq=0;
    int[] randomArr;
    int numberThread;

    public TH2(Dekker lock, int tid, int[] randomArr, int numberThread) {
        this.lock = lock;
        this.tid = tid;
        this.randomArr = randomArr;
        this.numberThread = numberThread;
    }

    public void  CS(){
        for (int i = 0; i < randomArr.length; i++) {
            Random ran = new Random();
            int x = ran.nextInt(100) + 1;
            randomArr[i]=x;
        }

        for (int i = 0; i < randomArr.length; i++) {
            System.out.print(
                    randomArr[i]+" "
            );
        }
        System.out.println();

    }
    public int nonCS(int startIndex,int endIndex){
            System.out.println("tim tu "+startIndex+"->"+endIndex);
            int dem=0;
            for (int i = startIndex; i < endIndex; i++) {
                if(randomArr[i]==5){
                    dem++;
                }
            }
            return dem;
    }
    public void run(){
       this.lock.requestCS(this.tid);
        this.CS();
        this.lock.releaseCS(this.tid);

        System.out.println("thread "+this.tid+" start");
        int startIndex=(randomArr.length*this.tid)/numberThread;
        int endIndex=(randomArr.length*(this.tid+1))/numberThread;

        int sl=this.nonCS(startIndex,endIndex);
        kq+=sl;
        System.out.println("ket qua trung gian thu "+this.tid+": "+sl+" so");


    }
    public static void main(String[] args) throws InterruptedException {
        int[] arr=new int[10];

        for (int i = 0; i < 10; i++) {
            arr[i]=0;
        }
        Dekker lock= new Dekker();
        Thread t0=new Thread(new TH2(lock,0,arr,2),"thread"+0);
        Thread t1=new Thread(new TH2(lock,1,arr,2),"thread"+1);
        t0.start();
        t1.start();
        t0.join();
        t1.join();
        System.out.println("ket qua "+kq+" so 5 trong mang");

    }
}
