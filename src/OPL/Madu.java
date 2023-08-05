package OPL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class Madu extends JFrame implements ActionListener{
    
    JButton b1, b2;
    JTextField t1;
    Madu(){
        setBounds(300, 50, 800, 800); // dleft, //dup // length, height ///////
        getContentPane().setBackground(Color.BLUE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/login.jpeg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(210, 60, 300,200);
        add(l1);
        
        JLabel l2 = new JLabel("University of Information Technology and Sciences");
        l2.setFont(new Font("Mongolian Baiti", Font.BOLD, 24));
        l2.setForeground(new Color(30, 144, 254));
        l2.setBounds(150, 290, 600, 45);
        add(l2);
        
        JLabel l3 = new JLabel("Department of Information Technology");
        l3.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        l3.setForeground(new Color(30, 144, 254));
        l3.setBounds(150, 340, 600, 40);
        add(l3);
        
        JLabel l4 = new JLabel("OOPL LAB II Quiz");
        l4.setFont(new Font("Times New Roman", Font.BOLD, 20));
        l4.setForeground(new Color(30, 144, 254));
        l4.setBounds(150, 385, 500, 45);
        add(l4);
        
        JLabel l5 = new JLabel("Enter Your Name");
        l5.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l5.setForeground(new Color(30, 144, 254));
        l5.setBounds(100, 430, 300, 20);
        add(l5);
        
        t1 = new JTextField();
        t1.setBounds(205, 455, 300, 25);
        t1.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t1);
        
        JLabel l6 = new JLabel("Enter Your ID");
        l6.setFont(new Font("Mongolian Baiti", Font.BOLD, 18));
        l6.setForeground(new Color(30, 144, 254));
        l6.setBounds(100, 485, 300, 20);
        add(l6);
        
         
        
        JTextField t2 = new JTextField();
        t2.setBounds(205, 515, 300, 25);
        t2.setFont(new Font("Times New Roman", Font.BOLD, 20));
        add(t2);
        
        b1 = new JButton("Enter");
        b1.setBounds(200, 560, 120, 25);
        b1.setBackground(new Color(30, 144, 254));
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        
        b2 = new JButton("Exit");
        b2.setBounds(330, 560, 120, 25);
        b2.setBackground(new Color(30, 144, 254));
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        setVisible(true);
        
    }
    
    @Override
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource() == b1){
            String name = t1.getText();
            this.setVisible(false);
            new Rules(name);
        }else{
            System.exit(0);
        }
    }

    public static void main(String[] args) {
        new Madu();
    }
    
}
