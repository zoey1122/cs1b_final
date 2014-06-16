/**
 * A GUI application that prints every entry in the Personal Library and 
 * interacts with the user via Buttons and ActionListener interface.
 * @author Z.R. & M.A.
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.util.ArrayList;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextArea;

public class GUIPrintResult extends JFrame implements ActionListener
{

   private JButton cancel;
   private JTextArea printArea;
   private JPanel p1, p2;
   private ArrayList<Media> personalLibraryList = new ArrayList<Media>();

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
      printArea = new JTextArea();

      // Reads from the personal library file "data"
      ObjectInputStream inObject;
      try
      {
         FileInputStream inFile;
         inFile = new FileInputStream("data");
         inObject = new ObjectInputStream(inFile);
         personalLibraryList = (ArrayList<Media>) inObject.readObject();

         System.out.println(personalLibraryList);
         inFile.close();
         inObject.close();
      } catch (IOException ioe)
      {
         System.out.println("Error reading from the file: " + ioe.getMessage());
         JOptionPane.showMessageDialog(null,
               "The personal library list is Empty");

      } catch (ClassNotFoundException cnfe)
      {
         System.out.println("Error in casting: " + cnfe);
      }

      // Displays all the entries in the Personal Library
      for(int i=0;i<personalLibraryList.size();i++)
      {
        printArea.append(personalLibraryList.get(i).toString());
      }
      printArea.setEditable(false);
      this.add(printArea);

      // Creats a button of going back to the main menu
      cancel = new JButton("Cancel");
      this.add(cancel);
      cancel.addActionListener(this);

      p1.add(cancel);
      p2.add(printArea, BorderLayout.CENTER);
      p2.add(p1, BorderLayout.SOUTH);
      add(p2, BorderLayout.SOUTH);

   }

   /**
    * Shows the initial GUI for window
    */
   public GUIPrintResult()
   {
      this.initialize();

      this.setSize(300, 300);
      this.setTitle("Personal Library");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(false);
   }

   /**
    * Goes back to the main menu after clicking "cancel" buttom
    */
   public void actionPerformed(ActionEvent evt)
   {

      if (evt.getSource() == cancel)
      {
         this.setVisible(false);
         GUIMenu m = new GUIMenu();
         m.setVisible(true);
      }
   }
}
