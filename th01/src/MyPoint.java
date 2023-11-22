public class MyPoint {
    private int x =0;
    private int y=0;
    MyPoint()
    {

    }
    MyPoint(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    public int getX()
    {
        return x;
    }
    public int getY()
    {
        return y;
    }
    public void setX(int x)
    {
        this.x=x;
    }
    public void setY(int y)
    {
        this.y=y;
    }
    public void setXY(int x, int y)
    {
        this.x=x;
        this.y=y;
    }
    @Override
    public String toString()
    {
        return "("+ x+","+ y + ")";
    }
    public  double distance(int x, int y)
    {
        int a= this.x-x;
        int b=this.y-y;
        return Math.sqrt(a*a + b*b);
    }
    public  double distance(MyPoint Point)
    {
        int a= this.x-Point.x;
        int b= this.y-Point.y;
        return Math.sqrt(a*a + b*b);
    }

}
