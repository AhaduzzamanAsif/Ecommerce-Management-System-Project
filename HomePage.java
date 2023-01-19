/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercemanagementsystem;

import java.awt.*;
import java.awt.event.*;
import java.io.*;
import java.util.Scanner;
import java.util.logging.*;
import javax.swing.*;

/**
 *
 * @author ahadu
 */
public class HomePage extends JFrame implements Runnable, ActionListener {
    private JLabel l1,l2,l3,l4,l5,l6,l7,l8,l9,l10,l11;
    private JRadioButton r1,r2,r3;
    private Thread th;
    private JButton b1,b2,b3,b4,b5,b6,b7,b8,b9,b10,b11,b12,b13,b14;
    private Font f,f1,f2;

    public HomePage(){
        setTitle("Window Shopping- fast and accurate");
        f= new Font("Times New Roman",Font.BOLD,18);
        f1= new Font("Times New Roman",Font.BOLD,20);
        f2= new Font("Times New Roman",Font.BOLD,30);
        b1= new JButton();
        b1.setIcon(new ImageIcon("D://Java/img8.jpg"));
        b1.setBounds(790, 1, 84, 48);
        b1.addActionListener(this);
        add(b1);
        b2= new JButton();
        b2.setIcon(new ImageIcon("D://Java/img9.jpg"));
        b2.setBounds(880, 1, 48, 48);
        b2.addActionListener(this);
        add(b2);
        b3= new JButton("Category");
        b3.setBounds(0, 0, 153, 45);
        b3.setFont(f1);
        b3.setForeground(Color.BLACK);
        b3.setBackground(Color.WHITE);
        add(b3);
        b3= new JButton("<html>Electronic<br>Device</html>");
        b3.setBounds(0, 50, 150, 60);
        b3.setFont(f1);
        b3.setForeground(Color.WHITE);
        b3.setBackground(Color.BLACK);
        b3.addActionListener(this);
        add(b3);
        b4= new JButton("<html>Electronic<br>Accessories</html>");
        b4.setBounds(0, 115, 150, 60);
        b4.setFont(f1);
        b4.setForeground(Color.WHITE);
        b4.setBackground(Color.BLACK);
        b4.addActionListener(this);
        add(b4);
        b5= new JButton("<html>Tv & Home<br>Appliance</html>");
        b5.setBounds(0, 180, 150, 60);
        b5.setFont(f1);
        b5.setForeground(Color.WHITE);
        b5.setBackground(Color.BLACK);
        b5.addActionListener(this);
        add(b5);
        b6= new JButton("Groceries");
        b6.setBounds(0, 245, 150, 60);
        b6.setFont(f1);
        b6.setForeground(Color.WHITE);
        b6.setBackground(Color.BLACK);
        b6.addActionListener(this);
        add(b6);
        b7= new JButton("Baby & Toys");
        b7.setBounds(0, 310, 150, 60);
        b7.setFont(f1);
        b7.setForeground(Color.WHITE);
        b7.setBackground(Color.BLACK);
        b7.addActionListener(this);
        add(b7);
        b8= new JButton("Boys Fashion");
        b8.setBounds(0, 375, 150, 60);
        b8.setFont(f1);
        b8.setForeground(Color.WHITE);
        b8.setBackground(Color.BLACK);
        b8.addActionListener(this);
        add(b8);
        b9= new JButton("Girls Fashion");
        b9.setBounds(0, 440, 150, 60);
        b9.setFont(f1);
        b9.setForeground(Color.WHITE);
        b9.setBackground(Color.BLACK);
        b9.addActionListener(this);
        add(b9);
        b10= new JButton("Sports");
        b10.setBounds(0, 505, 150, 60);
        b10.setFont(f1);
        b10.setForeground(Color.WHITE);
        b10.setBackground(Color.BLACK);
        b10.addActionListener(this);
        add(b10);
        b11= new JButton();
        b11.setIcon(new ImageIcon("D://Java/img7.png"));
        b11.setBounds(715, 1, 70, 48);
        b11.setBackground(Color.WHITE);
        b11.addActionListener(this);
        add(b11);
        
        l1=new JLabel();
        l1.setIcon(new ImageIcon("D://Java/slide/img1.jpg"));
        l1.setBounds(300,60,500,200);
        l1.setVisible(true);
        add(l1);
        l2=new JLabel();
        l2.setIcon(new ImageIcon("D://Java/slide/img2.jpg"));
        l2.setBounds(300,60,500,200);
        l2.setVisible(false);
        add(l2);
        l3=new JLabel();
        l3.setIcon(new ImageIcon("D://Java/slide/img3.png"));
        l3.setBounds(300,60,500,200);
        l3.setVisible(false);
        add(l3);
        r1= new JRadioButton();
        r1.setBounds(530, 260, 20, 20);
        r1.setSelected(true);
        add(r1);
        r2= new JRadioButton();
        r2.setBounds(550, 260, 20, 20);
        add(r2);
        r3= new JRadioButton();
        r3.setBounds(570, 260, 20, 20);
        add(r3);
        l4= new JLabel("Todays pick");
        l4.setBounds(200, 290, 200, 30);
        l4.setFont(f2);
        add(l4);
        b12= new JButton();
        b12.setIcon(new ImageIcon("D://Java/pick/img1.jpg"));
        b12.setBounds(200, 340, 120, 156);
        b12.addActionListener(this);
        add(b12);
        l6= new JLabel("<html>Iphone 13 max pro<br>Offer Price: 80,000</html>");
        l6.setBounds(180, 520, 200, 60);
        l6.setFont(f);
        add(l6);
        b13= new JButton();
        b13.setIcon(new ImageIcon("D://Java/pick/img2.jpg"));
        b13.setBounds(410, 340, 120, 156);
        b13.addActionListener(this);
        add(b13);
        l8= new JLabel("<html>ASUS TUF A15 FA506IU<br>Offer Price: 60,000</html>");
        l8.setBounds(390, 520, 200, 60);
        l8.setFont(f);
        add(l8);
        b14= new JButton();
        b14.setIcon(new ImageIcon("D://Java/pick/img5.jpg"));
        b14.setBounds(620, 340, 243, 156);
        b14.addActionListener(this);
        add(b14);
        l11= new JLabel("<html>2021 Nissan GT-R Sports Car<br>Offer Price: 11,000,000</html>");
        l11.setBounds(620, 520, 250, 60);
        l11.setFont(f);
        add(l11);
        l7= new JLabel();
        l7.setIcon(new ImageIcon("D://Java/img4.png"));
        l7.setBounds(0, 0, 153, 700);
        add(l7);
        l9= new JLabel();
        l9.setIcon(new ImageIcon("D://Java/img10.png"));
        l9.setBounds(200, 0, 495, 49);
        add(l9);
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);
        
        
        setSize(950,700); 
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        th= new Thread(this);
        th.start();
   }

    @Override
    public void run() {
        while(true){
            try {
                th.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            l1.setVisible(false);
            l2.setVisible(true);
            l3.setVisible(false);
            r1.setSelected(false);
            r2.setSelected(true);
            r3.setSelected(false);
            try {
                th.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            l1.setVisible(false);
            l2.setVisible(false);
            l3.setVisible(true);
            r1.setSelected(false);
            r2.setSelected(false);
            r3.setSelected(true);
            try {
                th.sleep(3000);
            } catch (InterruptedException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
            l1.setVisible(true);
            l2.setVisible(false);
            l3.setVisible(false);
            r1.setSelected(true);
            r2.setSelected(false);
            r3.setSelected(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            new Login().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource()==b2){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    new Profile().setVisible(true);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b12){
            new PickProduct().j1.setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource()==b13){
            new PickProduct().j2.setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource()==b11){
            try {
                File f=new File("D://java/UserLogin.txt");
                Scanner input= new Scanner(f);
                String s=input.nextLine();
                String[] cut=s.split(",");
                if(cut[1].equals("Active")){
                    new Cart().setVisible(true);
                    setVisible(false);
                }
                else{
                    JOptionPane.showMessageDialog(this,"Login first!");
                }
            } catch (FileNotFoundException ex) {
                Logger.getLogger(HomePage.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b3||ae.getSource()==b4||ae.getSource()==b5||ae.getSource()==b6||ae.getSource()==b7||ae.getSource()==b8||ae.getSource()==b9||ae.getSource()==b10){
            JOptionPane.showMessageDialog(this,"Product will availabele soon...");
        }
        else if(ae.getSource()==b14){
            new PickProduct().j3.setVisible(true);
            setVisible(false);
        }
        
    }
    
}
