import javax.swing.*;

public class HelloWorldForm1 extends JFrame {
    
    public HelloWorldForm1() {
        JLabel label = new JLabel("Hello World!");
        add(label);
        setTitle("Hello World Form 1");
        setSize(300, 200);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}