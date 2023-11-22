package TH5;
import java.rmi.*;
import java.rmi.registry.LocateRegistry;
import java.rmi.registry.Registry;
import java.util.Random;
import java.util.stream.IntStream;

public class Client {

    public static void main(String args[])
    {
        int[] answer,answer2;
        int[] a= IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
        int[] a2= IntStream.generate(() -> new Random().nextInt(100)).limit(100).toArray();
        try
        {
            // lookup method to find reference of remote object
            Sort access = (Sort) Naming.lookup("rmi://localhost:1900"+"/huy");
//            Sort access2 = (Sort) Naming.lookup("rmi://localhost:1900"+"/huy");

            answer = access.sort(a);
//            answer2=access2.sort(a2);
            for (int i = 0; i < answer.length; i++) {
                System.out.print(answer[i]+" ");
            }
//            System.out.println();
//            for (int i = 0; i < answer2.length; i++) {
//                System.out.print(answer2[i]+" ");
//            }

        }
        catch(Exception ae)
        {
            System.out.println(ae);
        }
    }
}
