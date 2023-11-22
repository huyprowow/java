public class MyTriangle {
    private  MyPoint v1;
    private  MyPoint v2;
    private  MyPoint v3;

    MyTriangle(int x1,int y1, int x2, int y2, int x3, int y3)
    {
        v1=new MyPoint(x1,y1);
        v2=new MyPoint(x2,y2);
        v3=new MyPoint(x3,y3);
    }
    MyTriangle(MyPoint v1, MyPoint v2, MyPoint v3){
        this.v1=v1;
        this.v2=v2;
        this.v3=v3;
    }
    @Override
    public String toString()
    {
        return "Triangle @ " + v1.toString() +"," + v2.toString()+"," + v3.toString();
    }
    public  double getPerimeter()
    {
        double a= v1.distance(v2);
        double b= v2.distance(v3);
        double c= v1.distance(v3);
        return a+b+c;
    }
    public void printType()
    {
        double a= v1.distance(v2);
        double b= v2.distance(v3);
        double c= v1.distance(v3);
        if(a==b && b==c && a==c)
        {
            System.out.println("equilateral");
        }
        else  if(a==b || b==c||a==c)
        {
            System.out.println("isosceles");
        }
        else
            System.out.println("scalene");

    }
}
