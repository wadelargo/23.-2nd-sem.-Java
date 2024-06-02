import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;
import java.awt.GridLayout;

public class Midterm extends JFrame implements java.awt.event.ActionListener {

    //operations
    private void sum(){
        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());
            double num3 = Double.parseDouble(field2.getText());
            double num4 = Double.parseDouble(field2.getText());
            double num5 = Double.parseDouble(field2.getText());

            double sum = num1+num2+num3+num4+num5;

            result.setText( String.valueOf("Plus " + num1 + " + " + num2 + "+" + num3 + "+" + num4 + "+" + num5+ " = " + sum) );
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                    "You entered an invalid number.",
                    "Invalid Entry", JOptionPane.ERROR_MESSAGE);
            }
    }   
    private void diff(){
        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());

            double diff = num1-num2;

            result.setText( String.valueOf(" Minus ni choy " + num1 + "-" + num2 + " = " + diff ) );
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                    "You entered an invalid number.",
                    "Invalid Entry", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void product(){
        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());

            double product = num1*num2;

            result.setText( String.valueOf("Multiply ni ila ilaha sa! " + num1 + " x " + num2 + " = " + product ) );
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                    "You entered an invalid number.",
                    "Invalid Entry", JOptionPane.ERROR_MESSAGE);
        }
    }
    private void qoutient(){
        try {
            double num1 = Double.parseDouble(field1.getText());
            double num2 = Double.parseDouble(field2.getText());

            double qoutient = num1/num2;

            result.setText( String.valueOf(" Sana ol kamao sa Divide" + num1 + " / " + num2 + " = " + qoutient ) );
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this, 
                    "You entered an invalid number.",
                    "Invalid Entry", JOptionPane.ERROR_MESSAGE);
        }
    }

    JTextField field1, field2, field3, field4, field5;
    JButton sumButton, averageButton, maxButton, minButton;
    JLabel result;

    public Midterm(){
        setTitle("Addition");
        setSize(700,300);
        setDefaultCloseOperation(EXIT_ON_CLOSE);
        setLayout(new java.awt.GridLayout(8,1,5,5));

        sumButton = new JButton("sum");
        averageButton = new JButton("Average");
        maxButton = new JButton("Max");
        minButton = new JButton("Min");

        field1 = new JTextField();
        field2 = new JTextField();
        field3 = new JTextField();
        field4 = new JTextField();
        field5 = new JTextField();

        java.awt.Font font = new java.awt.Font("arial",java.awt.Font.PLAIN, 40);

        JPanel buttonPanel = new JPanel();
        buttonPanel.setLayout(new GridLayout(2,2,5,5));
        buttonPanel.add(sumButton);
        buttonPanel.add(averageButton);
        buttonPanel.add(maxButton);
        buttonPanel.add(minButton);



        field1.setHorizontalAlignment(JTextField.TRAILING);
        field2.setHorizontalAlignment(JTextField.TRAILING);
        field3.setHorizontalAlignment(JTextField.TRAILING);
        field4.setHorizontalAlignment(JTextField.TRAILING);
        field5.setHorizontalAlignment(JTextField.TRAILING);
        result = new JLabel("");
        result.setHorizontalAlignment(JTextField.TRAILING);

        field1.setFont(font);
        field2.setFont(font);
        field3.setFont(font);
        field4.setFont(font);
        field5.setFont(font);
        result.setFont(font);

        add(field1);
        add(field2);
        add(field3);
        add(field4);
        add(field5);
        add(buttonPanel);
        add(result);


        sumButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                sum();
            }
        });

        averageButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                diff();;
            }
        });

        maxButton.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e){
                product();
            }
        });

        minButton.addActionListener( new ActionListener(){
            public void actionPerformed(ActionEvent e){
                qoutient();
            }
        });

    
    
    }

    public static void main(String[] args) {
        new Midterm().setVisible(true);
    }
    @Override
    public void actionPerformed(ActionEvent e) {
    
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }
    
}
