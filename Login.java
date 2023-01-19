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
import static java.lang.String.valueOf;
import java.util.Scanner;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.*;

public class Login extends JFrame implements ActionListener{
    private JLabel l1,l2,l3,l4,l5,l6;
    private JTextField t1;
    private JPasswordField p;
    private JButton b1,b2,b3;
    private Font f,f1;

    public Login(){
        setTitle("Login page");
        f= new Font("Times New Roman",Font.BOLD,18);
        f1= new Font("Times New Roman",Font.BOLD,22);
        b3= new JButton();
        b3.setIcon(new ImageIcon("D://Java/img3.png"));
        b3.setBounds(0, 0, 60, 60);
        b3.setFont(f);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        b3.addActionListener(this);
        add(b3);
        ImageIcon img= new ImageIcon("D://Java/img.jpg");
        l1=new JLabel();
        l1.setIcon(img);
        l1.setBounds(0, 0, 600, 600);
        add(l1);
        l2= new JLabel("Wellcome to Window Shopping");
        l2.setBounds(620, 10, 350, 30);
        l2.setFont(f1);
        l2.setForeground(Color.RED);
        add(l2);
        l3= new JLabel("ID:");
        l3.setBounds(650, 70, 100, 20);
        l3.setFont(f);
        add(l3);
        l4= new JLabel("Password:");
        l4.setBounds(650, 110, 100, 20);
        l4.setFont(f);
        add(l4);
        t1= new JTextField();
        t1.setBounds(750, 70, 100, 30);
        t1.setToolTipText("Enter Your ID");
        add(t1);
        p= new JPasswordField();
        p.setBounds(750, 110, 100, 30);
        p.setToolTipText("Enter Valid Password");
        add(p);
        b1= new JButton("Login");
        b1.setBounds(750, 150, 80, 35);
        b1.setFont(f);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.WHITE);
        b1.addActionListener(this);
        add(b1);
        b2= new JButton("Sign up");
        b2.setBounds(630, 320, 100, 30);
        b2.setFont(f);
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.WHITE);
        b2.addActionListener(this);
        add(b2);
        
        
        l5= new JLabel("for a new account");
        l5.setBounds(740, 320, 150, 20);
        l5.setFont(f);
        add(l5);
        
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);
        setSize(950,600); 
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }
    
    @Override
    public void actionPerformed(ActionEvent ae) {
        try {
            File f= new File("D://Java/data.txt");
            File f1=new File("D://java/UserLogin.txt");
            Scanner in= new Scanner(f1);
            String[] cut=in.nextLine().split(",");
            if(ae.getSource()==b1){
                if("admin".equals(t1.getText())&&"admin".equals(valueOf(p.getPassword()))){
                    try {
                        new Admin().setVisible(true);
                        setVisible(false);
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                }
                else if(cut[1].equals("Active")){
                    JOptionPane.showMessageDialog(this,"Logout First!");
                }
                else{
                    int i=0;
                    try {
                        Scanner input= new Scanner(f);
                        
                        while(input.hasNext()){
                            String s=input.nextLine();
                            String[] parts=s.split(",");
                            if(parts[0].equals(t1.getText())&&parts[2].equals(valueOf(p.getPassword()))){
                                JOptionPane.showMessageDialog(new Login(),"Succcessfully Login");
                                FileWriter write;
                                try {
                                    write = new FileWriter(f1);
                                    write.write(parts[0]+",Active");
                                    write.close();
                                } catch (IOException ex) {
                                    Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                                }
                                
                                i++;
                                break;
                            }
                        }
                    } catch (FileNotFoundException ex) {
                        Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
                    }
                    if(i==0){
                        JOptionPane.showMessageDialog(this,"Wrong Password. Try again!!");
                    }
                }
            }
            if(ae.getSource()==b2){
                new SignUp().setVisible(true);
                setVisible(false);
            }
            else if(ae.getSource()==b3){
                new HomePage().setVisible(true);
                setVisible(false);
            }
            //JOptionPane.showMessageDialog(new SignUp(),"Provide required information to create a new account");
        } catch (FileNotFoundException ex) {
            Logger.getLogger(Login.class.getName()).log(Level.SEVERE, null, ex);
        }
    }
    
}



