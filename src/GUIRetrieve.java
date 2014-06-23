/**
 * A GUI application that is used for inputting requirements to retrieve in the Personal Library 
 * and interacts with the user via CheckBox, TextField, Buttons and ActionListener interface.
 * @author Z.R.
 */
import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.io.Serializable;

import javax.swing.JButton;
import javax.swing.JCheckBox;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class GUIRetrieve extends JFrame implements ActionListener
{

   private JCheckBox boxBook, boxSong, boxVideo, boxGame;
   private JTextField fieldTitle;
   private JPanel p1, p2, p3, p4, p5;
   private JButton done;
   private JButton cancel;

   private GUIMenu menuView;

   // private PersonalLibraryController controller;

   /**
    * Sets the initial GUI for printing every entry
    */
   private void initialize()
   {

      // Create the panels for the buttons and set GridLayout
      p1 = new JPanel();
      p2 = new JPanel(new BorderLayout());
      p3 = new JPanel();
      p4 = new JPanel(new BorderLayout());
      p5 = new JPanel();
      this.setLayout(new GridLayout(3, 2));

      // Creates the buttons to submit or go back
      done = new JButton("Done");
      this.add(done);
      done.addActionListener(this);

      cancel = new JButton("Cancel");
      this.add(cancel);
      cancel.addActionListener(this);

      // Creats check boxes for choosing a type of media to delete
      boxBook = new JCheckBox("Book");
      boxBook.setMnemonic(KeyEvent.VK_C);
      boxBook.setSelected(false);
      boxBook.addActionListener(this);

      boxSong = new JCheckBox("Song");
      boxSong.setMnemonic(KeyEvent.VK_C);
      boxSong.setSelected(false);
      boxSong.addActionListener(this);

      boxVideo = new JCheckBox("Video");
      boxVideo.setMnemonic(KeyEvent.VK_C);
      boxVideo.setSelected(false);
      boxVideo.addActionListener(this);

      boxGame = new JCheckBox("Video Game");
      boxGame.setMnemonic(KeyEvent.VK_C);
      boxGame.setSelected(false);
      boxGame.addActionListener(this);

      // Creats a textfield for user to input the title
      fieldTitle = new JTextField();
      fieldTitle.setPreferredSize(new Dimension(150, 20));
      this.add(fieldTitle);

      // Adds checkboxes and textfield to the panel and locates the panels
      p1.add(boxBook);
      p1.add(boxSong);
      p1.add(boxVideo);
      p1.add(boxGame);
      p2.add(new JLabel("   Retrieve by type:"), BorderLayout.NORTH);
      p2.add(p1, BorderLayout.CENTER);
      p3.add(fieldTitle);
      p4.add(new JLabel("   Retrieve by title:"), BorderLayout.NORTH);
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
   public GUIRetrieve(GUIMenu menu)
   {
      this.initialize();

      this.menuView = menu;
      // this.controller = controller;

      this.setSize(300, 250);
      this.setTitle("Retrieve Entries");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // this.setVisible(false);
   }

   /**
    * Connects to the subwindows
    */
   public void actionPerformed(ActionEvent evt)
   {
      if (boxBook.isSelected() && evt.getSource() == done)
         System.out.println("check box works!!!!");

      if (boxSong.isSelected() && evt.getSource() == done)
         System.out.println("check box works!!!!");

      if (boxVideo.isSelected() && evt.getSource() == done)
         System.out.println("check box works!!!!");

      if (boxGame.isSelected() && evt.getSource() == done)
         System.out.println("check box works!!!!");

      if (evt.getSource() == cancel)
      {
         this.setVisible(false);
         menuView.setVisible(true);
      }

      // Error message
   }
}