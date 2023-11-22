import javax.swing.*;
import java.awt.*;

public class DemoBorderLayout extends JFrame {
    private JButton
            bn=new JButton("North"),
            bs=new JButton("South"),
            be=new JButton("East"),
            bw=new JButton("West"),
            bc=new JButton("Center");

    public DemoBorderLayout() {
        setTitle("Demo Boxlayout");
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setSize(300,200);
        setLocationRelativeTo(null);
        setResizable(false);
        add(BorderLayout.NORTH,bn);
        add(BorderLayout.SOUTH,bs);
        add(BorderLayout.EAST,be);
        add(BorderLayout.WEST,bw);
        add(BorderLayout.CENTER,bc);
        bn.setBackground(Color.red);
        bn.setBackground(Color.white);
        be.setBackground(Color.blue);
        be.setBackground(Color.white);
    }

    public static void main(String[] args) {
        new DemoBorderLayout().setVisible(true);
    }
}
