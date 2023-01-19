/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercemanagementsystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Font;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileWriter;
import java.io.IOException;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;

/**
 *
 * @author ahadu
 */
public class PickProduct implements ActionListener {
    JFrame j1,j2,j3;
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12;
    private Font f;
    public PickProduct(){
        f= new Font("Times New Roman",Font.BOLD,18);
        j1=new JFrame();
        l1= new JLabel();
        l1.setIcon(new ImageIcon("D://Java/pick/img3.png"));
        l1.setBounds(100, 10, 450, 450);
        j1.add(l1);
        l3= new JLabel("Regular Price: 1,60,000");
        l3.setBounds(170, 470, 200, 20);
        l3.setFont(f);
        j1.add(l3);
        l4= new JLabel("Offer Price: 80,000");
        l4.setBounds(170, 490, 200, 20);
        l4.setFont(f);
        l4.setForeground(Color.RED);
        j1.add(l4);
        b1= new JButton("Add to Cart");
        b1.setBounds(650, 100, 150, 30);
        b1.setFont(f);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        j1.add(b1);
        b2= new JButton("Buy Now");
        b2.setBounds(650, 150, 150, 30);
        b2.setFont(f);
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        j1.add(b2);
        b3= new JButton();
        b3.setIcon(new ImageIcon("D://Java/img3.png"));
        b3.setBounds(865, 0, 60, 60);
        b3.setFont(f);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        b3.addActionListener(this);
        j1.add(b3);
        b4= new JButton("Your Cart");
        b4.setBounds(650, 10, 150, 35);
        b4.setFont(f);
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.DARK_GRAY);
        b4.addActionListener(this);
        j1.add(b4);
        
        Container c = j1.getContentPane();
        c.setBackground(Color.WHITE);
        j1.setTitle("Apple Iphone 13 pro");
        j1.setSize(950,600); 
        j1.setLayout(null);
        j1.setLocationRelativeTo(null);
        j1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        j2=new JFrame();
        l2= new JLabel();
        l2.setIcon(new ImageIcon("D://Java/pick/img4.jpg"));
        l2.setBounds(0, 70, 950, 279);
        j2.add(l2);
        l5= new JLabel("Regular Price: 1,21,520");
        l5.setBounds(100, 380, 200, 20);
        l5.setFont(f);
        j2.add(l5);
        l6= new JLabel("Offer Price: 60,000");
        l6.setBounds(100, 400, 200, 20);
        l6.setFont(f);
        l6.setForeground(Color.RED);
        j2.add(l6);
        b5= new JButton("Your Cart");
        b5.setBounds(650, 10, 150, 35);
        b5.setFont(f);
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.DARK_GRAY);
        b5.addActionListener(this);
        j2.add(b5);
        b6= new JButton("Add to Cart");
        b6.setBounds(400, 390, 150, 30);
        b6.setFont(f);
        b6.setBackground(Color.DARK_GRAY);
        b6.setForeground(Color.WHITE);
        b6.addActionListener(this);
        j2.add(b6);
        b7= new JButton("Buy Now");
        b7.setBounds(580, 390, 150, 30);
        b7.setFont(f);
        b7.setBackground(Color.DARK_GRAY);
        b7.setForeground(Color.WHITE);
        b7.addActionListener(this);
        j2.add(b7);
        b8= new JButton();
        b8.setIcon(new ImageIcon("D://Java/img3.png"));
        b8.setBounds(865, 0, 60, 60);
        b8.setFont(f);
        b8.setContentAreaFilled(false);
        b8.setBorderPainted(false);
        b8.addActionListener(this);
        j2.add(b8);
        
        Container c1 = j2.getContentPane();
        c1.setBackground(Color.WHITE);
        j2.setSize(950,600); 
        j2.setLayout(null);
        j2.setLocationRelativeTo(null);
        j2.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        
        j3=new JFrame();
        l7= new JLabel();
        l7.setIcon(new ImageIcon("D://Java/pick/img6.png"));
        l7.setBounds(100, 10, 483, 450);
        j3.add(l7);
        l8= new JLabel("Regular Price: 11,424,000");
        l8.setBounds(170, 470, 200, 20);
        l8.setFont(f);
        j3.add(l8);
        l9= new JLabel("Offer Price: 11,000,000");
        l9.setBounds(170, 495, 200, 20);
        l9.setFont(f);
        l9.setForeground(Color.RED);
        j3.add(l9);
        b9= new JButton("Add to Cart");
        b9.setBounds(650, 100, 150, 30);
        b9.setFont(f);
        b9.setBackground(Color.DARK_GRAY);
        b9.setForeground(Color.WHITE);
        b9.addActionListener(this);
        j3.add(b9);
        b10= new JButton("Buy Now");
        b10.setBounds(650, 150, 150, 30);
        b10.setFont(f);
        b10.setBackground(Color.DARK_GRAY);
        b10.setForeground(Color.WHITE);
        b10.addActionListener(this);
        j3.add(b10);
        b11= new JButton();
        b11.setIcon(new ImageIcon("D://Java/img3.png"));
        b11.setBounds(865, 0, 60, 60);
        b11.setFont(f);
        b11.setContentAreaFilled(false);
        b11.setBorderPainted(false);
        b11.addActionListener(this);
        j3.add(b11);
        b12= new JButton("Your Cart");
        b12.setBounds(650, 10, 150, 35);
        b12.setFont(f);
        b12.setForeground(Color.WHITE);
        b12.setBackground(Color.DARK_GRAY);
        b12.addActionListener(this);
        j3.add(b12);
        
        Container c2 = j3.getContentPane();
        c2.setBackground(Color.WHITE);
        j3.setTitle("2021 Nissan GT-R Sports Car");
        j3.setSize(950,600); 
        j3.setLayout(null);
        j3.setLocationRelativeTo(null);
        j3.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        int i=0;
        if(ae.getSource()==b3){
            new HomePage().setVisible(true);
            j1.setVisible(false);
        }
        else if(ae.getSource()==b1){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    try {
                        File f1= new File("D://java/user/"+cut[0]+"/cart.txt");
                        FileWriter w1 = new FileWriter(f1,true);
                        i++;
                        w1.write("Iphone 13 pro max,80000");
                        w1.write("\n");
                        w1.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(j1,"Successfully Added to Cart!");
                }
                else{
                    JOptionPane.showMessageDialog(j1,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b4){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    new Cart().setVisible(true);
                    j1.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(j1,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b6){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    try {
                        File f1= new File("D://java/user/"+cut[0]+"/cart.txt");
                        FileWriter w1 = new FileWriter(f1,true);
                        i++;
                        w1.write("ASUS TUF A15 FA506IU,60000");
                        w1.write("\n");
                        w1.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(j2,"Successfully Added to Cart!");
                }
                else{
                    JOptionPane.showMessageDialog(j2,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b5){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    new Cart().setVisible(true);
                    j2.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(j2,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b8){
            new HomePage().setVisible(true);
            j2.setVisible(false);
        }
        else if(ae.getSource()==b2){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    try {
                        File f1= new File("D://java/user/"+cut[0]+"/cart.txt");
                        FileWriter w1 = new FileWriter(f1,true);
                        i++;
                        w1.write("Iphone 13 pro max,80000");
                        w1.write("\n");
                        w1.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    new Checkout().setVisible(true);
                    j1.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(j1,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b7){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    try {
                        File f1= new File("D://java/user/"+cut[0]+"/cart.txt");
                        FileWriter w1 = new FileWriter(f1,true);
                        i++;
                        w1.write("ASUS TUF A15 FA506IU,60000");
                        w1.write("\n");
                        w1.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    new Checkout().setVisible(true);
                    j2.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(j2,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b11){
            new HomePage().setVisible(true);
            j3.setVisible(false);
        }
        else if(ae.getSource()==b9){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    try {
                        File f1= new File("D://java/user/"+cut[0]+"/cart.txt");
                        FileWriter w1 = new FileWriter(f1,true);
                        i++;
                        w1.write("2021 Nissan GT-R Sports Car,11000000");
                        w1.write("\n");
                        w1.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    JOptionPane.showMessageDialog(j3,"Successfully Added to Cart!");
                }
                else{
                    JOptionPane.showMessageDialog(j3,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b12){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    new Cart().setVisible(true);
                    j3.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(j3,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b10){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    try {
                        File f1= new File("D://java/user/"+cut[0]+"/cart.txt");
                        FileWriter w1 = new FileWriter(f1,true);
                        i++;
                        w1.write("2021 Nissan GT-R Sports Car,11000000");
                        w1.write("\n");
                        w1.close();
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    } catch (IOException ex) {
                        Logger.getLogger(PickProduct.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    new Checkout().setVisible(true);
                    j3.setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(j3,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
  
    }
    
}
