package javaswing;

import javax.swing.*;
import java.awt.*;

public class test8 {
    public void init(){
        JPanel jpv = new JPanel();
        jpv.setLayout(new BoxLayout(jpv, BoxLayout.X_AXIS));
        for(int i=0; i<5; i++){
            jpv.add(new Button("button" + i));
        }
        JPanel jph = new JPanel();
        jph.setLayout(new BoxLayout(jph, BoxLayout.Y_AXIS));
        for(int j=0; j<5; j++){
            jph.add(new Button("button" + j));
        }
        JFrame frame = new JFrame("盒式布局");
        frame.add(jpv, "North");
        frame.add(jph, "South");
        frame.setSize(600, 800);
        frame.setLocation(300, 300);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    public static void main(String [] args){
        test8 test = new test8();
        test.init();
    }
}
