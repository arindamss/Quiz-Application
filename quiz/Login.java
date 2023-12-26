package quiz;

import javax.swing.JFrame;
import javax.swing.ImageIcon;
import javax.swing.JLabel;
import javax.swing.JTextField;
import javax.swing.JButton;
import javax.swing.WindowConstants;
import java.awt.Color;
import java.awt.Font;
import java.awt.event.ActionListener;
import java.awt.event.ActionEvent;


public class Login extends JFrame implements ActionListener{
    JButton rules,back;
    JTextField tfname;
    Login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/login.jpeg"));
        JLabel img=new JLabel(i1);
        img.setBounds(0,0,600,500);
        add(img);
        
        JLabel heading=new JLabel("The Quizinator");
        heading.setBounds(775,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 37));
        heading.setForeground(new Color(30,145,254));
        add(heading);
        
        JLabel name=new JLabel("Enter Your Name");
        name.setBounds(850,130,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD,18));
        name.setForeground(new Color(30,144,254));
        add(name);
        
        tfname=new JTextField();
        tfname.setBounds(770,175,300,25);
        tfname.setFont(new Font("Times New Roman", Font.ROMAN_BASELINE, 20));
        add(tfname);
        
        rules=new JButton("Rules");
        rules.setBounds(770,270,120,25);
        rules.setBackground(new Color(30,144,254));
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back=new JButton("Back");
        back.setBounds(950,270,120,25);
        back.setBackground(new Color(30,144,254));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        
        setLocation(200,150);
        setSize(1200,500);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        setVisible(true);
        
    }
    
    public void actionPerformed(ActionEvent e){
        if(e.getSource() == rules){
            String name=tfname.getText();
            new Rules(name);
            setVisible(false);
            
        }
        else if(e.getSource() == back){
            dispose();
            System.exit(0);
        }
    }
    
    public static void main(String args[]){
        new Login();
    }
}
