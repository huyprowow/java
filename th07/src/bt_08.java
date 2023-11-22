import javax.swing.*;
import java.awt.*;

public class bt_08 {

    public static void main(String[] args) {
        JFrame f=new JFrame("th7");
        f.setBounds(0,0,350,400);
        Box bv=Box.createVerticalBox();
        //dau
        Box bTop= Box.createHorizontalBox();
        bTop.setAlignmentX(Component.RIGHT_ALIGNMENT);
        for (int i = 0; i < 4; i++) {
            JButton button=new JButton("B"+i);
            button.setSize(50,30);
            bTop.add(button);
        }
        bv.add(bTop);
        // doan giua
        String txt="This is an editable JTextArea. " +
                "A text area is a \"plain\" text component, " +
                "which means that although it can display text " +
                "in any font, all of the text is in the same font.";
        JTextArea textArea = new JTextArea(1,1);
        textArea.setText(txt);
        textArea.setLineWrap(true);
        textArea.setBorder(BorderFactory.createEmptyBorder(12,12,72,72));
        Box bvMiddle= Box.createHorizontalBox();
        bvMiddle.add(textArea);

        JPanel panelRight=new JPanel();
        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
        panelRight.setPreferredSize(new Dimension(100,200));
        panelRight.setBorder(BorderFactory.createTitledBorder("column"));
        for (int i = 0; i < 4; i++) {
            JButton button=new JButton("B"+i);
            button.setSize(50,30);
            panelRight.add(button);
        }
        bvMiddle.add(panelRight);

        bv.add(bvMiddle);
        // may nut duoi
        JButton ok=new JButton("ok");
        JButton cancel=new JButton("cancel");
        JButton help=new JButton("help");
        ok.setSize(50,30);
        help.setSize(50,30);
        cancel.setSize(50,30);

        Box bBottom= Box.createHorizontalBox();
        bBottom.setAlignmentX(Component.CENTER_ALIGNMENT);

        bBottom.add(Box.createHorizontalGlue());
        bBottom.add(ok);

        bBottom.add(Box.createHorizontalGlue());
        bBottom.add(cancel);

        bBottom.add(Box.createHorizontalGlue());
        bBottom.add(help);
        bv.add(bBottom);
        f.add(bv);
        f.setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        f.setVisible(true);
    }
}
//cach 2
//public class bt_08 {
//
//    public static void main(String[] args) {
//        JFrame f=new JFrame("th7");
//        f.setBounds(0,0,350,400);
//        f.setLayout(new FlowLayout(FlowLayout.LEFT));
//        JPanel panelTop= new JPanel(new FlowLayout(FlowLayout.LEFT));
//        for (int i = 0; i < 4; i++) {
//            JButton button=new JButton("B"+i);
//            button.setSize(50,30);
//            panelTop.add(button);
//        }
//        f.add(panelTop);
//        String txt="This is an editable JTextArea. " +
//                "A text area is a \"plain\" text component, " +
//                "which means that although it can display text " +
//                "in any font, all of the text is in the same font.";
//        JTextArea textArea = new JTextArea(3,1);
//        textArea.setText(txt);
//        textArea.setLineWrap(true);
//        textArea.setBorder(BorderFactory.createEmptyBorder(12,12,72,72));
//        f.add(textArea);
//        JPanel panelRight=new JPanel();
//        panelRight.setLayout(new BoxLayout(panelRight, BoxLayout.Y_AXIS));
//        panelRight.setPreferredSize(new Dimension(100,200));
//        panelRight.setBorder(BorderFactory.createTitledBorder("column"));
//        for (int i = 0; i < 4; i++) {
//            JButton button=new JButton("B"+i);
//            button.setSize(50,30);
//            panelRight.add(button);
//        }
//        f.add(panelRight);
//        JPanel panelBottom=new JPanel(new FlowLayout());
//        JButton ok=new JButton("ok");
//        JButton cancel=new JButton("cancel");
//        JButton help=new JButton("help");
//        ok.setSize(50,30);
//        help.setSize(50,30);
//        cancel.setSize(50,30);
//
//        panelBottom.add(ok);
//        panelBottom.add(cancel);
//        panelBottom.add(help);
//        f.add(panelBottom);
//        f.setVisible(true);
//    }
//}
