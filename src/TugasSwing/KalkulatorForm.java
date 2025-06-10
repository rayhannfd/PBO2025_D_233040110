import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class KalkulatorForm extends JFrame implements ActionListener {
    
    private JTextField textField1;
    private JTextField textField2;
    private JButton buttonTambah;
    private JLabel label1, label2;
    
    public KalkulatorForm() {
        label1 = new JLabel("Angka 1:");
        label2 = new JLabel("Angka 2:");
        textField1 = new JTextField(10);
        textField2 = new JTextField(10);
        buttonTambah = new JButton("Tambah");
        
        buttonTambah.addActionListener(this);
        
        setLayout(new GridLayout(3, 2, 5, 5));
        
        add(label1);
        add(textField1);
        add(label2);
        add(textField2);
        add(new JLabel());
        add(buttonTambah);
        
        setTitle("Kalkulator Sederhana");
        setSize(300, 150);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        setLocationRelativeTo(null);
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == buttonTambah) {
            try {
                double angka1 = Double.parseDouble(textField1.getText());
                double angka2 = Double.parseDouble(textField2.getText());
                double hasil = angka1 + angka2;
                
                JOptionPane.showMessageDialog(this, 
                    "Hasil penjumlahan:\n" + angka1 + " + " + angka2 + " = " + hasil,
                    "Hasil Perhitungan", 
                    JOptionPane.INFORMATION_MESSAGE);
                    
            } catch (NumberFormatException ex) {
                JOptionPane.showMessageDialog(this, 
                    "Input tidak valid!\nMasukkan angka yang benar.",
                    "Error", 
                    JOptionPane.ERROR_MESSAGE);
            }
        }
    }
}