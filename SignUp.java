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
import java.io.PrintWriter;
import static java.lang.String.valueOf;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

/**
 *
 * @author ahadu
 */
public class SignUp extends JFrame implements ActionListener{
    private JLabel l1,l2,l3,l4,l5,l6,icon;
    private JTextField t1,t2;
    private JPasswordField p1,p2;
    private JButton b1,b2;
    private Font f,f1;

    public SignUp(){
        setTitle("Sign Up page");
        f= new Font("Times New Roman",Font.BOLD,18);
        f1= new Font("Times New Roman",Font.BOLD,20);
        ImageIcon img= new ImageIcon("D://Java/img1.png");
        icon=new JLabel();
        icon.setIcon(img);
        icon.setBounds(0, 0, 600, 600);
        add(icon);
        l5= new JLabel("Sign Up");
        l5.setBounds(650, 120, 80, 25);
        l5.setFont(f1);
        l5.setForeground(Color.BLUE);
        add(l5);
        l6= new JLabel("It's free and easy");
        l6.setBounds(650, 150, 160, 25);
        l6.setFont(f);
        add(l6);
        l1= new JLabel("Name:");
        l1.setBounds(650, 220, 80, 25);
        l1.setFont(f);
        add(l1);
        t1= new JTextField();
        t1.setBounds(800, 220, 100, 25);
        add(t1);
        l2= new JLabel("Email:");
        l2.setBounds(650, 250, 100, 25);
        l2.setFont(f);
        add(l2);
        t2= new JTextField();
        t2.setBounds(800, 250, 100, 25);
        add(t2);
        l3= new JLabel("Password:");
        l3.setBounds(650,280,150,25);
        l3.setFont(f);
        add(l3);
        p1= new JPasswordField();
        p1.setBounds(800,280,100,25);
        add(p1);
        l4= new JLabel("Confirm Password:");
        l4.setBounds(650,310,220,25);
        l4.setFont(f);
        add(l4);
        p2= new JPasswordField();
        p2.setBounds(800,310,100,25);
        add(p2);
        b1= new JButton("Sign up");
        b1.setBounds(720, 380, 100, 25);
        b1.setFont(f);
        b1.setForeground(Color.BLUE);
        b1.addActionListener(this);
        add(b1);
        b2= new JButton();
        b2.setIcon(new ImageIcon("D://Java/img3.png"));
        b2.setBounds(865, 0, 60, 60);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        b2.addActionListener(this);
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);
        add(b2);
        setSize(950,600); 
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            File f= new File("D://Java/data.txt");
            String s=valueOf(p1.getPassword());
            String s1=valueOf(p2.getPassword());
            
            if(s1.equals(s)){
                try {
                FileWriter write= new FileWriter(f,true);
                write.write(t1.getText()+","+t2.getText()+","+s);
                write.write("\n");
            
                write.close();
                File dir= new File("D://Java/user/"+t1.getText());
                dir.mkdir();
                File f1=new File(dir.getAbsolutePath()+"/"+t1.getText()+".txt");
                File f2=new File(dir.getAbsolutePath()+"/cart.txt");
                File f3=new File(dir.getAbsolutePath()+"/purchase.txt");
                f1.createNewFile();
                f2.createNewFile();
                f3.createNewFile();
                } catch (FileNotFoundException ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(SignUp.class.getName()).log(Level.SEVERE, null, ex);
                }
                JOptionPane.showMessageDialog(this,"Sign up successfull!");
            }
            else{
                JOptionPane.showMessageDialog(this,"Password not matched. try again.");
            }
            }
            else if(ae.getSource()==b2){
                new HomePage().setVisible(true);
                setVisible(false);
            }
        
        
    }
    
    
}
