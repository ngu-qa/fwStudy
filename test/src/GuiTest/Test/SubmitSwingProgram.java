package GuiTest.Test;

import javax.swing.*;
import java.util.concurrent.TimeUnit;

public class SubmitSwingProgram {
    JLabel label = new JLabel("A label");
    public SubmitSwingProgram() {
        JFrame frame = new JFrame("Hello Swing !");
        frame.add(label);
        SwingConsole.run(frame, 900, 600);
    }

    static SubmitSwingProgram ssp;

    public static void main(String[] args) throws Exception {
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp = new SubmitSwingProgram();
            }
        });
        TimeUnit.SECONDS.sleep(1);
        SwingUtilities.invokeLater(new Runnable() {
            @Override
            public void run() {
                ssp.label.setText("HHHH");
            }
        });
    }
}
