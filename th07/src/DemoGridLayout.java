import javax.swing.*;
import java.awt.*;

public class DemoGridLayout extends JFrame {
    public DemoGridLayout() {
        setTitle("Demo Boxlayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new GridLayout(7,3,5,5));
        for (int i = 1; i <=20; i++) {
            add(new JButton("Button"+i));
        }
    }

    public static void main(String[] args) {
        new DemoGridLayout().setVisible(true);
    }
}
