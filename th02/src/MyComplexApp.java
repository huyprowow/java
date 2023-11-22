public class MyComplexApp {
    public static void main(String[] args) {
        MyComplex c1=new MyComplex(1.1,2.2);
        MyComplex c2=new MyComplex(3.3,4.4);
        System.out.println(c1);
        System.out.println(c1.isReal());
        System.out.println(c1.isImaginary());
        System.out.println(c2);
        System.out.println(c2.isReal());
        System.out.println(c2.isImaginary());
        System.out.println(c1.equals(c2));
        System.out.println(c1.add(c2));
        System.out.println(c1.subtract(c2));


    }
}

