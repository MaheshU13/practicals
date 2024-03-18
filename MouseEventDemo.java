import javax.swing.*;
import java.awt.*;
import java.awt.event.*;

class MouseEventDemo extends JFrame implements MouseListener {
    String str="";

    MouseEventDemo() {
        addMouseListener(this);
        setSize(400, 400);
        setVisible(true);
        setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
    }

    public void mouseClicked(MouseEvent e) {
        str = "Mouse Clicked";
        repaint();
    }

    public void mouseEntered(MouseEvent e) {
        str = "Mouse Entered";
        repaint();
    }

    public void mouseExited(MouseEvent e) {
        str = "Mouse Exited";
        repaint();
    }

    public void mousePressed(MouseEvent e) {
        str = "Mouse Pressed";
        repaint();
    }

    public void mouseReleased(MouseEvent e) {
        str = "Mouse Released";
        repaint();
    }

    public void paint(Graphics g) {
        super.paint(g);
        g.drawString(str, 50, 50);
    }

    public static void main(String args[]) {
        new MouseEventDemo();
    }
}
