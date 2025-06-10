import javax.swing.*;
import java.awt.event.*;

public class HelloWorldForm3 extends JFrame implements ActionListener {
    
    private JLabel label;
    private JButton button;
    
    public HelloWorldForm3() {
        label = new JLabel("Hello World!");
        button = new JButton("Klik Saya!");
        button.addActionListener(this);
        
        setLayout(new java.awt.FlowLayout());
        add(label);
        add(button);
        
        setTitle("Hello World Form 3 - With Button");
        setSize(300, 200);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setVisible(true);
    }
    
    public void actionPerformed(java.awt.event.ActionEvent e) {
        if (e.getSource() == button) {
            label.setText("Button telah diklik!");
            JOptionPane.showMessageDialog(this, "Button berhasil diklik!", 
                "Informasi", JOptionPane.INFORMATION_MESSAGE);
        }
    }
}