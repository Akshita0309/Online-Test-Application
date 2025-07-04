/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapplication;

import java.awt.*;
import javax.swing.*;
import java.awt.event.*;

public class Rules extends JFrame implements ActionListener {
    String name;
    JButton back, start;
    
    Rules(String name){
        this.name= name;
        
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        JLabel heading= new JLabel("Welcome "+name+" to Simple Minds");
        heading.setBounds(50,20,700,30);
        heading.setFont(new Font("Calibri", Font.BOLD, 30));
        heading.setForeground(Color.black);
        add(heading);
        
        JLabel rule= new JLabel();
        rule.setBounds(20,90,700,350);
        rule.setFont(new Font("Calibri", Font.PLAIN, 15));
        rule.setForeground(Color.black);
        rule.setText(
                "<html>"+
                        "1.Each quiz has a set time duration. Submissions after the timer ends may not be accepted."+ "<br><br>"+
                        "2.You must complete the quiz without using books, internet searches, or assistance from others"+ "<br><br>"+
                        "3.Ensure a reliable internet connection to avoid disconnection or data loss during the quiz."+ "<br><br>"+
                        "4.Reloading or closing the window may result in automatic submission or disqualification."+ "<br><br>"+
                        "5.Any form of cheating, copying, or using unauthorized tools will result in disqualification."+ "<br><br>"+
                        "6.Maintain honesty and integrity. All responses must be your own original work." + "<br><br>"+
                        "7.If you face a glitch or system crash, contact the quiz admin or instructor right away with screenshots, if possible." +"<br><br>"+
                        "8.Do not share quiz links, questions, or answers with others."+"<br><br>"+
                        
                    "<html>"
        
        );
        
        add(rule);
        
        back= new JButton("Back");
        back.setBounds(250,500,100,30);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        start= new JButton("Start");
        start.setBounds(400,500,100,25);
        start.setBackground(Color.BLACK);
        start.setForeground(Color.WHITE);
        start.addActionListener(this);
        add(start);
        
        setSize(800,650);
        setLocation(350,100);
        setVisible(true);
        
        
        
        
        
    }
    
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==start){
            setVisible(false);
            new Test(name);
            
        }
        else{
            setVisible(false);
            new login();
        }
        
    }
    
    public static void main(String[] args){
        new Rules("User");
        
    }
    
}
