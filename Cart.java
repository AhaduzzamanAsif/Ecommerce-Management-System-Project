/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ecommercemanagementsystem;

import java.awt.Color;
import java.awt.Container;
import java.awt.Dimension;
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
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author ahadu
 */
public class Cart extends JFrame implements ActionListener {
    private JButton b1,b2,b3,b4;
    private JLabel l1;
    private Font font;
    private JTable jt;
    private JScrollPane sp;
    private File f,f1;
    public Cart() throws FileNotFoundException{
        font= new Font("Times New Roman",Font.BOLD,18);
        f=new File("D://Java/UserLogin.txt");
        Scanner input= new Scanner(f);
        String s=input.nextLine();
        String cut[]=s.split(",");
        f1= new File("D://Java/user/"+cut[0]+"/cart.txt");
        Scanner input1= new Scanner(f1);
        int i=0,count=0,sum=0;
        while(input1.hasNext()){
            input1.nextLine();
            count++;
        }
        String[][] data= new String[count][2];
        Scanner input2= new Scanner(f1);
        while(input2.hasNext()){
            String s1=input2.nextLine();
            String[] parts=s1.split(",");
            sum+=Integer.parseInt(parts[1]);
            for(int j=0;j<2;j++){
                data[i][j]= parts[j];
            }
            i++;
        }   
        
        String column[]={"Product Name","Price"};
        jt=new JTable(data,column);      
        jt.setFont(font);
        jt.setRowHeight(30);
        jt.setBackground(Color.PINK);
        jt.setGridColor(Color.WHITE);
        jt.getTableHeader().setBackground(Color.DARK_GRAY);
        jt.getTableHeader().setFont(font);
        jt.getTableHeader().setForeground(Color.WHITE);
        sp=new JScrollPane(jt);
        sp.setBounds(80,10,600,250);
        jt.getTableHeader().setPreferredSize(new Dimension(sp.getWidth(),50));
        add(sp);
        
        b1= new JButton("Check Out");
        b1.setBounds(80, 325, 120, 30);
        b1.setBackground(Color.RED);
        b1.setForeground(Color.WHITE);
        b1.setFont(font);
        b1.addActionListener(this);
        add(b1);
        b2= new JButton("Clear");
        b2.setBounds(280, 325, 120, 30);
        b2.setBackground(Color.DARK_GRAY);
        b2.setForeground(Color.WHITE);
        b2.setFont(font);
        b2.addActionListener(this);
        add(b2);
        b3= new JButton();
        b3.setIcon(new ImageIcon("D://Java/img3.png"));
        b3.setBounds(865, 0, 60, 60);
        b3.setFont(font);
        b3.setContentAreaFilled(false);
        b3.setBorderPainted(false);
        b3.addActionListener(this);
        add(b3);
        b4= new JButton("    Total: "+sum);
        b4.setBounds(79, 255, 601, 35);
        b4.setBackground(Color.DARK_GRAY);
        b4.setForeground(Color.WHITE);
        b4.setFont(font);
        add(b4);
        l1= new JLabel();
        l1.setIcon(new ImageIcon("D://Java/img5.png"));
        l1.setBounds(680, 50, 250, 317);
        add(l1);
        
       // System.out.println(jt.getModel().getValueAt(1, 1));
       // System.out.println(jt.getModel().getValueAt(1, 0));
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);
        c.setLayout(null);
        setSize(950, 600);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b2){
            int n=JOptionPane.showConfirmDialog(this,"Are you want to clear the cart??");
            if(n==0){
                try {
                    FileWriter write= new FileWriter(f1);
                    write.write("");
                    write.close();
                    new Cart();
                } catch (IOException ex) {
                    Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
        else if(ae.getSource()==b3){
            new HomePage().setVisible(true);
            setVisible(false);
        }
        else if(ae.getSource()==b1){
            try {
                new Checkout().setVisible(true);
                setVisible(false);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Cart.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
    }
}
