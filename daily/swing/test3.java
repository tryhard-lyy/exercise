package javaswing;

import javax.swing.*;

public class test3 extends JFrame{
    JDialog dialog;
    test3(String s, int x, int y, int w, int h){
        super(s);
        setBounds(x, y, w, h);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        dialog = new JDialog();
        dialog.setBounds(250, 250, 400, 200);
        dialog.setTitle("对话框");
        dialog.setVisible(true);
        dialog.setDefaultCloseOperation(JDialog.DISPOSE_ON_CLOSE);
    }
    public static void main(String [] args){
        test3 frame = new test3("窗口", 250, 50, 400, 200);
    }
}
