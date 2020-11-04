package logic;

import javax.swing.*;
import javax.swing.event.CaretListener;
import java.awt.*;
import java.awt.event.*;

public class tmg extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel a;
    private JPanel b;
    private JTextField textField1;
    private JLabel[] jl=new JLabel[24];
    private JTextField[] jt=new JTextField[24];
    private JLabel[] jl1=new JLabel[24];
    private JTextField[] jt1=new JTextField[24];
    private int j;
    private int[] l1=new int[24];
    private int[] l2=new int[24];
    public tmg() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        a.setLayout(new GridLayout(0,1));
        b.setLayout(new GridLayout(0,1));


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
                j=Integer.parseInt(textField1.getText());
                a.removeAll();
                b.removeAll();

                for(int i=0;i<j;i++){
                    if(i==0){
                    jl[i]=new JLabel("Break : "+(i+1)+" After How many letcher ");
                    jt[i]=new JTextField(20);
                    jl1[i]=new JLabel("Enter time duration in minute");
                    jt1[i]=new JTextField(20);
                    a.add(jl[i]);
                    a.add(jl1[i]);
                    b.add(jt[i]);
                    b.add(jt1[i]);}
                    else{
                        jl[i]=new JLabel("Break : "+(i+1)+" After How many letcher of Break "+i);
                        jt[i]=new JTextField(20);
                        jl1[i]=new JLabel("Enter time duration in minute");
                        jt1[i]=new JTextField(20);
                        a.add(jl[i]);
                        a.add(jl1[i]);
                        b.add(jt[i]);
                        b.add(jt1[i]);
                    }
                }
                a.validate();
                a.repaint();
                b.validate();
                b.repaint();
            }
        });

    }

    private void onOK() {
        l1[0]=Integer.parseInt(jt[0].getText())-1;
        l2[0]=Integer.parseInt(jt1[0].getText());
        for(int i1=1;i1<j;i1++){
            l1[i1]=Integer.parseInt(jt[i1].getText())+l1[i1-1];
            l2[i1]=Integer.parseInt(jt1[i1].getText());

        }
int j=0;
            for (int i=0;i<ff.y;i++){

                if (ff.bb==1 || ff.bb<12)
                    ff.a5[i]=ff.bb+":"+ff.mm+"to"+(ff.bb+1)+":"+ff.mm;
                else  if (ff.bb==12){
                    ff.a5[i]=ff.bb+":"+ff.mm +"to"+ "0:"+ff.mm;}
                else {
                    ff.bb=1;
                    ff.a5[i]=ff.bb+":"+ff.mm+"to"+(ff.bb+1)+":"+ff.mm;}
                if (i==l1[j]) {

                    ff.mm+=l2[j];
                    while (ff.mm>=60){
                        ff.mm=ff.mm-60;
                        ff.bb=ff.bb+1;
                    }
                    ff.bb++;
                    j++;
                }
                else {

                    ff.bb++;
                }

            }

        sss f=new sss();
        f.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.pack();
        f.setVisible(true);
        // add your code here
        dispose();
    }

    private void onCancel() {
        ff f=new ff();
        f.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.pack();
        f.setVisible(true);
        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        tmg dialog = new tmg();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
