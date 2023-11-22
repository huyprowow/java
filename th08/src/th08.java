import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.util.ArrayList;
import java.util.List;

public class th08 extends JFrame implements ActionListener, ItemListener {
    ButtonGroup groupBtn = new ButtonGroup();
    JRadioButton rb1,rb2,rb3;
    JPanel p1,p2,p3,p4;
    JLabel l1,l2,l3;
    JPanel rbCotain= new JPanel(new GridLayout(3,1));
    JCheckBox cb1,cb2,cb3;
    Box horizolbox2=Box.createVerticalBox();
    JPanel cbContain=new JPanel(new GridLayout(3,1));
    Box horizolboxButton=Box.createVerticalBox();
    Box horizolbox1=Box.createVerticalBox();
    Button btnAdd,btnRemove;
    String rawMaterial;
    List<String> typeCoking=new ArrayList<>();
    DefaultListModel<String> listModel = new DefaultListModel<>();





    public th08() throws HeadlessException {
        setBounds(0,0,400,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(2,2));

        p1=new JPanel();
        l1=new JLabel("chon con vat:");
        horizolbox1.add(l1);
        rb1=new JRadioButton("bo");
        rb2=new JRadioButton("ga");
        rb3=new JRadioButton("ca");
        groupBtn.add(rb1);
        groupBtn.add(rb2);
        groupBtn.add(rb3);
        rb2.setSelected(true);
        rbCotain.add(rb1);
        rbCotain.add(rb2);
        rbCotain.add(rb3);
        horizolbox1.add(rbCotain);
        p1.add(horizolbox1);
//
        p2=new JPanel();
        Button btnEnd=new Button("kthuc");
        p2.add(btnEnd);
//
        p3=new JPanel();
        l2=new JLabel("mon co the chon:");
        p3.add(l2);
        horizolbox2.add(l2);
        cb1=new JCheckBox("nuong");
        cb2=new JCheckBox("luoc");
        cb3=new JCheckBox("chien");

        cbContain.add(cb1);
        cbContain.add(cb2);
        cbContain.add(cb3);
        horizolbox2.add(cbContain);
        p3.add(horizolbox2);
//
        p4=new JPanel();
        btnAdd=new Button(">>");
        btnRemove=new Button("<<");
        btnAdd.setEnabled(false);
        btnRemove.setEnabled(false);

        horizolboxButton.add(btnAdd);
        horizolboxButton.add(btnRemove);
        p4.add(horizolboxButton);

        l3=new JLabel("cac mon da chon:");
        p4.add(l3);

//        listModel.addElement("ga nuong");
//        listModel.addElement("ga nuong");
//        listModel.addElement("ga nuong");
        JList<String> list = new JList<>(listModel);
        p4.add(list);
//        p4.add(new ScrollPane(list));


        add(p1);
        add(p2);
        add(p3);
        add(p4);
        rb1.setActionCommand("bo");
        rb2.setActionCommand("ga");
        rb3.setActionCommand("ca");
        rb1.addActionListener(this);
        rb2.addActionListener(this);
        rb3.addActionListener(this);
        cb1.addItemListener(this);
        cb2.addItemListener(this);
        cb3.addItemListener(this);
        btnAdd.addActionListener(this);
        rawMaterial=rb2.getText();
    }

    @Override
    public void actionPerformed(ActionEvent e) {

        if(e.getSource()==btnAdd){
            for (String type:typeCoking
                 ) {
                listModel.addElement(rawMaterial+type);
            }

        }
        if(e.getSource()==rb1||e.getSource()==rb2||e.getSource()==rb3){
            rawMaterial =groupBtn.getSelection().getActionCommand();
        }

    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        Object source = e.getItemSelectable();
        if(source==cb1){
            typeCoking.add(cb1.getText());
        }
        if(source==cb2){
            typeCoking.add(cb2.getText());
        }
        if(source==cb3){
            typeCoking.add(cb3.getText());
        }
        if(!typeCoking.isEmpty()){
            btnAdd.setEnabled(true);
        }
    }

    public static void main(String[] args) {
        JFrame f= new th08();
                f.setVisible(true);

    }
}
