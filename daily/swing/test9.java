package javaswing;

import javax.swing.*;

public class test9 {
    public static void main(String [] args){
        JFrame frame = new JFrame();
        JButton button = new JButton("Yes");
        JButton button1 = new JButton("No");
        frame.setLayout(null);
        frame.add(button);
        frame.add(button1);
        button.setBounds(100, 100, 100, 50);
        button1.setBounds(100, 250, 100, 50);
        frame.setBounds(300, 300, 400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
