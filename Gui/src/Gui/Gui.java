package Gui;

import javax.swing.*;
import java.awt.*;

public class Gui {
    public static void main(String[] args) {

    JFrame frame=new JFrame("ql");
        frame.getContentPane().setBackground(Color.orange);
//        JLabel label=new JLabel("ten lop");
//        label.setBackground(Color.orange);
//        label.setForeground(Color.red);
//        label.setSize(100,50);
//        frame.add(label);
//        int n=5;
//        JButton[] button=new JButton[n];
//        for (int i = 0; i < n; i++) {
//            button[i]=new JButton("click"+(i+1));
//        button[i].setBackground(Color.orange);
//        button[i].setForeground(Color.red);
//        button[i].setSize(100,50);
//        button[i].setEnabled(false);
////        button.setLocation(0,100);
//        frame.add(button[i]);
//        }
                JButton[] button=new JButton[5];
        for (int i = 0; i < 5; i++) {
            button[i]=new JButton("click"+(i+1));

        button[i].setBackground(Color.orange);
        button[i].setForeground(Color.red);
        }
        //        button[i].setSize(100,50);
//        button[i].setEnabled(false);
        frame.setLayout(new BorderLayout());
        frame.add(button[0],BorderLayout.NORTH);
        frame.add(button[1],BorderLayout.WEST);
        frame.add(button[2],BorderLayout.SOUTH);
        frame.add(button[3],BorderLayout.EAST);
        frame.add(button[4],BorderLayout.CENTER);

//                frame.setLayout(new GridLayout(5,3,10,10));//float cai nd de
//        frame.setLayout(new FlowLayout());//float cai nd de
//        frame.setLayout(null);// layout bang null ms set dc location
        frame.setBounds(130,220,500,440);
        frame.setVisible(true);
        System.out.println(frame.getComponentCount());
//    Point p = new Point(130,270);
//    f.setLocation(p);
//    f.setLocation(new Point(130,270));
// f.setSize(500,400);
// f.setSize(new Dimension(500,400));


    }

}
