import javax.swing.*;
public class AWT1 {
public static void createAndShowGUI() {
JFrame f1 = new JFrame("AWT FrameDemo");
f1.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
JLabel label = new JLabel("Label");
label.setPreferredSize(new Dimension(175, 100));
f1.getContentPane().add(label, BorderLayout.CENTER);
f1.pack();
f1.setVisible(true);
}
public static void main(String args[]) {
createAndShowGUI();
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.awt.Frame;
import java.awt.Graphics;
public class AWT2 {
public static void main(String args[]) {
MyFrame frame = new MyFrame();
frame.setTitle("To display an oval inside the AWT Frame");
frame.setBounds(100,50,500,300);frame.setVisible(true);
}
static class MyFrame extends Frame {
public void paint(Graphics gr) {
gr.drawOval(10,10,100,60)
}
}
}
