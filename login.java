package logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

 public class login{
    private JTextField textField1;
    private JPasswordField passwordField1;
    private JButton loginButton;
     private JPanel mp;
     private JButton createAccountButton;
    public static String i,p;

   public login() {


       loginButton.addActionListener(new ActionListener() {
           @Override
           public void actionPerformed(ActionEvent e) {
               i=textField1.getText();
               p=passwordField1.getText();
               if (i.equals("gkcodes")&& p.equals("123789")){

                   ff f=new ff();
                   f.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
                   f.pack();
                   f.setVisible(true);
                   System.exit(0);
               }
               else {
                   JOptionPane.showMessageDialog(null,"you gave incorrect ID or Password ");
               }
           }
       });
   }

     public static void main(String[] args) {
       JFrame dialog =new JFrame();

         dialog.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
         dialog.pack();
         dialog.setContentPane(new login().mp);
         dialog.setVisible(true);
         dialog.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

     }




}
