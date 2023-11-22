package TH5;

import java.net.MalformedURLException;
import java.rmi.*;
import java.rmi.registry.*;
//1 server 1 hoac nhieu server co phuong thuc x, client goi x thuc hien in ket qua
public class Server {
    public Server() {
    }

    public static void main(String args[]) throws RemoteException, MalformedURLException {
            SortQuery obj = new SortQuery();
                LocateRegistry.createRegistry(1900);
                Naming.rebind("rmi://localhost:1900"+"/huy",obj);
                System.out.println("rmi server listen on 1900");

//        while(true){
//            SortQuery obj = new SortQuery();
//
//            new ThreadRmiServer(obj).start();
//
//                }


    }
}
