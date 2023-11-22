package TH4;

import java.io.*;
import java.net.*;
import java.util.Random;
import java.util.stream.IntStream;

public class Client {
    private Socket clientSocket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public void startConnection(String ip, int port) throws IOException {
        clientSocket = new Socket(ip, port);
        System.out.println("client connect in:"+ ip+":"+port);
        out = new ObjectOutputStream(clientSocket.getOutputStream());
        in = new ObjectInputStream(clientSocket.getInputStream());
    }

//    public String sendMessage(String msg) throws IOException {
//        out.println(msg);
//        String resp = in.readLine();
//        return resp;
//    }
    public int[] sendData(int[] a) throws IOException, ClassNotFoundException {

        out.writeObject(a);
        return  (int[]) in.readObject();
    }

    public void stopConnection() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
    }

    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Client client = new Client();
        Client client2 = new Client();
        int[] a2= IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
        int[] a= IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
        client2.startConnection("127.0.0.1", 6666);
        client.startConnection("127.0.0.1", 6666);
        int[] sortedArr=client.sendData(a);
        for (int i = 0; i < sortedArr.length; i++) {
            System.out.print(sortedArr[i]+" ");
        }
        System.out.println();
        int[] sortedArr2=client2.sendData(a);
        for (int i = 0; i < sortedArr2.length; i++) {
            System.out.print(sortedArr2[i]+" ");
        }


//        String response = client.sendMessage("hello server");

//        System.out.println(response);
    }
}
