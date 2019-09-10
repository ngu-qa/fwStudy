package GuiTest;

import javax.swing.*;
import java.util.Random;
import java.util.concurrent.TimeUnit;

public class HelloSwing {
    public static void main(String[] args) throws Exception{
        JFrame frame = new JFrame("Hello Swing !");
        JLabel label = new JLabel("A label");
        Random kk = new Random(5);
        for (int i = 0;i<kk.nextInt();i++)
            System.out.println(kk.nextInt());
            frame.add(label);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        frame.setSize(300,100);
        frame.setVisible(true);
        TimeUnit.SECONDS.sleep(1);
        label.setText("hhhhhh");
    }
}
