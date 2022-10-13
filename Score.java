/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ourquiz;
import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

/**
 *
 * @author bolan
 */
public class Score extends JFrame implements ActionListener{
    Score(String username, int score){
        setBounds(300, 150, 950, 550);
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );
        
        
        JLabel l2 = new JLabel("Thank you " + username + " for Participating!!!");
        l2.setBounds(45, 30, 1000, 30);
        l2.setFont(new Font("Algerian", Font.BOLD, 34));
        l2.setForeground(new Color(128, 0, 0));
        add(l2);
        
        JLabel l3 = new JLabel("Your Score is " + score);
        l3.setBounds(200, 100, 400, 50);
        l3.setFont(new Font("Times New Roman", Font.BOLD, 50));
        l3.setForeground(new Color(240, 220, 0));
        add(l3);
        
        JButton b1 = new JButton("Take Again!");
        b1.setBackground(Color.PINK);
        b1.setForeground(Color.BLACK);
        b1.addActionListener(this);
        
        b1.setBounds(250, 270, 220, 50);
        add(b1);
    }
    public void actionPerformed(ActionEvent ae){
        this.setVisible(false);
        new SimpleMinds().setVisible(true);
    }
    
    public static void main(String[] args){
        new Score("", 0).setVisible(true);
    }
}
