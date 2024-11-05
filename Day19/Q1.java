package Day19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

class CalMachine extends JFrame implements ActionListener {
    private JTextArea ct;
    JLabel clabel;
//    private JButton cb;

    CalMachine(){
        ct = new JTextArea("숫자",10,20);
        Container con = getContentPane();
        GridLayout cl = new GridLayout(4, 4, 1,1);
        JPanel p1 = new JPanel();
        p1.setBackground(Color.blue);
        con.setLayout(cl);
        p1.add(ct);
        p1.add(con);
        ct.add(clabel);

        con.add(new JButton("1"));
        con.add(new JButton("2"));
        con.add(new JButton("3"));
        con.add(new JButton("+"));
        con.add(new JButton("4"));
        con.add(new JButton("5"));
        con.add(new JButton("6"));
        con.add(new JButton("-"));
        con.add(new JButton("7"));
        con.add(new JButton("8"));
        con.add(new JButton("9"));
        con.add(new JButton("*"));
        con.add(new JButton("0"));
        con.add(new JButton("C"));
        con.add(new JButton("="));
        con.add(new JButton("/"));
//        ct.add(cb);
        setTitle("계산기");
        setSize(600, 400);
        setVisible(true);

    }


    @Override
    public void actionPerformed(ActionEvent e) {
        try {
//            String s = ct.getText();
            String input = e.getActionCommand(); //뭐가 눌렸는지 알수있다
            String result = input;
            clabel.setText(input);
//            FileOutputStream fos = new FileOutputStream(s);
//            DataOutputStream dos = new DataOutputStream(fos);
//            dos.writeUTF(ct.getText());
//            fos.close();
//            System.out.println(s);
        }
        catch (Exception exception){

        }
    }
}
public class Q1 {
    public static void main(String[] args) {
        new CalMachine();
    }
}
