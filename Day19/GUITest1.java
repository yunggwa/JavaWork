package Day19;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.DataOutputStream;
import java.io.FileOutputStream;

class GUI1 extends JFrame implements ActionListener{
    private JTextField jtf;
    private JTextArea jta;
    GUI1(){
        JButton jb = new JButton("파일로 저장");
        jtf = new JTextField("파일 이름을 입력하세요",20);
        jta = new JTextArea("파일의 내용을 입력하세요", 10, 20);
        Container ct = getContentPane(); // 추출
        ct.setLayout(new FlowLayout()); //물흐르듯이 배치한다는 ㄷ뜻
        JPanel p1 = new JPanel();
        ct.add(jta);
        p1.add(jtf);
        p1.add(jb);
        ct.add(p1);
        jb.addActionListener(this); //어떤 버튼이나 이벤트가 발생하면 대응할수있게 뭔가 나온다
        //버튼에 클릭이 일어나면 내 안에 있는 리스너 연결
        setTitle("GUI Test1");
        setSize(500, 300);
        setVisible(true);
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        try {
            String s = jtf.getText();
            FileOutputStream fos = new FileOutputStream(s);
            DataOutputStream dos = new DataOutputStream(fos);
            dos.writeUTF(jta.getText());
            fos.close();
            System.out.println(s + "파일 생성되었습니다");
        }
        catch (Exception exception){

        }
    }
}
public class GUITest1 {
    public static void main(String[] args) {
        new GUI1();
    }
}
