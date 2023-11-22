package TH5;

import java.rmi.Naming;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;

public class ThreadRmiServer extends Thread{
    SortQuery obj ;

    public ThreadRmiServer(SortQuery obj) {
        this.obj=obj ;
    }

    @Override
    public void run() {
        try
        {

             LocateRegistry.createRegistry(1900);
            Naming.rebind("rmi://localhost:1900"+
                    "/huy",obj);
            System.out.println("rmi server listen on 1900");

        }
        catch(Exception e)
        {
            System.out.println(e);
        }
    }
}
