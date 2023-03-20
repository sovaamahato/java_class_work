import javax.swing.*;
import java.awt.*;

public class Main {
    public static void main(String[] args) {
        JFrame frame= new JFrame();

        //to get title-------
        frame.setTitle("Sovaa");

        //to disable resizing the frame
        frame.setResizable(false);

        //when the cross button is clicked the program should terminate
        //instead of just only hiding
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);



        ///////--------------------------

        //to add button on screen
        JButton button=new JButton("click here");
        button.setBounds(150,100,100,50);
        frame.add(button);

        //to add background color-----
        frame.getContentPane().setBackground(Color.GRAY);



        //so that the layout manager do not run automatically
        frame.setLayout(null);

        frame.setSize(400,400);
        frame.setVisible(true);
    }
}