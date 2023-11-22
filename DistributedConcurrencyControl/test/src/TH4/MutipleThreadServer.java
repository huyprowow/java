package TH4;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

public class MutipleThreadServer {

        static final int PORT = 6666;

        public static void main(String args[]) {
            ServerSocket serverSocket = null;
            Socket socket = null;

            try {
                serverSocket = new ServerSocket(PORT);
            } catch (IOException e) {
                e.printStackTrace();

            }
            while (true) {
                try {
                    socket = serverSocket.accept();
                    new ThreadServer(socket).start();
                } catch (IOException e) {
                    System.out.println("I/O error: " + e);
                }
                // new thread for a client
            }
        }
}
