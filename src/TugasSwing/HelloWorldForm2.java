import javax.swing.*;

public class HelloWorldForm2 extends JFrame {
    
    public HelloWorldForm2() {
        JLabel label = new JLabel("Hello World!");
        add(label);
        setTitle("Hello World Form 2");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        // Perhatikan: setVisible tidak ada di sini
    }
}