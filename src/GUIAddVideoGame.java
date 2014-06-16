/**
 * A GUI application that displays the window for adding a video game and 
 * interacts with the user via Buttons and ActionListener interface.
 * @author Z.R. & Yp.Y
 */
import java.awt.Dimension;
import java.awt.FlowLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JOptionPane;
import javax.swing.JTextField;

public class GUIAddVideoGame extends JFrame implements ActionListener
{

   private PersonalLibraryController controller;
   private JLabel title, format, location, notes;
   private JButton addButton, cancel;
   private JTextField tf1, tf2, tf3, tf4;

   /**
    * Sets the initial GUI for adding a book
    */
   private void initialize()
   {
      // Set GridLayout with 6 rows and 2 columns
      this.setLayout(new GridLayout(6, 2, 10, 10));

      // Creats a textfield for user to input the title of the video game
      title = new JLabel(" Title:");
      this.add(title);
      tf1 = new JTextField();
      tf1.setPreferredSize(new Dimension(150, 20));
      this.add(tf1);

      // Creats a textfield for user to input the format of the video game
      format = new JLabel(" Format:");
      this.add(format);
      tf2 = new JTextField();
      tf2.setPreferredSize(new Dimension(150, 20));
      this.add(tf2);

      // Creats a textfield for user to input the location of the video game
      location = new JLabel(" Location:");
      this.add(location);
      tf3 = new JTextField();
      tf3.setPreferredSize(new Dimension(150, 20));
      this.add(tf3);

      // Creats a textfield for user to input the notes of the video game
      notes = new JLabel(" Notes:");
      this.add(notes);
      tf4 = new JTextField();
      tf4.setPreferredSize(new Dimension(150, 20));
      this.add(tf4);

      // Creates a button for submitting the information
      addButton = new JButton("Add");
      this.add(addButton);
      addButton.addActionListener(this);

      // Creats a button for going back to the main menu
      cancel = new JButton("Cancel");
      this.add(cancel);
      cancel.addActionListener(this);
   }

   /**
    * Calls the method initialize()
    */
   public GUIAddVideoGame()
   {
      this.initialize();

      this.setSize(300, 250);
      this.setTitle("Add Video Game");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(false);
   }

   /**
    * Connects to the sub-windows
    */
   public void actionPerformed(ActionEvent evt)
   {
      // Adds the object to the list and shows the messages after click "Add"
      if (evt.getSource() == addButton)
      {
         if (tf1.getText().isEmpty())
            JOptionPane.showMessageDialog(null,
                  "Title is requird. \nPlease enter the title.");
         else
         {
            controller = new PersonalLibraryController();
            controller.addMediaInfo(tf1.getText(), tf2.getText(),
                  tf3.getText(), tf4.getText());
            controller.addVideoGameInfo(tf1.getText(), tf2.getText(),
                  tf3.getText(), tf4.getText());
            this.setVisible(false);
            GUIMenu m = new GUIMenu();
            JOptionPane.showMessageDialog(null, " Adding is done.");
            m.setVisible(true);
         }
      }

      // Goes back to GUIAdd after clicking "cancel" button
      else if (evt.getSource() == cancel)
      {
         this.setVisible(false);
         GUIAdd a = new GUIAdd();
         a.setVisible(true);
      }
   }
}
