package logic;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

public class ff extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JTextField e0;
    private JTextField e1;
    private JTextField e2;
    private JTextField e3;
    private JTextField e4;
    private JLabel wl;
    private JLabel wl1;
    private JLabel wl3;
    private JLabel w0;
    private JLabel wl2;
    public static int x;
    public static int y;

    public static int p;
    public static int xx=0;
    public static int xy=0;
    public static int bb;
    public static int mm;
    public static int[] p0=new int[36];
    public static String[] p2=new String[36];
    public static String[] a5=new String[24];

    public ff() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);

        buttonOK.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onOK();
            }
        });




    }

    private void onOK() {
        x=Integer.parseInt(e0.getText());
        y=Integer.parseInt(e1.getText());
        bb=Integer.parseInt(e2.getText());
        mm=Integer.parseInt(e3.getText());
        p=Integer.parseInt(e4.getText());

        for (int i = 0; i < p; i++) {
            p0[i] = i;
            p2[i] = "BATCH" + Integer.toString(p0[i]+1);
        }
        while (mm>=60){
            mm=mm-60;
            bb=bb+1;
        }




        tmg f=new tmg();
        f.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.pack();
        f.setVisible(true);
        // add your code here
        dispose();
    }

    private void onCancel() {
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        ff dialog = new ff();
        dialog.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
//        dialog.setMaximumSize();
        dialog.pack();
        dialog.setResizable(false);
        dialog.setVisible(true);
        System.exit(0);
    }
}
