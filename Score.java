/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapplication;



import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Score extends JFrame implements ActionListener {
    JButton submit, back;

    Score(String name, int score) {
        setBounds(400, 150, 750, 550);
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1 = new ImageIcon(ClassLoader.getSystemResource("test_icons/scoreph.png"));
        Image i2 = i1.getImage().getScaledInstance(300, 250, Image.SCALE_DEFAULT);
        ImageIcon i3 = new ImageIcon(i2);
        JLabel image = new JLabel(i3);
        image.setBounds(0, 200, 300, 250);
        add(image);
        
        JLabel heading = new JLabel("Thank You " + name + " for attempting the test");
        heading.setBounds(45, 30, 700, 30);
        heading.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(heading);
        
        JLabel lblscore = new JLabel("Your score is " + score+ " /100");
        lblscore.setBounds(350, 200, 300, 30);
        lblscore.setFont(new Font("Tahoma", Font.PLAIN, 26));
        add(lblscore);
        
        submit = new JButton("Attempt Again");
        submit.setBounds(320, 270, 120, 30);
        submit.setBackground(new Color(30, 144, 255));
        submit.setForeground(Color.WHITE);
        submit.addActionListener(this);
        add(submit);
        
        back = new JButton("Close");
        back.setBounds(460, 270, 120, 30);
        back.setBackground(new Color(30, 144, 255));
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        setVisible(true);
    }
    
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==submit){
            setVisible(false);
            new login();
            
            
          
            
        }
        else if(ae.getSource()==back){
            setVisible(false);
            
        }
        
    }

    public static void main(String[] args) {
        new Score("User", 0);
    }
}