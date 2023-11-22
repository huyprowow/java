package TH1;

import java.util.Random;
import java.util.Scanner;

public class TH1 implements Runnable{
    //1. kb 1 cau truc chia se mang, dslk, cay, tep, bang,.... n ngau nhien n>100
    //2. kinh ra k luong >1 t1,t2,...tn thucws hien nv chung tren A (tim lon nhat nho nhat, dem snt, so cp,...)
    // chia dl => k phan => k luong k phan (A)|t1 - t2 - t3.... tim xong in ra
    //3.tong hop kq in ra
    int indexThread;
    static int kq=0;
    int numberThread;
    int[] randomArr= new int[100];
    public TH1(int indexThread, int numberThread) {
        this.indexThread=indexThread;
        this.numberThread=numberThread;
        for (int i = 0; i < randomArr.length; i++) {
            Random ran = new Random();
            int x = ran.nextInt(100) + 1;
            randomArr[i]=x;
        }
    }
    public int soLuongSo5(int startIndex,int endIndex){
        System.out.println("tim tu "+startIndex+"->"+endIndex);
        int dem=0;
        for (int i = startIndex; i < endIndex; i++) {
            if(randomArr[i]==5){
                dem++;
            }
        }
        return dem;
    }
    @Override
    public void run() {
        System.out.println("thread "+indexThread+" start");
        int startIndex=(randomArr.length*indexThread)/numberThread;
        int endIndex=(randomArr.length*(indexThread+1))/numberThread;

        int sl=this.soLuongSo5(startIndex,endIndex);
        kq+=sl;
        System.out.println("ket qua trung gian thu "+indexThread+": "+sl+" so");
//        System.out.println("Kq "+kq);
    }


    public static void main(String[] args) throws InterruptedException {
        System.out.println("nhap so luong luong: ");
        // create an object of Scanner
        Scanner input = new Scanner(System.in);

        // take input from the user
        int n = input.nextInt();

        Thread[] arrThread=new Thread[n];
        for (int i = 0; i < n; i++) {
            arrThread[i]=new Thread(new TH1(i,n),"thread"+i);
            arrThread[i].start();
        }
        for (int i = 0; i < n; i++) {
            arrThread[i].join();
        }
        System.out.println("ket qua "+kq+" so 5 trong mang");
    }
}
