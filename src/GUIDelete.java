/**
 * A GUI application that is used for searching entries to delete in the Personal Library 
 * and interacts with the user via CheckBox, TextField, Buttons and ActionListener interface.
 * @author Z.R.
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JComboBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIDelete extends JFrame implements ActionListener
{

   private JTextField fieldTitle;
   private JPanel p1, p2, p3, p4, p5;
   private JComboBox mediaList;
   private JButton done;
   private JButton cancel;
   private String theType, theTitle;

   private GUIMenu menuView;
   private PersonalLibraryController controller;

   // private PersonalLibraryController controller;

   /**
    * Sets the initial GUI for printing every entry
    */
   private void initialize()
   {

      // Create the panels and set GridLayout
      p1 = new JPanel();
      p2 = new JPanel(new BorderLayout());
      p3 = new JPanel();
      p4 = new JPanel(new BorderLayout());
      p5 = new JPanel();
      this.setLayout(new GridLayout(3, 2));

      // Creates buttons to submit or go back
      done = new JButton("Done");
      this.add(done);
      done.addActionListener(this);

      cancel = new JButton("Cancel");
      this.add(cancel);
      cancel.addActionListener(this);

      // Create the combo box used to select a media type to delete
      String[] mediaStrings =
      { "VideoGame", "Video", "Song", "Book", "" };
      mediaList = new JComboBox(mediaStrings);
      mediaList.setSelectedIndex(4);
      mediaList.addActionListener(this);

      // Creats a textfield for user to input the title to delete
      fieldTitle = new JTextField();
      fieldTitle.setPreferredSize(new Dimension(150, 20));
      this.add(fieldTitle);

      // Adds checkboxes and textfield to the panel and locates the panels
      p1.add(mediaList);
      p2.add(new JLabel("   Delete by type:"), BorderLayout.NORTH);
      p2.add(p1, BorderLayout.CENTER);
      p3.add(fieldTitle);
      p4.add(new JLabel("   Delete by title:"), BorderLayout.NORTH);
      p4.add(p3, BorderLayout.CENTER);
      p5.add(done);
      p5.add(cancel);

      add(p2, BorderLayout.NORTH);
      add(p4, BorderLayout.CENTER);
      add(p5, BorderLayout.SOUTH);

   }

   /**
    * Shows the initial GUI for this window
    */
   public GUIDelete(GUIMenu menu)
   {
      this.initialize();

      this.menuView = menu;
      // this.controller = controller;

      this.setSize(300, 250);
      this.setTitle("Delete Entry");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // this.setVisible(false);
   }

   public void showPopup(String message)
   {
      JOptionPane.showMessageDialog(null, message);
   }

   /**
    * Connects to the subwindows
    */
   public void actionPerformed(ActionEvent evt)
   {

      // Shows GUIRetrieveResult and close this window after clicking "done"
      if (evt.getSource() == done)
      {
         theType = (String) mediaList.getSelectedItem();
         theTitle = fieldTitle.getText();

         if (theType.equals("") && theTitle.equals(""))
            showPopup("Please choose a type or enter the title.");
         else
         {
            this.setVisible(false);
            GUIDeleteResult result = new GUIDeleteResult(this.menuView,
                  this.controller);
            result.setVisible(true);
         }
      }

      else if (evt.getSource() == cancel)
      {
         this.setVisible(false);
         menuView.setVisible(true);
      }

   }
}
