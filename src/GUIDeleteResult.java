/**
 * A GUI application that is used for deleting an entry in the Personal Library 
 * and interacts with the user via TextField, Buttons and ActionListener interface.
 * @author Z.R.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextArea;
import javax.swing.JTextField;

public class GUIDeleteResult extends JFrame implements ActionListener
{
   
   private JTextField textfield;
   private JTextArea textArea;
   private JButton delete, back;
   /**
    * Sets the initial GUI for printing every entry
    */
   private void initialize()
   {
	      // Sets the size and the title of the window
	      // Creates the buttons to delete or go back
	      // Creats a textfield for user to input the ID#
	      // Closes this window
	      // Makes this main menu invisible at first
	      this.setVisible(false);
   }

   /**
    * Calls the method initialize()
    */
   public GUIDeleteResult()
   {
      this.initialize();
   }

   /**
    * Connets to the subwindows
    */
   public void actionPerformed(ActionEvent evt)
   {
	      // Goes back to GUIDelete
	      // Shows the entry deleted successfully aftering clicking the "delete"
	      // Error message
   }
}
