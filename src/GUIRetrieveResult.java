/**
 * A GUI application that shows the result of every entry that user retrieved
 *  via Buttons and ActionListener interface.
 * @author Z.R.
 */
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JTextField;

public class GUIRetrieveResult extends JFrame implements ActionListener
{
   private JLabel lb1, lb2;
   private JButton ok;
   private JButton back;
   /**
    * Sets the initial GUI for printing every entry
    */
   private void initialize()
   {
	      // Sets the size and the title of the window
	      // Creats a textfield
	      // Makes this main menu invisible at first
	      this.setVisible(false);
   }

   /**
    * Calls the method initialize()
    */
   public GUIRetrieveResult()
   {
      this.initialize();
   }

   /**
    * Connets to the subwindows
    */
   public void actionPerformed(ActionEvent evt)
   {
        // Goes back to GUIRetrieve after clicking "back" buttom
        // Shows the result
   }
}
