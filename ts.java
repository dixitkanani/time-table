package logic;

import jxl.Workbook;
import jxl.write.Label;
import jxl.write.WritableCell;
import jxl.write.WritableSheet;
import jxl.write.WritableWorkbook;
import jxl.write.WriteException;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.io.File;
import java.io.IOException;

public class ts extends JDialog {
    private JPanel contentPane;
    private JButton buttonOK;
    private JButton buttonCancel;
    private JPanel y2;
    private JPanel y1;
    private JButton xlsGenerateButton;
    JTextField[] n = new JTextField[36];
    JTextField[] n1 = new JTextField[36];
    public static int xy=0,xx=0,nn=0,nnn=0;
    public static String[] a6={"MONDAY","TUESDAY","WEDNESDAY","THERSDAY","FRIDAY","SATURDAY","SUNDAY"};

    public static String[] a1=new String[36];
    public static String[] a3=new String[36];
    public static int[] q=new int[36];
    public static int[] p1=new int[36];
    public static String[][][] t = new String[8][8][8];//student
    public static String[][][] tt = new String[8][8][8];//teacher
    public static int xyz;
    public static boolean n0;
    public ts() {
        setContentPane(contentPane);
        setModal(true);
        getRootPane().setDefaultButton(buttonOK);
        y1.setLayout(new GridLayout(0, 1));
        y2.setLayout(new GridLayout(0, 1));


        for (int i = 0; i <sss.z1; i++) {
            for (int j = 0; j <sss.z[i]; j++) {
                JLabel m = new JLabel("Enter teacher"+(j+1)+" name of subject "+sss.a2[i]);
                n[nn] = new JTextField(20);

                JLabel m1 = new JLabel("Enter "+sss.a2[i]+"'s credit of faculty"+(j+1));

                n1[nnn] = new JTextField(20);


                y1.add(m);
                y2.add(n[nn]);
                y1.add(m1);
                y2.add(n1[nnn]);
                nn++;
                nnn++;
            }
        }



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



    }


    private void onOK() {
        for (int i = 0; i <sss.z1; i++) {
            for (int j = 0; j <sss.z[i]; j++) {
                a1[xy] = n[xy].getText();
                q[xy] = Integer.parseInt(n1[xy].getText());
                xx += q[xy];
                a3[xy] = sss.a2[i] + " " + nameso(a1[xy]);
                xy++;
            }}
        System.out.println(xy+"   "+xx);
        for (int n = 0; n < ff.p; n++) {

            for (int i = 0; i <ff. y; i++) {
                t[n][i][0]=ff.a5[i];
               }}
        for (int n = 0; n < xy; n++) {

            for (int i = 0; i <ff. y; i++) {
                tt[n][i][0]=ff.a5[i];
            }}
        for (int i = 0; i < xy; i++) {
            for (int j = 0; j < xy; j++) {
                if (q[j] <= q[i]) {
                    int temp;
                    temp = q[i];
                    q[i] = q[j];
                    q[j] = temp;
                    String tem;
                    tem = a3[i];
                    a3[i] = a3[j];
                    a3[j] = tem;
                }
            }
        }


        tgl();
        if (n0==false){
            try {
                ttt();
            } catch (IOException e1) {
                e1.printStackTrace();
            } catch (WriteException e1) {
                e1.printStackTrace();
            }}

//
        if (ff.x *ff. y >= xx) {
        tt dialog = new tt();
        dialog.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        dialog.pack();
        dialog.setVisible(true);
        System.exit(0);}
        else {
            JOptionPane.showMessageDialog(null,"total creadit must be less then or equal to (number of study day pr week)*(number of letcher pr day)");
        }

//setVisible(false);
        // add your code here
       // dispose();
    }

    private void onCancel() {
        sss f=new sss();
        f.getContentPane().setPreferredSize(Toolkit.getDefaultToolkit().getScreenSize());
        f.pack();
        f.setVisible(true);
        // add your code here if necessary
        dispose();
    }
    public void tgl() {
        if (ff.x *ff. y >= xx) {

            for (int i1 = 0; i1 < ff.p; i1++) {
                xyz = 0;
                for (int n = 0; n < xy; n++) {
                    p1[n] = q[n];
                    for (int i = 0; i <ff. y; i++) {
                        for (int j = 0; j <= ff.x; j++) {
                            if (p1[n] > 0) {

                                if (tt[n][i][j] == null && t[i1][i][j] == null ) {
                                    if (j==0){
                                        tt[n][i][0]=ff.a5[i];
                                        t[i1][i][0] =ff.a5[i];
                                    }
                                    else {
                                    tt[n][i][j] =ff. p2[i1];

                                    t[i1][i][j] = a3[n];
                                    xyz++;
                                    p1[n]--;}
                                }
                            }
                        }
                    }
                }

                if (xyz == xx) {

                } else {
                    n0=true;

                }
            }
        }

    }

    static void ttt() throws IOException, WriteException {
        int i1=0;
        WritableWorkbook wb= Workbook.createWorkbook(new File("TTgG.xls"));
        WritableSheet ws= wb.createSheet("Sheet 1",0);
        WritableCell w1= new jxl.write.Label(0, 0, "                                       TIME TABLE                             ");
        ws.addCell(w1);

        for (int x1 = 0; x1 < ff.p; x1++) {
            i1++;
            i1++;
            i1++;
            for (int j1 = 0; j1 < ff.x; j1++) {
                WritableCell w2 = new jxl.write.Label(0, i1-2, "                                             "+ff.p2[x1]+"                                 ");
                ws.addCell(w2);
                WritableCell ww = new jxl.write.Label(j1+1, i1-1, a6[j1]);
                ws.addCell(ww);
            }
            for (int i = 0; i <ff. y; i++) {
                for (int j = 0; j <= ff.x; j++) {

                    if(t[x1][i][j]!=null){
                        WritableCell wc = new jxl.write.Label(j, i1, t[x1][i][j]);
                        ws.addCell(wc); }
                    else {
                        t[x1][i][j]="free";
                        WritableCell wc = new jxl.write.Label(j, i1, "free");
                        ws.addCell(wc);

                    }
                }i1++;}
        }

        for (int x1 = 0; x1 < xy; x1++) {
            i1++;
            i1++;
            i1++;
            for (int j1 = 0; j1 <ff. x; j1++) {
                WritableCell w2 = new jxl.write.Label(0, i1-2,"                                             "+ a1[x1]+"                                 ");
                ws.addCell(w2);
                WritableCell ww = new jxl.write.Label(j1+1, i1-1, a6[j1]);
                ws.addCell(ww);}
            for (int i = 0; i <ff. y; i++) {
                for (int j = 0; j <=ff. x; j++) {
                    if(tt[x1][i][j]!=null){
                        WritableCell wc = new jxl.write.Label(j, i1, tt[x1][i][j]);
                        ws.addCell(wc);
                    }
                    else {
                        tt[x1][i][j]="free";
                        WritableCell wc = new Label(j, i1, "free");
                        ws.addCell(wc);
                    }
                }i1++;}
        }
        wb.write();
        wb.close();

//        if (ff.x * ff.y >= xx) {
//            for (int x1 = 0; x1 < ff.p; x1++) {
//                System.out.println("Batch"+(x1+1));
//                for (int i = 0; i <ff.y; i++) {
//                    for (int j = 0; j <= ff.x; j++) {
//                        System.out.print(t[x1][i][j] + " ");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }
//            System.out.println("----------------------------------------");
//            System.out.println();
//            for (int x1 = 0; x1 < xy; x1++) {
//                System.out.println("time table of "+a1[x1]);
//                for (int i = 0; i < ff.y; i++) {
//                    for (int j = 0; j <= ff.x; j++) {
//                        System.out.print(tt[x1][i][j] + " ");
//                    }
//                    System.out.println();
//                }
//                System.out.println();
//            }

//        }
    }
    public static String nameso (String a1){
        int k = 1;
        char[] a = new char[a1.length()];
        for (int i = 0; i < a1.length(); i++) {
            if (i == 0) {
                a[i] = a1.charAt(0);
            } else {
                if (a1.charAt(i) == ' ') {
                    a[k] = a1.charAt(i + 1);
                    k++;
                }
            }
        }
        String n = new String(a);
        return n.toUpperCase();
    }

    public static void main(String[] args) {
        ts dialog = new ts();

        dialog.pack();
        dialog.setVisible(true);
//        System.exit(0);
    }
}
