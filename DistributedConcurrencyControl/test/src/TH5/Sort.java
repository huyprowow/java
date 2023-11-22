package TH5;

import java.rmi.Remote;
import java.rmi.RemoteException;

public interface Sort extends Remote {
    public int[] sort(int[] arrFromClient) throws RemoteException;
}
