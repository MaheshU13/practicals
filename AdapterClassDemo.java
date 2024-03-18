import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;
import java.awt.event.WindowStateListener;
import javax.swing.*;

public class AdapterClassDemo {
    public static void main(String[] args) {
        JFrame frame = new JFrame();

        JPanel panel = new JPanel();
        JLabel label = new JLabel("Initially Normal");
        panel.add(label);

        frame.add(panel);
        frame.setSize(300, 200);
        frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

        frame.addWindowStateListener(new WindowAdapterDemo(label));

        frame.setVisible(true);
    }
}

class WindowAdapterDemo extends WindowAdapter implements WindowStateListener {
    private JLabel label;

    public WindowAdapterDemo(JLabel label) {
        this.label = label;
    }

    
    public void windowStateChanged(WindowEvent e) {
        int newState = e.getNewState();
        
        if ((newState & JFrame.MAXIMIZED_BOTH) == JFrame.MAXIMIZED_BOTH) {
            label.setText("Window size : Maximized");
        } 
        else {
            label.setText("Window size : Normal");
        }
    }
}
