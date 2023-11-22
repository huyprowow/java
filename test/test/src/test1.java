import javax.swing.*;
import java.awt.*;

public class test1 {
    public static void main(String[] args) {
        Circle c1=new Circle();
        System.out.println("radius "+c1.getRadius()+" area "+c1.getAreas());
        Circle c2=new Circle(2.0);
        System.out.println("radius "+c2.getRadius()+" area "+c2.getAreas());
        Circle c3=new Circle(2.0);
        System.out.println("radius "+c3.getRadius()+" area "+c3.getAreas());
        c3.setRadius(5.0);
        System.out.println("radius "+c3.getRadius()+" area "+c3.getAreas());
//        System.out.println(c1);
        JFrame frame= new JFrame();
        frame.setSize(500,500);
        frame.setBackground(Color.CYAN);
        frame.setTitle("huy dep trai vl");
        frame.show();
    }


}
