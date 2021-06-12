import javax.swing.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class GuiByText extends JFrame {

    JLabel Label1 = new JLabel("Coba Input 1");
    JTextField textField1 = new JTextField();
    JButton button1 = new JButton("greet");

    JLabel label2 = new JLabel("panjang");
    JLabel label3 = new JLabel("Lebar");
    JLabel label4 = new JLabel("Hasil");
    JTextField tPanjang = new JTextField();
    JTextField tLebar = new JTextField();
    JTextField tHasil = new JTextField();
    JButton bHitung = new  JButton( "Hitung Luas");

    GuiByText() {
        setSize(640, 480);
        setLocationRelativeTo(null);
        setTitle("GUI By Text");
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    void meletakkanKomponen(){
        getContentPane().setLayout(null);

        getContentPane().add(Label1);
        getContentPane().add(textField1);
        getContentPane().add(button1);
        getContentPane().add(label2);
        getContentPane().add(label3);
        getContentPane().add(label4);
        getContentPane().add(tPanjang);
        getContentPane().add(tLebar);
        getContentPane().add(tHasil);
        getContentPane().add(bHitung);

        Label1.setBounds(16, 32, 100, 25);
        textField1.setBounds(124, 32, 100, 25);
        button1.setBounds(232, 32, 80, 25);
        label2.setBounds(16, 80, 100,25);
        tPanjang.setBounds(124, 80, 100, 25 );
        label3.setBounds(16, 133, 100, 25);
        tLebar.setBounds(124,133,100,25);
        label4.setBounds(16,179,100,25);
        tHasil.setBounds(124,179,100,25);
        bHitung.addActionListener(actionEvent -> {
            int panjang = Integer.parseInt(tPanjang.getText());
            int lebar = Integer.parseInt(tLebar.getText());

            int hasil = panjang * lebar;
            String sHasil = String.valueOf(hasil);

            tHasil.setText(sHasil);
        });
    }

    public static void main(String[] args) {
        GuiByText guiByText = new GuiByText();
        guiByText.meletakkanKomponen();
        guiByText.setVisible(true);
    }

    void menambahkanListener(){
        button1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                String nama = textField1.getText();
                JOptionPane.showMessageDialog(null, "hai" + nama);

            }
        });
    }
}

