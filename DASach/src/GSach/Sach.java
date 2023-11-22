package GSach;

public class Sach extends TaiLieu{
    private int NamXB;
    private double GiaB;

    public Sach(int maS, String tenS, int namXB, double giaB) {
        super(maS, tenS);
        NamXB = namXB;
        GiaB = giaB;
    }

    public Sach(int namXB, double giaB) {
        NamXB = namXB;
        GiaB = giaB;
    }

    public Sach(int maS, String tenS) {
        super(maS, tenS);
    }

    public Sach() {
    }

    public int getNamXB() {
        return NamXB;
    }

    public void setNamXB(int namXB) {
        NamXB = namXB;
    }

    public double getGiaB() {
        return GiaB;
    }

    public void setGiaB(double giaB) {
        GiaB = giaB;
    }

    @Override
    public double Thanhtien() {
        if(NamXB>=2015){
            return GiaB*0.95;
        }else{
            return GiaB*0.85;
        }
    }
}
