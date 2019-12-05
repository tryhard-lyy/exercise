package javaswing;

import javax.swing.*;
import java.awt.*;

public class test6 {
    public static void main(String [] args){
        JFrame frame = new JFrame();
        JLabel jt = new JLabel("which one is your choice?");
        JButton yes = new JButton("yes");
        JButton no = new JButton("no");
        FlowLayout flow = new FlowLayout();
        frame.setLayout(flow);
        frame.add(jt);
        frame.add(yes);
        frame.add(no);
        frame.setBounds(300, 300, 500, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
