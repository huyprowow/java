package TH3;
//public class DataArray {
//    private int[] array;
//
//    public DataArray(int size) {
//        array = new int[size];
//    }
//
//    synchronized public int read(int index) {
//        return array[index];
//    }
//
//    synchronized public void write(int index, int value) {
//        array[index] = value;
//    }
//}

import java.util.concurrent.Semaphore;

public class DataArray {
     private int[] array;
    private Semaphore readSemaphore;
    private Semaphore writeSemaphore;

    public DataArray(int size) {
        array = new int[size];
        readSemaphore = new Semaphore(1);
        writeSemaphore = new Semaphore(1);
    }

    public int read(int index) throws InterruptedException {
        readSemaphore.acquire();
        int value = array[index];
        readSemaphore.release();
        return value;
    }

    public void write(int index, int value) throws InterruptedException {
        writeSemaphore.acquire();
        array[index] = value;
        writeSemaphore.release();
    }
}
