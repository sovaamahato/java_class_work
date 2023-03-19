import javax.swing.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame = new JFrame("Hello world");

        frame.setSize(400,500);
        frame.setLayout(null);
        frame.setVisible(true);

        //to place a textfield
        JTextField textField=new JTextField("textfield");
        textField.setBounds(100,50,100,50);
        frame.add(textField);

        //to place button
        JButton button =new JButton("click here");
        button.setBounds(100,100,100,50);

        frame.add(button);


    }
}