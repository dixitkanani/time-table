package logic;

import javax.swing.*;
import javax.swing.event.CaretEvent;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.*;

public class sss extends JDialog {
     JTextField nm[]=new JTextField[36];
     JTextField nmm[]=new JTextField[36];
     private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel nope;
    private JPanel yep;
    private JPanel b;
    private JPanel a;
    private JLabel tfl;
    private JTextField textField1;
    public static int z1;
    public static int[] z =new int[36];
    public static String[] a2=new String[36];
    public static String[] z0=new String[36];
    public sss() {
//        getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());

        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);


        nope.setLayout(new GridLayout(0,1));
        yep.setLayout(new GridLayout(0,1));

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();


            }
        });

        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {

                onCancel();
            }
        });



        textField1.addActionListener(new ActionListener() {
            @Override
            public void actionPerformed(ActionEvent e) {
                           z1= Integer.valueOf(textField1.getText());
//                System.out.println(z1);
                nope.removeAll();
                yep.removeAll();

                for (int i=0;i<z1;i++){
                    JLabel mn=new JLabel("Enter subject"+(i+1)+" name");


                    JLabel mnn=new JLabel("Enter  subject "+(i+1)+"'s number of feculty");
                     nm[i]=new JTextField(20) ;
                      nmm[i]=new JTextField(20) ;
                    nope.add(mn);
                    yep. add(nm[i]);
                    nope.add(mnn);
                    yep. add(nmm[i]);

                }



                nope.validate();
                nope.repaint();
                yep.validate();
                yep.repaint();
            }
        });
    }

    private void onOK() {
        for (int i=0;i<z1;i++){
           a2[i]=nm[i].getText();
           z[i]= Integer.parseInt(nmm[i].getText());}
//                                                       for (int i1=0;i1<z1;i1++){
//
//                                                                                     System.out.println(a2[i1]+" hgf "+z0[i1]);}

        ts t= new ts();
        t.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        t.pack();
        t.setVisible(true);
        // add your code here
        dispose();
    }

    private void onCancel() {

        tmg f=new tmg();
        f.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.pack();
        f.setVisible(true);
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {

        sss dialog = new sss();

        dialog.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        dialog.pack();
        dialog.setResizable(false);
        dialog.setVisible(true);
        System.exit(0);
    }
}
