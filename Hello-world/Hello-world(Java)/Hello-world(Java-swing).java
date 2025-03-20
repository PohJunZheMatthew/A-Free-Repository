import javax.swing.*;
public class Main {
    public static void main(String[] args) {
        JFrame jFrame = new JFrame();
        JLabel jLabel = new JLabel("Hello world");
        jFrame.add(jLabel);
        jFrame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        jFrame.setSize(100,100);
        jFrame.setVisible(true);
    }
}
