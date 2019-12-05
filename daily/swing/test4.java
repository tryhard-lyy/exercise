package javaswing;

import javax.swing.*;
import java.awt.*;

public class test4 extends JPanel {

    private Image image;
    test4(){
        super();
        image = Toolkit.getDefaultToolkit().getImage("bg.jpeg");
    }
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawImage(image, 0, 0, this.getWidth(), this.getHeight(), this);
    }
    public static void main(String [] args){
        JFrame frame = new JFrame("有背景的面板");
        test4 panel = new test4();
        frame.add(panel);
        frame.setVisible(true);
        frame.setBounds(300, 300, 400, 500);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
