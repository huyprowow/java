public class TestMyTriangle {
    public static void main(String[] args) {
         MyTriangle t = new MyTriangle(1,2,3,4,5,6);
         MyPoint v1= new MyPoint(1,2);
         MyPoint v2= new MyPoint(3,4);
         MyPoint v3= new MyPoint(7,12);

         MyTriangle t1= new MyTriangle(v1,v2,v3);
         System.out.println(t);
        System.out.println(t1);
        System.out.println(t1.toString());
        System.out.println(t1.getPerimeter());
        t1.printType();
    }
}
