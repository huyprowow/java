import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class DemoEvent extends JFrame implements MouseListener{
    JButton btn;
    JButton btn2;
    JButton btn1;

    public DemoEvent() {
        btn=new JButton("click1");
        btn2=new JButton("click2");
        btn1=new JButton("click2");

//        btn.addActionListener(new ActionListener() {
//            @Override
//            public void actionPerformed(ActionEvent e) {
//                JOptionPane.showInputDialog("fdfd");
//            }
//        });
        btn.addMouseListener(this);
        btn2.addMouseListener(this);
        btn1.addMouseListener(new MouseAdapter() {
            @Override
            public void mouseClicked(MouseEvent e) {
                super.mouseClicked(e);
            }

            @Override
            public void mousePressed(MouseEvent e) {
                super.mousePressed(e);
            }

            @Override
            public void mouseReleased(MouseEvent e) {
                super.mouseReleased(e);
            }
        });
        add(btn);
        add(btn2);
        setLayout(new FlowLayout());
        setSize(600,400);
        setVisible(true);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
    }

    public static void main(String[] args) {
        DemoEvent gui=new DemoEvent();
    }
        @Override
        public void mouseClicked(MouseEvent e) {

        }

        @Override
        public void mousePressed(MouseEvent e) {
        JOptionPane.showMessageDialog(null,((JButton)e.getSource()).getText());
        }

        @Override
        public void mouseReleased(MouseEvent e) {

        }

        @Override
        public void mouseEntered(MouseEvent e) {

        }

        @Override
        public void mouseExited(MouseEvent e) {

        }

}
