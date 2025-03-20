import javax.swing.*;
import java.awt.*;
public class Main extends JFrame {
    public Main(){
        setVisible(true);
        setSize(100,100);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    @Override
    public void paint(Graphics g){
        g.drawString("Hello-world",0,50);
    }
    public static void main(String[] args) {
        new Main();
    }
}
