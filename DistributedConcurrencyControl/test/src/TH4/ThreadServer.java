package TH4;

import java.io.*;
import java.net.Socket;
import java.util.Arrays;

public class ThreadServer extends Thread{
        protected Socket socket;

        public ThreadServer(Socket clientSocket) {
            this.socket = clientSocket;
        }

        public void run() {
            ObjectOutputStream out;
            ObjectInputStream in;
            try {
                in = new ObjectInputStream(socket.getInputStream());
                out = new ObjectOutputStream(socket.getOutputStream());
            } catch (IOException e) {
                return;
            }
            int[] arrFromClient;
            while (true) {
                try {
                    arrFromClient = (int[]) in.readObject();
                    for (int i = 0; i < arrFromClient.length; i++) {
                        System.out.print(arrFromClient[i]+"");
                    }
                    System.out.println();
                    Arrays.sort(arrFromClient);
                    out.writeObject(arrFromClient);
                } catch (IOException e) {
                    e.printStackTrace();
                    return;
                } catch (ClassNotFoundException e) {
                    throw new RuntimeException(e);
                }
            }
    }
}
