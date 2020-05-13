import java.awt.*; // Using AWT container and component classes
import java.awt.event.*; // Using AWT event classes and listener interfaces
// An AWT program inherits from the top-level container java.awt.Frame
public class AWTCounter extends Frame implements ActionListener {
private Label lblCount; // Declare a Label component
private TextField tfCount; // Declare a TextField component
private Button btnCount; // Declare a Button component
private int count = 0; // Counter's value
// Constructor to setup GUI components and event handlers
public AWTCounter () {
setLayout(new FlowLayout());// "super" Frame, which is a Container, sets its layout to
FlowLayout to arrange
// the components from left-to-right, and flow to next row from top-to-bottom.
lblCount = new Label("Counter"); // construct the Label component
add(lblCount);
// "super" Frame container adds Label component
tfCount = new TextField("0", 10); // construct the TextField component
tfCount.setEditable(false);
// set to read-only
add(tfCount);
// "super" Frame container adds TextField component
btnCount = new Button("Count"); // construct the Button component
add(btnCount);
// "super" Frame container adds Button component
btnCount.addActionListener(this);
// "btnCount" is the source object that fires an ActionEvent when clicked.
// The source add "this" instance as an ActionEvent listener, which provides
// an ActionEvent handler called actionPerformed().
// Clicking "btnCount" invokes actionPerformed().
setTitle("AWT Counter"); // "super" Frame sets its title
setSize(250, 100);
// "super" Frame sets its initial window size
// For inspecting the Container/Components objects
// System.out.println(this);
// System.out.println(lblCount);
// System.out.println(tfCount);
// System.out.println(btnCount);
setVisible(true);
// "super" Frame shows
// System.out.println(this);
// System.out.println(lblCount);
// System.out.println(tfCount);// System.out.println(btnCount);
}
// The entry main() method
public static void main(String[] args) {
// Invoke the constructor to setup the GUI, by allocating an instance
AWTCounter app = new AWTCounter();
// or simply "new AWTCounter();" for an anonymous instance
}
// ActionEvent handler - Called back upon button-click.
public void actionPerformed(ActionEvent evt) {
++count; // Increase the counter value
// Display the counter value on the TextField tfCount
tfCount.setText(count + ""); // Convert int to String
}
}

//-----------------------------------------------------------------------------------------------------------------------------------------------------------------------------------------
import java.awt.*;
import java.awt.event.*;
// An AWT GUI program inherits the top-level container java.awt.Frame
public class AWTCounter3Buttons1Listener extends Frame {
private TextField tfCount;
private Button btnCountUp, btnCountDown, btnReset;
private int count = 0;
// Constructor to setup the GUI components and event handlers
public AWTCounter3Buttons1Listener () {
setLayout(new FlowLayout());
add(new Label("Counter"));
tfCount = new TextField("0", 10);
tfCount.setEditable(false);
add(tfCount);
// Construct Buttons
btnCountUp = new Button("Count Up");add(btnCountUp);btnCountDown = new Button("Count Down");
add(btnCountDown);
btnReset = new Button("Reset");
add(btnReset);
// Allocate an instance of the "named" inner class BtnListener.
BtnListener listener = new BtnListener();
// Use the same listener instance for all the 3 Buttons.
btnCountUp.addActionListener(listener);
btnCountDown.addActionListener(listener);
btnReset.addActionListener(listener);
setTitle("AWT Counter");
setSize(400, 100);
setVisible(true);
}
// The entry main method
public static void main(String[] args) {
new AWTCounter3Buttons1Listener(); // Let the constructor do the job
}
/**
* BtnListener is a named inner class used as ActionEvent listener for all the Buttons.
*/
private class BtnListener implements ActionListener {
public void actionPerformed(ActionEvent evt) {
// Need to determine which button fired the event.
// the getActionCommand() returns the Button's label
String btnLabel = evt.getActionCommand();
if (btnLabel.equals("Count Up")) {
++count;
} else if (btnLabel.equals("Count Down")) {
--count;
} else {
count = 0;
}
tfCount.setText(count + "");
}
}
}
