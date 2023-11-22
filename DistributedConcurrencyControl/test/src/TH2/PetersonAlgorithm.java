package TH2;

public class PetersonAlgorithm implements Lock {
    volatile boolean wantCS[]={false,false};
    volatile int turn=1;

    public void requestCS(int i) {
        int j=1-i;
        wantCS[i]=true;
        turn=j;
        while (wantCS[j]&& (turn==j));
    }
    public void releaseCS(int i){
        turn=1-i;
        wantCS[i]=false;
    }
}
