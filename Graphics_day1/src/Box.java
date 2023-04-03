import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class Box extends JPanel implements ActionListener {
    JButton b1=new JButton("play");
    Box() {

        b1.addActionListener(this);
        b1.setBounds(20,20,100,50);
        add(b1);

    }
    @Override
    protected void paintComponent(Graphics g) {
//        super.paintComponent(g);




        g.setColor(Color.pink);
        g.fillRect(10,10,40,40);

        g.setColor(Color.red);
        g.fillRect(10,60,40,40);

        g.setColor(Color.green);
        g.fillRect(10,110,40,40);

        g.setColor(Color.blue);
        g.fillRect(10,170,40,40);
//
////        g.setColor(Color.red);
////        g.fillRect(10,10,200,100);
//
////        g.setColor(Color.black);
////        g.fillRect(15,20,50,50);
//
//        g.setColor(Color.green);
//        g.fillRect(220,10,50,50);
//
////        g.setColor(Color.black);
////        g.fillOval(20,20,50,50);
//        g.setColor(Color.black);
//        g.fillOval(15,20,50,50);
//
//        g.setColor(Color.black);
//        g.fillOval(120,20,50,50);


    }

    @Override
    public void actionPerformed(ActionEvent e) {
        System.out.println("clicked");
        if(e.getSource()==b1){


        }
    }
}
