/**
 * A GUI application that is used for inputting requirements to retrieve in the Personal Library 
 * and interacts with the user via CheckBox, TextField, Buttons and ActionListener interface.
 * @author Z.R.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.Serializable;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIRetrieve extends JFrame implements ActionListener, Serializable
{

   private JCheckBox b1, b2, b3, b4;
   private JTextField tf1;
   private JButton done;
   private JButton back;
   /**
    * Sets the initial GUI for for choosing a type to add
    */
   private void initialize()
   {
	      // Sets the size and the title of the window
	      // Creats a check boxes for choosing a type of media
	      // Creats a textfield for users to input the title
	      // Creates the buttons to submit or go back
	      // Closes this window
	      // Makes this main menu invisible at first
	      this.setVisible(false);
   }

   /**
    * Calls the method initialize()
    */
   public GUIRetrieve()
   {
      this.initialize();
   }

   /**
    * Connets to the subwindow
    */
   public void actionPerformed(ActionEvent evt)
   {
	      // Goes back to the main menu after clicking "back" buttom
	      if (evt.getSource() == back)
	      {
	         this.setVisible(false);
	         GUIMenu g = new GUIMenu();
	         g.setVisible(true);
	      }
	      // Shows GUIRetrieveResult and close this window after clicking "done"
	      // Error message
   }
}
