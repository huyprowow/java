public class JWindow extends javax.swing.JWindow {
    public JWindow() {

        setSize(300,200);
    }

    public static void main(String[] args) {
        new JWindow().setVisible(true);
    }
}
