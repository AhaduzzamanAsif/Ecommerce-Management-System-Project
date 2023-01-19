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
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JRadioButton;
import javax.swing.JTextField;

/**
 *
 * @author ahadu
 */
public class Checkout extends JFrame implements ActionListener {
    private File f1,f2,f3,f4,f5;
    private JLabel l1,l2,l3,l4;
    private JTextField t1,t2;
    private JRadioButton r1;
    private JButton b1,b2;
    private Font f;
    String[] cut;
    public Checkout() throws FileNotFoundException{
        f= new Font("Times New Roman",Font.BOLD,18);
        f1= new File("D://Java/UserLogin.txt");
        Scanner input=new Scanner(f1);
        cut= input.nextLine().split(",");
        l1= new JLabel("Hi........ "+cut[0]);
        l1.setBounds(100, 100, 200, 30);
        l1.setFont(f);
        add(l1);
        l2= new JLabel("Please Provide the following information to complete your order:");
        l2.setBounds(100, 130, 800, 30);
        l2.setFont(f);
        l2.setForeground(Color.RED);
        add(l2);
        l3= new JLabel("Phone Number:");
        l3.setBounds(100, 180, 150, 30);
        l3.setFont(f);
        add(l3);
        l4= new JLabel("Delivery Adress:");
        l4.setBounds(100, 220, 150, 30);
        l4.setFont(f);
        add(l4);
        l4= new JLabel("Payment Method");
        l4.setBounds(100, 270, 150, 30);
        l4.setFont(f);
        add(l4);
        t1= new JTextField();
        t1.setBounds(250, 180, 150, 30);
        add(t1);
        t2= new JTextField();
        t2.setBounds(250, 220, 150, 30);
        add(t2);
        r1= new JRadioButton("Cash on Delivery");
        r1.setSelected(true);
        r1.setBounds(100, 310, 180, 20);
        r1.setFont(f);
        add(r1);
        b1=new JButton("Order Now");
        b1.setBounds(100, 400, 130, 30);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFont(f);
        b1.addActionListener(this);
        add(b1);
        b2=new JButton("Continue Shopping");
        b2.setBounds(260, 400, 200, 30);
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setFont(f);
        b2.addActionListener(this);
        add(b2);
        
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);
        setSize(950,700); 
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b2){
            new HomePage().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource()==b1){
            try {
                f2= new File("D://java/user/"+cut[0]+"/"+cut[0]+".txt");
                FileWriter w1 = new FileWriter(f2);
                w1.write(cut[0]+"-"+t1.getText()+"-"+t2.getText());
                w1.close();
                f5= new File("D://Java/OrderHistory.txt");
                Scanner input= new Scanner(f5);
                int i=0;
                while(input.hasNext()){
                    input.nextLine();
                    i++;
                }
                int c=i+1;
                f3= new File("D://java/user/"+cut[0]+"/cart.txt");
                Scanner in= new Scanner(f3);
                f4= new File("D://java/user/"+cut[0]+"/purchase.txt");
                FileWriter w2= new FileWriter(f4,true);
                FileWriter w3= new FileWriter(f5,true);
                while(in.hasNext()){
                    String s=in.nextLine();
                    String[] cut1= s.split(",");
                    w2.write(c+","+s);
                    w2.write(",pending");
                    w2.write("\n");
                    w3.write(c+","+cut[0]+","+cut1[0]+",pending");
                    w3.write("\n");
                    c++;
                }
                w2.close();
                w3.close();
                
            } catch (IOException ex) {
                Logger.getLogger(Checkout.class.getName()).log(Level.SEVERE, null, ex);
            }
            JOptionPane.showMessageDialog(this, "Order Confirmed!! Our Customer manager will contact with you soon.");
                try {
                    FileWriter write= new FileWriter(f3);
                    write.write("");
                    write.close();
                } catch (IOException ex) {
                    Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
                }
            
        }
    }
    
}
