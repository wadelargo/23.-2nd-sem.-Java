import java.awt.event.ActionEvent;
import java.awt.GridLayout;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;


import java.awt.event.ActionListener;

public class Application extends JFrame implements java.awt.event.ActionListener {
    private void sum() { 
        try{
             double num1 = Double.parseDouble(field1.getText());
             double num2 = Double.parseDouble(field2.getText());
             double sum = num1+num2;
             result.setText("sum" + sum);
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,"Please enter a number" , "Agoii", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void diff() { 
        try{
             double num1 = Double.parseDouble(field1.getText());
             double num2 = Double.parseDouble(field2.getText());
             double diff = num1-num2;
             result.setText("diff" + diff);
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,"Please enter a number" , "Agoii", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void product() { 
        try{
             double num1 = Double.parseDouble(field1.getText());
             double num2 = Double.parseDouble(field2.getText());
             double product = num1*num2;
             result.setText("Product" + product);
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,"Please enter a number" , "Agoii", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void qoutient() { 
        try{
             double num1 = Double.parseDouble(field1.getText());
             double num2 = Double.parseDouble(field2.getText());
             double qoutient = num1/num2;
             result.setText("qoutient" + qoutient);
        }catch(NumberFormatException ex) {
            JOptionPane.showMessageDialog(this,"Please enter a number" , "Agoii", JOptionPane.ERROR_MESSAGE);
        }
    }

    private void clear() {
        field1.setText(String.valueOf(""));
        field2.setText(String.valueOf(""));
        result.setText(String.valueOf(""));
    }

    JTextField field1, field2;
    JLabel result;
    JButton addButton, diffButton, mulButton, divButton, clearButton;

    public Application() {
    setTitle("Addition");
    setSize(300,400);
    setDefaultCloseOperation(EXIT_ON_CLOSE);
    setLayout(new java.awt.GridLayout(4,1,5,5));

    addButton = new JButton("+");
    diffButton = new JButton("-");
    mulButton = new JButton("*");
    divButton = new JButton("/");
    clearButton = new JButton("C");

    JPanel btnPanel = new JPanel();
    btnPanel.setLayout(new GridLayout(1,4,5,5));
    btnPanel.add(addButton);
    btnPanel.add(diffButton);
    btnPanel.add(mulButton);
    btnPanel.add(divButton);
    btnPanel.add(divButton);
    btnPanel.add(clearButton);


    field1 = new JTextField();
    field2 = new JTextField();

    field1.setHorizontalAlignment(JTextField.TRAILING);
    field2.setHorizontalAlignment(JTextField.TRAILING);

    result = new JLabel("");
    result.setHorizontalAlignment(JLabel.TRAILING);
    result.setFont(getFont());




    add(field1);
    add(field2);
    add(btnPanel);
    add(result);

    addButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            sum();
        }
    });
    
    diffButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            diff();
        }
    });

    mulButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            product();
        }
    });

    divButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            qoutient();
        }
    });

    clearButton.addActionListener(new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            clear();
        }
    });
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        // TODO Auto-generated method stub
        throw new UnsupportedOperationException("Unimplemented method 'actionPerformed'");
    }

    public static void main(String[] args) {
        new Application().setVisible(true);
    }
}
