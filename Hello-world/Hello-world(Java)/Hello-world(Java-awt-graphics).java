import java.awt.*;
public class Main extends Frame {
    public Main(){
        setVisible(true);
        setSize(100,100);
    }
    @Override
    public void paint(Graphics g){
        g.drawString("Hello-world",0,50);
    }
    public static void main(String[] args) {
        new Main();
    }
}
