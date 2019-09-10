package GuiTest.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Button1 extends JFrame {
    private JButton b1 = new JButton("Show Strings");
    private JButton b2 = new JButton("Show Regular Expression");
    private JButton b3 = new JButton("Show Result");

    private JTextField jTextField = new JTextField(10);
    private JTextArea jTextArea1 = new JTextArea(5, 20);
    private JTextArea jTextArea2 = new JTextArea(5, 30);

    public ActionListener aa = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String name = "abcabcabcdefabc";
            jTextArea1.append(name);
        }
    };

    public ActionListener bb() {
        return new ActionListener() {
            public void actionPerformed(ActionEvent e) {
                String n = "abc+";
                jTextField.setText(n);
            }
        };
    }

    public ActionListener cc = new ActionListener() {
        public void actionPerformed(ActionEvent e) {
            String s = "abcabcabcdefabc";
            jTextArea2.append("Regular Expression: \"" + s + "\"" + "\n");
            Pattern p = Pattern.compile("abc+");
            Matcher m = p.matcher(s);
            while (m.find()) {
                jTextArea2.append("Macth \"" + m.group() + "\" at positions " + m.start() + "-" + (m.end() - 1) + "\r\n");
            }
            jTextArea2.setLineWrap(true);
        }
    };

    public Button1() {
        b1.addActionListener(aa);
        b2.addActionListener(bb());
        b3.addActionListener(cc);
        setLayout(new FlowLayout());
        add(new JScrollPane(jTextArea1));
        add(b1);
        add(b2);
        add(b3);
        add(jTextField);
        add(new JScrollPane(jTextArea2));

    }

    public static void main(String[] args) {
        SwingConsole.run(new Button1(), 1600, 800);
    }
}
