package TH5;
import java.rmi.*;
import java.rmi.server.*;
import java.util.Arrays;

public class SortQuery extends UnicastRemoteObject implements Sort
{
    SortQuery() throws RemoteException
    {
        super();
    }

    public int[] sort(int[] arrFromClient)
            throws RemoteException
    {

        Arrays.sort(arrFromClient);
        return (int[]) arrFromClient;
    }
}