/**
 * A GUI application that is used for deleting an entry in the Personal Library 
 * and interacts with the user via TextField, Buttons and ActionListener interface.
 * @author Z.R.
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTable;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.table.AbstractTableModel;
import javax.swing.table.TableColumn;
import javax.swing.table.TableModel;

public class GUIDeleteResult extends JFrame implements ActionListener
{

   private JTextField textfield;
   private JTextArea textArea;
   private JButton delete, cancel;
   private JPanel p1, p2;
   private JComboBox mediaList;

   private ArrayList<Media> personalLibraryList;
   private PersonalLibraryController controller;
   private GUIMenu menuView;

   /**
    * Sets the initial GUI for printing every entry
    */
   private void initialize()
   {
      // Creates the panels for the buttons and set GridLayout
      p1 = new JPanel();
      p2 = new JPanel(new BorderLayout());
      this.setLayout(new GridLayout(1, 1));
      

      // Creates a area to print all the entries of Personal Library
      textArea = new JTextArea();
      textArea.setEditable(false);
      this.add(textArea);
      JScrollPane sp = new JScrollPane();
      sp.setViewportView(textArea);

      // Creats a button of going back to the main menu
      cancel = new JButton("Cancel");
      this.add(cancel);
      cancel.addActionListener(this);

      p1.add(cancel);
      p2.add(sp, BorderLayout.CENTER);
      p2.add(p1, BorderLayout.SOUTH);
      add(p2, BorderLayout.SOUTH);

     
   }

   /**
    * Calls the method initialize()
    */
   public GUIDeleteResult(GUIMenu menu, PersonalLibraryController controller)
   {
      this.initialize();

      this.menuView = menu;
      this.controller = controller;

      this.setSize(300, 250);
      this.setTitle("Delete Result");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      //this.setVisible(false);
   }

   /**
    * Send a message to user
    */
   public void showPopup(String message)
   {
      JOptionPane.showMessageDialog(null, message);
   }

   /**
    * Connets to the subwindows
    */
   public void actionPerformed(ActionEvent evt)
   {
      // Goes back to GUIDelete
      // Shows the entry deleted successfully aftering clicking the "delete"
      // Error message
      if (evt.getSource() == delete)
      {
         if (textfield.getText().isEmpty())
            showPopup("ID nuumber is requird. \nPlease enter a number.");
         else
         {
            int index = Integer.parseInt(textfield.getText()) - 1;
            controller.deleteEntries(index);
            showPopup("Deleting is done.");
         }
      }

      else if (evt.getSource() == cancel)
      {
         this.setVisible(false);
         menuView.setVisible(true);
      }
   }
}
