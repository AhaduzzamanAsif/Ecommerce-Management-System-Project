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
import java.util.Scanner;
import javax.swing.ImageIcon;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JScrollPane;
import javax.swing.JTable;

/**
 *
 * @author ahadu
 */
public class PurchaseHistory extends JFrame implements ActionListener {
    private File f,f1;
    private JTable jt;
    private Font font;
    private JScrollPane sp;
    private JButton b1;
    private JLabel l1;
    public PurchaseHistory() throws FileNotFoundException{
        font= new Font("Times New Roman",Font.BOLD,18);
        f=new File("D://Java/UserLogin.txt");
        Scanner input= new Scanner(f);
        String s=input.nextLine();
        String cut[]=s.split(",");
        f1= new File("D://Java/user/"+cut[0]+"/purchase.txt");
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
        String column[]={"Order id","Product Name","Price","Status"};
        jt=new JTable(data,column);      
        jt.setFont(font);
        jt.setRowHeight(30);
        jt.setBackground(Color.PINK);
        jt.setGridColor(Color.WHITE);
        jt.getTableHeader().setBackground(Color.DARK_GRAY);
        jt.getTableHeader().setFont(font);
        jt.getTableHeader().setForeground(Color.WHITE);
        sp=new JScrollPane(jt);
        sp.setBounds(75,10,790,200);
        jt.getTableHeader().setPreferredSize(new Dimension(sp.getWidth(),50));
        add(sp);
        b1= new JButton("Back to Home");
        b1.setBounds(100, 220, 200, 30);
        b1.setBackground(Color.DARK_GRAY);
        b1.setForeground(Color.WHITE);
        b1.setFont(font);
        b1.addActionListener(this);
        add(b1);
        l1= new JLabel();
        l1.setIcon(new ImageIcon("D://Java/delivery.png"));
        l1.setBounds(250, 260, 512, 282);
        add(l1);
        
        Container c = this.getContentPane();
        c.setBackground(Color.WHITE);
        setTitle("Purchase History");
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
    }
    
}
