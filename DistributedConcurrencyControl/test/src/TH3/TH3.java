package TH3;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Scanner;

public class TH3{
    private static int getRandomIndex(int arraySize) {
        return (int) (Math.random() * arraySize);
    }

    private static int getRandomValue() {
        return (int) (Math.random() * 100);
    }

    private static void sleepRandomTime() {
        try {
            Thread.sleep((int) (Math.random() * 1000));
        } catch (InterruptedException e) {
            e.printStackTrace();
        }
    }
    public static void main(String[] args) {
        DataArray arr=new DataArray(100);
        System.out.println("nhap so luong doc, ghi: ");
        Scanner input = new Scanner(System.in);
        int kWrite = input.nextInt();
        int hRead = input.nextInt();
        for (int i = 0; i < kWrite; i++) {
            int finalI = i;
            Thread writeThread=new Thread(()->{
                try {
                    while (true) {
                        int index = getRandomIndex(100);
                        int value = getRandomValue();
                        arr.write(index, value);
                        String string = String.format("W%d: <%d> - %s", finalI, value, new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime()));
                        System.out.println(string);
                        sleepRandomTime();

                    }
                }catch (InterruptedException e) {
                    e.printStackTrace();
                }
            });
            writeThread.start();
        }
        for (int i = 0; i < hRead; i++) {
             int finalI = i;
             Thread readThread=new Thread(()->{
                 try {
                     while (true) {
                         int index = getRandomIndex(100);
                         int value = arr.read(index);
                         String res = value == 5 ? "=" : "!=";

                         String string = String.format("R%d: <%d> - %s - %s", finalI, value, res,
                                 new SimpleDateFormat("yyyy/MM/dd_HH:mm:ss").format(Calendar.getInstance().getTime()));
                         System.out.println(string);
                         sleepRandomTime();
                     }
                 } catch (InterruptedException e) {
                     e.printStackTrace();
                 }
             });
             readThread.start();
         }

//        for (int i = 0; i < arr.length; i++) {
//            System.out.println(arr[i]);
//        }
    }
}
