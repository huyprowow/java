package TH2;

public class Dekker implements Lock {
    volatile int turn =1;
    volatile boolean wantCS[]={false,false};

    @Override
    public void requestCS(int tid) {//tid= 0 hoac 1
        int j=1-tid;
        wantCS[tid]=true;
        while(wantCS[j]){
            if(turn==j){
                wantCS[tid]=false;
                while (turn == j);
                wantCS[tid]=true;
            }
        }
    }

    @Override
    public void releaseCS(int tid) {//tid= 0 hoac 1
        turn =1-tid;
        wantCS[tid]=false;
    }
}
