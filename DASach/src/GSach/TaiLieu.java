package GSach;

public abstract class TaiLieu {
    protected int MaS;
    protected String TenS;

    public TaiLieu(int maS, String tenS) {
        MaS = maS;
        TenS = tenS;
    }

    public TaiLieu() {
    }

    public int getMaS() {
        return MaS;
    }

    public void setMaS(int maS) {
        MaS = maS;
    }

    public String getTenS() {
        return TenS;
    }

    public void setTenS(String tenS) {
        TenS = tenS;
    }

    public abstract double Thanhtien();
}
