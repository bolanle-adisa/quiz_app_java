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

   public class Rules extends JFrame implements ActionListener{
    JButton b1, b2; 
    String username;
    /*JFrame f1=new JFrame();
    JPanel panel= new JPanel();*/
    
    Rules(String username){
        this.username = username;
        setBounds(300, 200, 1000, 600);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        /*JScrollPane scroll = new JScrollPane();
        scroll.setHorizontalScrollBarPolicy(JScrollPane.HORIZONTAL_SCROLLBAR_ALWAYS);
        scroll.setVerticalScrollBarPolicy(JScrollPane.VERTICAL_SCROLLBAR_ALWAYS);*/
        
        
       // panel.add(scroll,BorderLayout.CENTER);
        
        
        
        
        JLabel l1 = new JLabel( username + ", Welcome to OurQuiz!");
        l1.setForeground(new Color(128, 0, 0));
        l1.setFont(new Font("Times New Roman", Font.BOLD, 28));
        l1.setBounds(50, 20, 1000, 30);
        add(l1);
        
       // panel.add(l1);
        
        JLabel l2 = new JLabel(" ");
        l2.setFont(new Font("Times New Roman", Font.BOLD, 16));
        l2.setBounds(20, 50, 850, 450);
        l2.setText(
            "<html>"+ 
                "This is a quick guide before you begin the quiz " + " <br><br> " +
                "Instructions:  " + "<br><br>" +
                "1. Each Question is worth 10 points." + "<br><br>" +
                "2. There are 10 multiple choice questions." + "<br><br>" +
                "3. Each Question has a timer for 15 seconds." + "<br><br>" +
                "4. You can use a 50-50 Lifeline to narrow down your answer to two options." + "<br><br>" +
                "5. You cannot skip a question and go back to it, you have to answer each question before moving to the next." + "<br><br>" +
                "--------------------------------------------------------------------------------------------------------------- " + "<br><br>" +
                " This quiz is to test your knowledge on the things we learnt in Java. It will also test your speed and accuracy while answering the question. You will be given the chance to take it as many times as you want to familiarize yourself with the questions and once you are done, please meet your instructor for the answer key." + "<br><br>" +
                " Good Luck and thank you." + "<br><br>" +
            "<html>"
        );
        add(l2);
        
       // panel.add(l2);
        
        b1 = new JButton("Back");
        b1.setBounds(250, 500, 100, 30);
        b1.setBackground(new Color(200, 0, 0));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
       // panel.add(b1);
        
        b2 = new JButton("Start");
        b2.setBounds(400, 500, 100, 30);
        b2.setBackground(new Color(0, 124, 2));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        /*panel.add(b2);
        f1.add(panel);*/
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            this.setVisible(false);
            new SimpleMinds().setVisible(true);
        }else if(ae.getSource() == b2){
            this.setVisible(false);
            new Quiz(username).setVisible(true);
        }
    }
    
    public static void main(String[] args){
        new Rules("");
    } 
}
