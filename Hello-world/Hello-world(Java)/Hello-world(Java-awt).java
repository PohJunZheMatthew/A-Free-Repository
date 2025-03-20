import java.awt.*;
public class Main {
    public static void main(String[] args) {
        Frame frame = new Frame();
        Label label = new Label("Hello world");
        frame.setSize(100,100);
        frame.add(label);
        frame.setVisible(true);
        frame.addWindowListener(new WindowAdapter() {
            @Override
            public void windowClosing(WindowEvent e) {
                frame.dispose();
                System.exit(0);
            }
        });
    }
}
