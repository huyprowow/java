import javax.swing.*;
import java.awt.*;

public class DemoFlowLayout extends JFrame {
    public DemoFlowLayout(){
        setTitle("Demo FlowLayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,250);
        setLocationRelativeTo(null);
        setResizable(false);
        setLayout(new FlowLayout());
        for (int i = 0; i <= 20; i++) {
            add(new JButton("Button"+i));
        }
    }

    public static void main(String[] args) {
        new DemoFlowLayout().setVisible(true);
    }
}
