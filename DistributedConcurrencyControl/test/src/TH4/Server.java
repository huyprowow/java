package TH4;

import java.net.*;
import java.io.*;
import java.util.Arrays;

public class Server {
    private ServerSocket serverSocket;
    private Socket clientSocket;
    private ObjectOutputStream out;
    private ObjectInputStream in;

    public void start(int port) throws IOException, ClassNotFoundException {

        serverSocket = new ServerSocket(port);
        while(true){

        System.out.println("Socket server listen ning on port: "+port);
        clientSocket = serverSocket.accept();
        System.out.println("New client connected");
        System.out.println("Client accepted"+clientSocket.getInetAddress()+":"+clientSocket.getPort());

         in = new ObjectInputStream(clientSocket.getInputStream());
         out = new ObjectOutputStream(clientSocket.getOutputStream());
        int[] arrFromClient = (int[]) in.readObject();
        for (int i = 0; i < arrFromClient.length; i++) {
            System.out.print(arrFromClient[i]+"");
        }
        System.out.println();
        Arrays.sort(arrFromClient);
        out.writeObject(arrFromClient);
        }

//        out = new PrintWriter(clientSocket.getOutputStream(), true);
//        in = new BufferedReader(new InputStreamReader(clientSocket.getInputStream()));
//        String greeting = in.readLine();
//        if ("hello server".equals(greeting)) {
//        }
//        else {
//            out.println("unrecognised greeting");
//        }
    }

    public void stop() throws IOException {
        in.close();
        out.close();
        clientSocket.close();
        serverSocket.close();
    }
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        Server server=new Server();
        server.start(6666);
    }

}
