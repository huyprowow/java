public class HardDrive {
    private TxtFile[] drive;
    private int numUsed;
    private final int DRIVE_SIZE=1000;
    public HardDrive(){
        drive=new TxtFile[DRIVE_SIZE];
        numUsed=0;
    }
    public boolean addFile(String filename,String data){
        int index=indexOfFile(filename);
        if(numUsed<DRIVE_SIZE &&index==-1){
            TxtFile t=new TxtFile(filename,data);
            return true;
        }else{
            return false;
        }
    }
    public int indexOfFile(String filename){
        for(int i=0;i<drive.length;i++){
            if(drive[i].getName()==filename){
                return i;
            }

        }
        return -1;
    }
}
