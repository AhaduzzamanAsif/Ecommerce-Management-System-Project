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
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextField;

/**
 *
 * @author ahadu
 */
public class Admin extends JFrame implements ActionListener {
    private JLabel l1,l2;
    private JTextField t1;
    private JButton b1,b2;
    private Font font1,font2;
    private File f1,f2,f3,f4;
    private JTable jt;
    private JScrollPane sp;
    public Admin() throws FileNotFoundException{
        font1= new Font("Times New Roman",Font.BOLD,32);
        font2= new Font("Times New Roman",Font.BOLD,20);
        l1= new JLabel("Admin Action");
        l1.setBounds(340, 10, 200, 30);
        l1.setForeground(Color.RED);
        l1.setFont(font1);
        add(l1);
        l2= new JLabel("Order ID:");
        l2.setBounds(730, 60, 200, 30);
        l2.setForeground(Color.BLUE);
        l2.setFont(font2);
        add(l2);
        t1= new JTextField();
        t1.setBounds(730, 100, 100, 30);
        add(t1);
        b1= new JButton("Delivered");
        b1.setBounds(730, 150, 120, 30);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFont(font2);
        b1.addActionListener(this);
        add(b1);
        f1= new File("D://Java/OrderHistory.txt");
        Scanner input1= new Scanner(f1);
        int i=0,count=0;
        while(input1.hasNext()){
            input1.nextLine();
            count++;
        }
        String[][] data= new String[count][4];
        Scanner input2= new Scanner(f1);
        while(input2.hasNext()){
            String s1=input2.nextLine();
            String[] parts=s1.split(",");
            for(int j=0;j<4;j++){
                data[i][j]= parts[j];
            }
            i++;
        }
        String column[]={"Order id","User Name","Product Name","Status"};
        jt=new JTable(data,column);      
        jt.setFont(font2);
        jt.setRowHeight(30);
        jt.setBackground(Color.PINK);
        jt.setGridColor(Color.WHITE);
        jt.getTableHeader().setBackground(Color.DARK_GRAY);
        jt.getTableHeader().setFont(font2);
        jt.getTableHeader().setForeground(Color.WHITE);
        sp=new JScrollPane(jt);
        sp.setBounds(10,60,700,400);
        jt.getTableHeader().setPreferredSize(new Dimension(sp.getWidth(),50));
        add(sp);
        b2= new JButton();
        b2.setIcon(new ImageIcon("D://Java/img3.png"));
        b2.setBounds(865, 0, 60, 60);
        b2.setContentAreaFilled(false);
        b2.setBorderPainted(false);
        b2.addActionListener(this);
        add(b2);
        
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);
        setTitle("Admin Panel");
        setSize(950, 600);
        setLayout(null);
        setVisible(true);
        setLocationRelativeTo(null);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if(ae.getSource()==b1){
            try {
                f4= new File("D://Java/OrderHistory1.txt");
                Scanner input= new Scanner(f1);
                FileWriter w3= new FileWriter(f4);
                while(input.hasNext()){
                    String s1= input.nextLine();
                    String[] cut=s1.split(",");
                    if(t1.getText().equals(cut[0])){
                        w3.write(cut[0]+","+cut[1]+","+cut[2]+",Delivered");
                        w3.write("\n");
                        
                        f2= new File("D://java/user/"+cut[1]+"/purchase.txt");
                        f3= new File("D://java/user/"+cut[1]+"/purchase1.txt");
                        Scanner in= new Scanner(f2);
                        FileWriter w1= new FileWriter(f3);
                            
                            while(in.hasNext()){
                                String s= in.nextLine();
                                String[] cut1=s.split(",");
                                if(t1.getText().equals(cut1[0])){
                                    w1.write(cut1[0]+","+cut1[1]+","+cut1[2]+",Delivered");
                                    w1.write("\n");
                                }
                                else{
                                    w1.write(s);
                                    w1.write("\n");
                                }
                            }
                        
                        w1.close();
                    }
                    else{
                        w3.write(s1);
                        w3.write("\n");
                    }
                }
                w3.close();
                Scanner in1= new Scanner(f3);
                FileWriter w2= new FileWriter(f2);
                while(in1.hasNext()){
                    w2.write(in1.nextLine());
                    w2.write("\n");
                }
                w2.close();
                Scanner in2= new Scanner(f4);
                FileWriter w4= new FileWriter(f1);
                while(in2.hasNext()){
                    w4.write(in2.nextLine());
                    w4.write("\n");
                }
                w4.close();
                
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            } catch (IOException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
            try {
                new Admin().setVisible(true);
            } catch (FileNotFoundException ex) {
                Logger.getLogger(Admin.class.getName()).log(Level.SEVERE, null, ex);
            }
        }
        else if(ae.getSource()==b2){
            new HomePage().setVisible(true);
            setVisible(false);
        }
    }
    
}
