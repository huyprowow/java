public class MyCircle {
    private MyPoint center;
    private int radius=1;
    MyCircle(int x , int y , int radius)
    {
        center=new MyPoint(x,y);
        this.radius=radius;
    }
    MyCircle(MyPoint center1, int radius)
    {
        center=center1;
        this.radius=radius;
    }
    public  int getRadius()
    {
        return radius;
    }

    public MyPoint getCenter() {
        return center;
    }

    public void setCenter(MyPoint center) {
        this.center = center;
    }

    public void setRadius(int radius) {
        this.radius = radius;
    }
    public int getCenterX()
    {
        return center.getX();
    }
    public  int getCenterY()
    {
        return  center.getY();
    }
    public  void  setCenterXY(int x, int y)
    {
        center.setXY(x,y);

    }
    @Override
    public String toString()
    {
        return "Circle @ "+center+ " radius= "+radius;
    }
    public  double Area()
    {
        return Math.PI*(radius*radius);
    }

}
