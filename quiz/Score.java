package quiz;

import javax.swing.*;

import java.awt.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener{
    
    String name;
    int score;
    Score(String name,int score){
        this.name=name;
        this.score=score;
        
        setBounds(400,150,750,550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        setDefaultCloseOperation(WindowConstants.EXIT_ON_CLOSE);
        
        ImageIcon i1=new ImageIcon(ClassLoader.getSystemResource("icons/score.png"));
        Image i2=i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3=new ImageIcon(i2);
        JLabel img=new JLabel(i3);
        img.setBounds(0,200,300,250  );
        add(img);
        
        JLabel heading=new JLabel("Thank You "+name+" For Playing");
        heading.setBounds(45,30,700,30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore=new JLabel("Your Score is : "+score);
        lblscore.setBounds(350,200,300,30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);
        
        JButton play=new JButton("Play Again");
        play.setBounds(380,270,120,30);
        //play.setFont(new Font("Tahoma", Font.PLAIN, 22));
        play.setBackground(new Color(30,144,255));
        play.setForeground(Color.WHITE);
        play.addActionListener(this);
        add(play);
        
        
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent e){
        setVisible(false);
        new Login();
    }
    
    
    public static void main(String args[]){
        new Score("",0);
    }
}
