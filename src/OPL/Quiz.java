package OPL;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;



public class Quiz extends JFrame implements ActionListener{
    
      JLabel ql; 
      JButton lg;
      ButtonGroup bg;
      JRadioButton rb[] = new JRadioButton[5];
      int running = 0;
      int count = 0;
    
    String username;
    Quiz(String username){
        this.username = username;
        setBounds(250, 50, 1440, 950);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("simple/minds/icons/quiz.jpg"));
        JLabel l1 = new JLabel(i1);
        l1.setBounds(0, 0, 1440, 392);
        add(l1);
        
        ql = new JLabel();
        add(ql);
       
                
                bg = new ButtonGroup();
                
                for(int i=0;i<5;i++)  
                {
                    rb[i] = new JRadioButton();
                    add(rb[i]);
                    bg.add(rb[i]);
                }
                
                rb[0].setBounds(200,450,200,40);
                rb[0].setFont(new Font("Times New Roman", Font.BOLD, 20));
                rb[1].setBounds(200,495,200,40);
                rb[1].setFont(new Font("Times New Roman", Font.BOLD, 20));
                rb[2].setBounds(200,540,200,40);
                rb[2].setFont(new Font("Times New Roman", Font.BOLD, 20));
                rb[3].setBounds(200,585,200,40);
                rb[3].setFont(new Font("Times New Roman", Font.BOLD, 20));
                
                
                
                
              
                
                lg = new JButton("Next");
                lg.setBounds(230,640,70,40);
                lg.setBackground(new Color(30, 144, 255));
                 lg.setForeground(Color.WHITE);
                lg.addActionListener(this);
      
                add(lg);
                
                lg.addActionListener(this);
                
                
                //Label db = new Label("Developed by Mahmudul Hasan");
                ///db.setBounds(180,410, 200, 30);
                //add(db);
                
                setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	        
                set();
                
        }
        
        public void actionPerformed(ActionEvent e)
        {
           if(e.getSource()==lg)
           {
              if(check())
              {
                 count = count+1; 
              }
              running++;
              set();
              
              if(running ==9)
              { 
                  lg.setText("Result");
              }
           }
           
           if(e.getActionCommand().equals("Result"))
           {
               if(check())
               {
                   count =count+1;
               }
               running++;
             
                JOptionPane.showMessageDialog(this,"Correct Answer :" + count);
                System.exit(0);
           }
        }
        
        void set()
        {
            rb[4].setSelected(true);
            
            if (running ==0)
            {
               ql.setText("What is the extension of compiled java classes?");
               rb[0].setText(".txt");
               rb[1].setText(".class");
               rb[2].setText(" .js");
               rb[3].setText(".java");
            }
            
            if (running ==1)
            {
               ql.setText("Which of these class is a superclass of every class in Java?");
               rb[0].setText("ArrayList class" );
               rb[1].setText("Abstract class");
               rb[2].setText("Object class");
               rb[3].setText("String class");
            }
            if (running ==2)
            {
               ql.setText("Which one of the following is not an access modifier?");
               rb[0].setText("Protected");
               rb[1].setText("Void");
               rb[2].setText("Public");
               rb[3].setText("Private");
            }
            if (running ==3)
            {
               ql.setText("Which of this keyword can be used in a subclass to call the constructor of superclass?");
               rb[0].setText("super");
               rb[1].setText("this");
               rb[2].setText("extent");
               rb[3].setText("extends");
            }
             if (running ==4)
            {
               ql.setText("What is the process of defining a method in a subclass having same name & type signature as a method in its superclass?");
               rb[0].setText("Method overloading");
               rb[1].setText("Method overriding");
               rb[2].setText("Method hiding");
               rb[3].setText("None of the mentioned");
            }
              if (running ==5)
            {
               ql.setText("Which of these is supported by method overriding in Java?");
               rb[0].setText("Abstraction");
               rb[1].setText("Encapsulation");
               rb[2].setText("Polymorphism");
               rb[3].setText("None of the mentioned");
            }
            if (running ==6)
            {
               ql.setText("Which of the following classes can catch all exceptions which cannot be caught?");
               rb[0].setText("RuntimeException");
               rb[1].setText("ParentException");
               rb[2].setText("Exception");
               rb[3].setText("Error");
            }    
             if (running ==7)
            {
               ql.setText("When does Exceptions in Java arises in code sequence?");
               rb[0].setText("Run Time");
               rb[1].setText("Compilation Time");
               rb[2].setText("Can Occur Any Time");
               rb[3].setText("None of the mentioned");
            }    
            if (running ==8)
            {
               ql.setText("AWT stands for ?");
               rb[0].setText(" All Window Toolkit");
               rb[1].setText("Abstract Work Toolkit");
               rb[2].setText("Abstract Window Toolkit");
               rb[3].setText("Abstract Window Text");
            } 
             if (running ==9)
            {
               ql.setText("Which method used to place some text in the text field?");
               rb[0].setText("getText(String str)");
               rb[1].setText("setText(String str)");
               rb[2].setText("putText(String str)");
               rb[3].setText("None of the above");
            } 
            
            ql.setBounds(200,400,700,45);
            ql.setFont(new Font("Verdana", Font.PLAIN, 20));
           
        }
        
        boolean check()
        {
            if(running == 0)
            {
                return(rb[0].isSelected());
            }
            if(running == 1)
            {
                return(rb[2].isSelected());
            }
            if(running == 2)
            {
                return(rb[1].isSelected());
            }
            if(running == 3)
            {
                return(rb[0].isSelected());
            }
            if(running == 4)
            {
                return(rb[1].isSelected());
            }
            if(running == 5)
            {
                return(rb[2].isSelected());
            }
             if(running == 6)
            {
                return(rb[3].isSelected());
            }
              if(running == 7)
            {
                return(rb[0].isSelected());
            }
                if(running == 8)
            {
                return(rb[2].isSelected());
            }
              if(running == 9)
            {
                return(rb[1].isSelected());
            }
            
            return false;
        }


    
    public static void main(String[] args){
        new Quiz("").setVisible(true);
    }
}
