/**
 * A GUI application that is used for searching entries to delete in the Personal Library 
 * and interacts with the user via CheckBox, TextField, Buttons and ActionListener interface.
 * @author Z.R.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIDelete extends JFrame implements ActionListener
{

   private JCheckBox b1, b2, b3, b4;
   private JTextField tf1;
   private JButton done;
   private JButton back;

   /**
    * Sets the initial GUI for printing every entry
    */
   private void initialize()
   {
	      // Sets the size and the title of the window
	      // Creates the buttons to submit or go back
	      // Creats a check boxes for choosing a type of media to delete
	      // Creats a textfield for user to input the title
	      // Closes this window
	      // Makes this main menu invisible at first
	      this.setVisible(false);
   }

   /**
    * Calls the method initialize()
    */
   public GUIDelete()
   {
      this.initialize();
   }

   /**
    * Connects to the subwindows
    */
   public void actionPerformed(ActionEvent evt)
   {
      if (evt.getSource() == back)
      { 
         this.setVisible(false);
         GUIMenu g = new GUIMenu();
         g.setVisible(true);
      }
      // Shows GUIDeleteResult and closes this window after clicking "done"
      // Error message
   }
}
