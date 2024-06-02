import javax.swing.JFrame;
import javax.swing.JTextField;
import javax.swing.JLabel;
import javax.swing.JButton;
import javax.swing.JOptionPane;
import java.awt.GridLayout;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;
import java.awt.Font;

public class Quotient extends JFrame implements ActionListener {

    JTextField field1, field2;
    JLabel result;

    public Quotient() {
        setTitle("Quotient");
        setSize(400,400);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new GridLayout(4,1,5,5));

        Font font = new Font("arial", Font.PLAIN, 40);

        field1 = new JTextField();
        field2 = new JTextField();

        result = new JLabel();

        JButton computeBtn = new JButton("Compute");
        computeBtn.addActionListener(this);

        field1.setFont(font);
        field2.setFont(font);
        computeBtn.setFont(font);
        result.setFont(font);

        field1.setHorizontalAlignment(JTextField.TRAILING);
        field2.setHorizontalAlignment(JTextField.TRAILING);
        result.setHorizontalAlignment(JLabel.TRAILING);

        add(field1);
        add(field2);
        add(computeBtn);
        add(result);


    }

    public static void main(String[] args) {
        new Quotient().setVisible(true);
    }

    public void actionPerformed(ActionEvent e) {
        try{
            double num1 = Double.parseDouble( field1.getText() );
            double num2 = Double.parseDouble( field2.getText() );

            double quot = num1/num2;

            result.setText( String.valueOf( quot ) );
        }catch(NumberFormatException ex) {
            
            JOptionPane.showMessageDialog(this, 
                    "You entered an invalid number. Please enter numbers only",
                    "Invalid Entry", 
                    JOptionPane.ERROR_MESSAGE);

        }
    }

}