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

/**
 *
 * @author ahadu
 */
public class Profile extends JFrame implements ActionListener {
    private JLabel l1,l2,l3,l4;
    private File f1,f2;
    private JButton b1,b2,b3;
    private Font f;
    public Profile() throws FileNotFoundException{
        f= new Font("Times New Roman",Font.BOLD,22);
        l1= new JLabel();
        l1.setIcon(new ImageIcon("D://Java/profile.png"));
        l1.setBounds(370, 50, 180, 152);
        add(l1);
        f1= new File("D://Java/UserLogin.txt");
        Scanner input= new Scanner(f1);
        String[] cut= input.nextLine().split(",");
        f2= new File("D://java/user/"+cut[0]+"/"+cut[0]+".txt");
        Scanner input1= new Scanner(f2);
        int i=0;
        while(input1.hasNext()){
            input1.nextLine();
            i++;
        }
        Scanner input2= new Scanner(f2);
        if(i==1){
            String[] cut1= input2.nextLine().split("-");
            l3= new JLabel("Phone Number: "+cut1[1]);
            l3.setBounds(340, 310, 400, 30);
            l3.setFont(f);
            add(l3);
            l4= new JLabel("Address: "+cut1[2]);
            l4.setBounds(340, 340, 400, 30);
            l4.setFont(f);
            add(l4);
        }
        l2= new JLabel("Name: "+cut[0]);
        l2.setBounds(340, 280, 300, 30);
        l2.setFont(f);
        add(l2);
        b1= new JButton();
        b1.setIcon(new ImageIcon("D://Java/img3.png"));
        b1.setBounds(865, 0, 60, 60);
        b1.setContentAreaFilled(false);
        b1.setBorderPainted(false);
        b1.addActionListener(this);
        add(b1);
        b2= new JButton("Purchase History");
        b2.setBounds(340, 390, 200, 40);
        b2.setBackground(Color.black);
        b2.setForeground(Color.WHITE);
        b2.setFont(f);
        b2.addActionListener(this);
        add(b2);
        b3= new JButton("Logout");
        b3.setBounds(340, 440, 200, 40);
        b3.setBackground(Color.RED);
        b3.setForeground(Color.WHITE);
        b3.setFont(f);
        b3.addActionListener(this);
        add(b3);
        
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);
        setTitle("Profile");
        setSize(950,600); 
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            new HomePage().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource()==b3){
            try {
                FileWriter write= new FileWriter(f1);
                write.write("Offline,Offline");
                write.close();
            } catch (IOException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
            new HomePage().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource()==b2){
            try {
                new PurchaseHistory().setVisible(true);
                setVisible(false);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Profile.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
    
}
