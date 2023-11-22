import javax.swing.*;
import java.awt.*;

public class VeHinh extends JFrame {
    JMenuBar menuBar=new JMenuBar();
    JMenu menu=new JMenu("Shape");
    JMenu menu2=new JMenu("Color");
    JMenuItem item1=new JMenuItem("Round");
    JMenuItem item2=new JMenuItem("Circle");
    JButton btnExit=new JButton("Exit");
    JButton btnReset=new JButton("Reset");
    JScrollBar scrollBar=new JScrollBar(Adjustable.HORIZONTAL);
    Box hbox=Box.createHorizontalBox();

    JComboBox<String> comboBox=new JComboBox<String>();
    JRadioButton rb1=new JRadioButton("Red");
    JRadioButton rb2=new JRadioButton("Green");
    JRadioButton rb3=new JRadioButton("Blue");
    ButtonGroup group=new ButtonGroup();
    Box rbContain= Box.createVerticalBox();
    JPanel panel =new JPanel();
    public VeHinh() throws HeadlessException {
        setSize(500,500);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        menu.add(item1);
        menu.add(item2);
        menuBar.add(menu);
        menuBar.add(menu2);
        setJMenuBar(menuBar);

        hbox.add(scrollBar);
        hbox.add(btnExit);
        hbox.add(btnReset);
        add(hbox);

        group.add(rb1);
        group.add(rb2);
        group.add(rb3);
        rbContain.add(rb1);
        rbContain.add(rb2);
        rbContain.add(rb3);
        add(rbContain);
    }

    public static void main(String[] args) {
        JFrame f= new VeHinh();
        f.setVisible(true);
    }
}
