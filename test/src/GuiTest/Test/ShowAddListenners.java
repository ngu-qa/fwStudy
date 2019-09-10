package GuiTest.Test;

import javax.swing.*;
import java.awt.*;
import java.awt.event.*;
import java.lang.reflect.*;
import java.util.regex.*;

public class ShowAddListenners extends JFrame {
    private static String usage = "usage:\n" + "ShowMethods qualified.class.name\n" +
            "To show all methods in class or:\n" + "ShowMethods qualified.class.nam word\n" +
            "To search for methods involving 'word'";
    private JTextField name = new JTextField(25);
    private JTextArea results = new JTextArea(40, 65);
    private static Pattern addListenner = Pattern.compile("(add\\w+?Listener\\(.*?\\))");
    private static Pattern qualifier = Pattern.compile("\\w+\\.");

    class NameL implements ActionListener {
        public void actionPerformed(ActionEvent e) {
            String nm = name.getText().trim();
            if (nm.length() == 0) {
                results.setText(usage);
                return;
            }
            Class<?> kind;
            int lines = 0;
            try {
                kind = Class.forName("javax.swing." + nm);
            } catch (ClassNotFoundException ex) {
                results.setText("No match");
                return;
            }
            Method[] methods = kind.getMethods();
            Constructor[] ctors = kind.getConstructors();
            results.setText(" ");
            for (Method m : methods) {
                Matcher matcher = addListenner.matcher(m.toString());
                if (matcher.find()) {
                    results.append(qualifier.matcher(matcher.group(1)).replaceAll("") + "\n");
                }
                results.append(qualifier.matcher(m.toString()).replaceAll("") + "\n");
            }
            for (Constructor ctor : ctors) {
                results.append(qualifier.matcher(ctor.toString()).replaceAll("") + "\n");
            }
            lines = methods.length + ctors.length;
        }
    }

    public ShowAddListenners() {
        NameL nameListener = new NameL();
        name.addActionListener(nameListener);
        JPanel top = new JPanel();
        top.add(new JLabel("Swing class name (press Enter):"));
        top.add(name);
        add(BorderLayout.NORTH, top);
        add(new JScrollPane(results));
        name.setText("JTestArea");
        nameListener.actionPerformed(new ActionEvent("", 0, ""));
    }

    public static void main(String[] args) {
        SwingConsole.run(new ShowAddListenners(), 500, 400);
    }
}
