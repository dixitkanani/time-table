package logic;

import javax.swing.*;
import javax.swing.table.DefaultTableModel;
import java.awt.*;
import java.awt.event.*;

public class tt extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel abt;
    private JTable table =new JTable();
    private JTable[] t=new JTable[36];
    private JTable[] tt=new JTable[36];
    JLabel l[]=new JLabel[36];
    JLabel l1[]=new JLabel[36];
    private String[] columns=new String[88];
    private String[][] data=new String[88][88];

    public tt() {

        setModal(true);
        setContentPane(contentPane);
        getRootPane().setDefaultButton(buttonOK);
        setLayout(new GridLayout(0,4));

        this.setTitle("Time Table Generator");
        String[][] data={{"","MONDAY"},{"","MONDAY","","TUESDAY"},{"","MONDAY","TUESDAY","WEDNESDAY"},{"","MONDAY","TUESDAY","WEDNESDAY","THERSDAY"},{"","MONDAY","TUESDAY","WEDNESDAY","THERSDAY","FRIDAY"},{"","MONDAY","TUESDAY","WEDNESDAY","THERSDAY","FRIDAY","SATURDAY"},{"","MONDAY","TUESDAY","WEDNESDAY","THERSDAY","FRIDAY","SATURDAY","SUNDAY"}};


        for (int i=0;i<ff.p;i++){


            l[i]=new JLabel("       "+ff.p2[i]+"       :");
            add(l[i]);
            t[i]=new JTable(ts.t[i],data[ff.x-1]){
                public boolean isCellEditable(int t,int data){
                    return false;
                }
            };
            this.add(new JScrollPane(t[i]));

        }

        for (int i=0;i<ts.xy;i++){

            l1[i]=new JLabel("      time table of "+ts.a1[i]+"         :");
            add(l1[i]);
            tt[i]=new JTable(ts.tt[i],data[ff.x-1]);
            this.add(new JScrollPane(tt[i]));

        }


        buttonCancel.addActionListener(new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                onCancel();
            }
        });


    }



    private void onCancel() {
        ts t= new ts();
        t.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        t.pack();
        t.setVisible(true);

        // add your code here if necessary
        dispose();
    }

    public static void main(String[] args) {
        tt dialog = new tt();
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);
    }
}
