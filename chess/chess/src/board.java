import java.awt.*;


import javax.swing.*;
public class board {
    JFrame b= new JFrame();
    JPanel squares [][]= new JPanel[8][8];
     public board(){
        b= new JFrame("ELVAS CHESS");
        b.setSize(700,700);
        b.setLayout( new GridLayout (8,8));
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                squares[i][j] = new JPanel();
    
                if ((i + j) % 2 == 0) {
                    squares[i][j].setBackground(Color.red);
                } else {
                    squares[i][j].setBackground(Color.yellow);
                }   
                b.add(squares[i][j]);
            }
        }
     
  b.setVisible(true);
 b.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
 b.setResizable(false);
    

     }
    }
