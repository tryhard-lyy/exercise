package javaswing;

import javax.swing.*;
import java.awt.*;

public class test7 {
    public static void main(String [] args){
        GridLayout grid = new GridLayout(18, 18);
        JFrame frame = new JFrame();
        JButton button1 = new JButton("Up");
        JButton button2 = new JButton("Down");
        JPanel chess = new JPanel();
        chess.setLayout(grid);
        Label[][] label = new Label[18][18];
        for(int i=0; i<18; i++){
            for(int j=0; j<18; j++){
                label[i][j] = new Label();
                if((i+j)%2==0){
                    label[i][j].setBackground(Color.black);
                }
                else{
                    label[i][j].setBackground(Color.white);
                }
                chess.add(label[i][j]);
            }
        }
        frame.add(button1, BorderLayout.NORTH);
        frame.add(button2, BorderLayout.SOUTH);
        frame.add(chess, BorderLayout.CENTER);
        frame.setBounds(300, 300, 400, 400);
        frame.setVisible(true);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
}
