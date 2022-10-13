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
    public class SimpleMinds extends JFrame implements ActionListener {
    JButton b1, b2;
    JTextField t1;
    SimpleMinds(){
        setBounds(300, 200, 1000, 500); // dleft, //dup // length, height ///////
        getContentPane().setBackground(Color.BLACK);
        setLayout(null);
        setDefaultCloseOperation(EXIT_ON_CLOSE );

        
        JLabel l2 = new JLabel("How well do you know Java?");
        l2.setFont(new Font("Algerian", Font.BOLD, 40));
        l2.setForeground(new Color(128, 0, 0));
        l2.setBounds(200, 60, 800, 45);
        add(l2);
        
        JLabel l3 = new JLabel("PLEASE ENTER YOUR USERNAME");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 28));
        l3.setForeground(new Color(240, 220, 0));
        l3.setBounds(300, 150, 500, 20);
        add(l3);
        
        t1 = new JTextField();
        t1.setBounds(300, 200, 400, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
        b1 = new JButton("Start");
        b1.setBounds(300, 270, 120, 35);
        b1.setBackground(new Color(0, 124, 2));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(550, 270, 120, 35);
        b2.setBackground(new Color(200, 0, 0));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }   

}
