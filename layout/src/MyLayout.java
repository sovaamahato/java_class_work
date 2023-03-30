import javax.swing.*;
import java.awt.*;

public class MyLayout {

    JFrame frame =new JFrame("Layout");

    JPanel p1= new JPanel();
    JPanel p2= new JPanel();
    JPanel p3= new JPanel();
    JPanel p4= new JPanel();
    JPanel p5= new JPanel();



    void render() {


        p1.setBackground(Color.orange);
        frame.setLayout(new BorderLayout());
        frame.add(p1,BorderLayout.EAST);

        p2.setBackground(Color.green);
        frame.add(p2,BorderLayout.WEST);

        p3.setBackground(Color.blue);
        frame.add(p3,BorderLayout.NORTH);

        p4.setBackground(Color.black);
        frame.add(p4,BorderLayout.SOUTH);

        p5.setBackground(Color.pink);
        frame.add(p5,BorderLayout.CENTER);

//appbar
        p3.setLayout(new FlowLayout(FlowLayout.LEFT));
        p3.add(new JButton("button 1"));
        p3.add(new JButton("button 2"));
        p3.add(new JButton("button 3"));


        // left side drawer
        p2.setLayout(new BoxLayout(p2,BoxLayout.Y_AXIS));
        p2.add(new JButton("button 1"));
        p2.add(new JButton("button 2"));
        p2.add(new JButton("button 3"));


        //grid
        p5.setLayout(new GridLayout(3,2,5,5));
        p5.add(new JButton("button 1"));
        p5.add(new JButton("button 2"));
        p5.add(new JButton("button 3"));
        p5.add(new JButton("button 4"));
        p5.add(new JButton("button 5"));

        frame.setSize(600,450);
        frame.setResizable(false);

        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setLocationRelativeTo(null);
        frame.setVisible(true);
    }
}
