public class TestMyCircle {
    public static void main(String[] args) {
        MyCircle c= new MyCircle(1,2,1);
        MyPoint p=new MyPoint(1,2);
        MyCircle c1= new MyCircle(p,1);
        System.out.println(c);
        System.out.println(c1.Area());
    }
}
