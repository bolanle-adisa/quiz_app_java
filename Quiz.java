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
public class Quiz extends JFrame implements ActionListener{
    JButton next, submit, lifeline;
    public static int count = 0;
    public static int timer = 15;
    public static int ans_given = 0;
    public static int score = 0;
    JLabel qno, question;
    String q[][] = new String[10][5];
    String pa[][] = new String[10][1];
    String qa[][] = new String[10][2];
    JRadioButton opt1, opt2, opt3, opt4;
    ButtonGroup options;
    
    String username;
    Quiz(String username){
        this.username = username;
        setBounds(200, 100, 1000, 700);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        
        qno = new JLabel("");
        qno.setFont(new Font("Tahoma", Font.PLAIN, 24));
        qno.setBounds(50, 150, 50, 30);
        add(qno);
        
        question = new JLabel("");
        question.setFont(new Font("Tahoma", Font.PLAIN, 24));
        question.setBounds(100, 150, 900, 30);
        add(question);
        
        q[0][0] = "In java, jar stands for?";
        q[0][1] = "Java Archive Runner";
        q[0][2] = "Java Archive";
        q[0][3] = "Java Application Resource";
        q[0][4] = "Java Application Runner";

        q[1][0] = "Which is the root class of all AWT events";
        q[1][1] = "java.awt.ActionEvent";
        q[1][2] = "java.awt.AWTEvent";
        q[1][3] = "java.awt.event.AWTEvent";
        q[1][4] = "java.awt.event.Event";

        q[2][0] = "All Java classes are derived from?";
        q[2][1] = "java.lang.Class";
        q[2][2] = "java.util.Name";
        q[2][3] = "java.lang.Object";
        q[2][4] = "java.awt.Window";

        q[3][0] = "What would happen if “String[]args” is not included in the main method?";
        q[3][1] = "No error";
        q[3][2] = "Compilation error";
        q[3][3] = "The program won’t run";
        q[3][4] = "Program exit";

        q[4][0] = "A method named myMethod( ) that needs two integer arguments is declared as?";
        q[4][1] = "public void myMethod( );";
        q[4][2] = "public void myMethod(int a, int b);";
        q[4][3] = "public void myMethod(int a, b);";
        q[4][4] = "public int myMethod(a, b);";

        q[5][0] = "A package is a collection of?";
        q[5][1] = "classes";
        q[5][2] = "interfaces";
        q[5][3] = "editing tools";
        q[5][4] = "classes and interfaces";

        q[6][0] = "Which keyword is used for accessing the features of a package?";
        q[6][1] = "import";
        q[6][2] = "package";
        q[6][3] = "extends";
        q[6][4] = "export";

        q[7][0] = "Which of the following methods belong to the string class?";
        q[7][1] = "length( )";
        q[7][2] = "compare To ( )";
        q[7][3] = "equals ( )";
        q[7][4] = "All of the above";

        q[8][0] = "Each method in a java class must have a unique name.";
        q[8][1] = "Not necessary";
        q[8][2] = "True";
        q[8][3] = "False";
        q[8][4] = "None of the above";

        q[9][0] = "Which of the following is NOT represent legal flow control statements?";
        q[9][1] = "break;";
        q[9][2] = "break();";
        q[9][3] = "continue outer;";
        q[9][4] = "return;";
        
        qa[0][1] = "Java Archive";
        qa[1][1] = "java.awt.AWTEvent";
        qa[2][1] = "java.lang.Object";
        qa[3][1] = "The program won’t run";
        qa[4][1] = "public void myMethod(int a, int b);";
        qa[5][1] = "classes and interfaces";
        qa[6][1] = "import";
        qa[7][1] = "All of the above";
        qa[8][1] = "Not necessary";
        qa[9][1] = "break();";
        
        
        opt1 = new JRadioButton("");
        opt1.setBounds(170, 220, 700, 30);
        opt1.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt1.setBackground(Color.WHITE);
        add(opt1);
        
        opt2 = new JRadioButton("");
        opt2.setBounds(170, 260, 700, 30);
        opt2.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt2.setBackground(Color.WHITE);
        add(opt2);
        
        opt3 = new JRadioButton("");
        opt3.setBounds(170, 300, 700, 30);
        opt3.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt3.setBackground(Color.WHITE);
        add(opt3);
        
        opt4 = new JRadioButton("");
        opt4.setBounds(170, 340, 700, 30);
        opt4.setFont(new Font("Dialog", Font.PLAIN, 20));
        opt4.setBackground(Color.WHITE);
        add(opt4);
        
        options = new ButtonGroup();
        options.add(opt1);
        options.add(opt2);
        options.add(opt3);
        options.add(opt4);
        
        next = new JButton("Next");
        next.setFont(new Font("Tahoma", Font.PLAIN, 22));
        next.setBackground(new Color(30, 144, 255));
        next.setForeground(Color.WHITE);
        next.addActionListener(this);
        next.setBounds(50, 500, 200, 30);
        add(next);
        
        lifeline = new JButton("50-50 Lifeline");
        lifeline.setFont(new Font("Tahoma", Font.PLAIN, 22));
        lifeline.setBackground(new Color(0, 124, 2));
        lifeline.setForeground(Color.BLACK);
        lifeline.setBounds(300, 500, 200, 30);
        lifeline.addActionListener(this);
        add(lifeline);
        
        submit = new JButton("Submit");
        submit.setFont(new Font("Tahoma", Font.PLAIN, 22));
        submit.setEnabled(false);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        submit.setBounds(550, 500, 200, 30);
        add(submit);
        
        start(0);
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == next){
            repaint();
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            
            count++;
            start(count);
        }else if(ae.getSource() == submit){
            ans_given = 1;
            if(options.getSelection() == null){
                pa[count][0] = "";
            }else {
                pa[count][0] = options.getSelection().getActionCommand();
            }

            for(int i =0 ; i < pa.length ; i++){
                if(pa[i][0].equals(qa[i][1])){
                    score+=10;
                }else{
                    score+=0;
                }
            }
            this.setVisible(false);
            new Score(username, score).setVisible(true);
        }else if(ae.getSource() == lifeline){
            if(count == 2 || count == 4 || count == 6 || count == 8 || count == 9){
                opt2.setEnabled(false);
                opt3.setEnabled(false);
            }else {
                opt1.setEnabled(false);
                opt4.setEnabled(false);
            }
            lifeline.setEnabled(false);
        }
    }
    
    public void paint(Graphics g){
        super.paint(g);
        String time = "Time Left - " + timer + " seconds"; // 15
        g.setColor(Color.RED);
        g.setFont(new Font("Tahoma", Font.BOLD, 25));
        
        if(timer > 0) {
            g.drawString(time, 500, 100);
        }else {
            g.drawString("Times Up!!", 500, 100);
        }
        
        timer--; // 14
        
        try{
            Thread.sleep(1000);
            repaint();
        }catch(Exception e){
            e.printStackTrace();
        }
        
        if(ans_given == 1){
            ans_given = 0;
            timer = 15;
        }else if(timer < 0){
            timer = 15;
            opt1.setEnabled(true);
            opt2.setEnabled(true);
            opt3.setEnabled(true);
            opt4.setEnabled(true);
            
            if(count == 8){
                next.setEnabled(false);
                submit.setEnabled(true);
            }
            if(count == 9){
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                
                for(int i =0 ; i < pa.length ; i++){
                    if(pa[i][0].equals(qa[i][1])){
                        score+=10;
                    }else{
                        score+=0;
                    }
                }
                this.setVisible(false);
                new Score(username, score).setVisible(true);
            }else{
                if(options.getSelection() == null){
                    pa[count][0] = "";
                }else {
                    pa[count][0] = options.getSelection().getActionCommand();
                }
                count++;
                start(count);
            }
        }
    }
    
    public void start(int count){
        qno.setText("" + (count + 1) + ". ");
        question.setText(q[count][0]);
        opt1.setLabel(q[count][1]);
        opt1.setActionCommand(q[count][1]);
        opt2.setLabel(q[count][2]);
        opt2.setActionCommand(q[count][2]);
        opt3.setLabel(q[count][3]);
        opt3.setActionCommand(q[count][3]);
        opt4.setLabel(q[count][4]);
        opt4.setActionCommand(q[count][4]);
        options.clearSelection();
    }
    
    public static void main(String[] args){
        new Quiz("").setVisible(true);
    }
    
}
