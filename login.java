/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package testapplication;

import javax.swing.*;
import java.awt.*;
import  java.awt.event.*;


public class login extends JFrame implements ActionListener {
    JButton rules, back;
    JTextField tfname;
    
    login(){
        getContentPane().setBackground(Color.WHITE);
        setLayout(null);
        
        ImageIcon i1= new ImageIcon(ClassLoader.getSystemResource("test_icons/l2.jpeg"));
        JLabel image= new JLabel(i1);
        image.setBounds(0,0,500,500);
        add(image);
        
        JLabel heading= new JLabel("JAVA TEST");
        heading.setBounds(750,60,300,45);
        heading.setFont(new Font("Viner Hand ITC", Font.BOLD, 40));
        heading.setForeground(Color.black);
        add(heading);
        
        JLabel name= new JLabel("Enter your name:");
        name.setBounds(700,200,300,20);
        name.setFont(new Font("Mongolian Baiti", Font.BOLD, 20));
        name.setForeground(Color.black);
        add(name);
        
         tfname= new JTextField();
        tfname.setBounds(700,250,300,20);
        tfname.setFont(new Font("Times New Roman", Font.BOLD, 15));
        add(tfname);
        
        rules= new JButton("Rules");
        rules.setBounds(700,300,120,25);
        rules.setBackground(Color.BLACK);
        rules.setForeground(Color.WHITE);
        rules.addActionListener(this);
        add(rules);
        
        back= new JButton("Back");
        back.setBounds(850,300,120,25);
        back.setBackground(Color.BLACK);
        back.setForeground(Color.WHITE);
        back.addActionListener(this);
        add(back);
        
        
        setSize(1200,600);
        setLocation(200,100);
        
        setVisible(true);
        
        
    }
    public void actionPerformed(ActionEvent ae){
        if(ae.getSource()==rules){
            String name= tfname.getText();
            
            setVisible(false);
            new Rules(name);
            
        }
        else if(ae.getSource()==back){
            setVisible(false);
            
        }
        
    }
    public static void main(String[] args){
        new login();
    }
    
    
    
}
