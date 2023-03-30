import javax.swing.*;

public class MyPanel {
    JFrame frame =new JFrame();
    Box box1=new Box();


    void render(){
        frame.add(box1);
        frame.setSize(400,400);
        frame.setLocationRelativeTo(null);
        frame.setResizable(false);
        frame.setVisible(true);
    }
}
