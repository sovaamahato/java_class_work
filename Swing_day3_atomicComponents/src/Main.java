import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Sovaa");


        JTextField textField =new JTextField("Enter your name:");
        textField.setBounds(100,100,150,30);
        frame.add(textField);

        JTextField textField2 =new JTextField("Enter password");
        textField2.setBounds(100,140,150,30);
        frame.add(textField2);


        String[] fruits ={"apple","Orange","Mango"};
        
        JComboBox comboBox1=new JComboBox(fruits);
        comboBox1.setBounds(100,180,150,30);
        frame.add(comboBox1);


        JButton button =new JButton("login");
        button.setBounds(120,220,100,40);
        frame.add(button);





        frame.setResizable(false);
        frame.setSize(400,400);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.setLayout(null);

        frame.setVisible(true);
    }
}