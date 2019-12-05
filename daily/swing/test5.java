package javaswing;

import javax.swing.*;
import java.awt.*;

public class test5 {

    public static void main(String [] args){
        JFrame frame = new JFrame("BorderLayout 布局");
        JButton b1 = new JButton("东");
        JButton b2 = new JButton("西");
        JButton b3 = new JButton("南");
        JButton b4 = new JButton("北");
        JButton b5 = new JButton("中");
        frame.add(b1, BorderLayout.EAST);
        frame.add(b2, BorderLayout.WEST);
        frame.add(b3, BorderLayout.SOUTH);
        frame.add(b4, BorderLayout.NORTH);
        frame.add(b5, BorderLayout.CENTER);
        frame.setBounds(300, 300, 500, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
