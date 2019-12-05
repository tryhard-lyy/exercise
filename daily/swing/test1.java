package javaswing;

import javax.swing.*;

public class test1 {
    public static void main(String [] args){
        JFrame frame = new JFrame("the first gui ");
        frame.setBounds(200, 200, 400, 200);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE); //设置关闭方式
    }
}
