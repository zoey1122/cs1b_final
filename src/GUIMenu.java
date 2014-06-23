/**
 * A GUI application that displays the main menu for personal library and 
 * interacts with the user via Buttons and ActionListener interface.
 * @author Z.R.
 */

import java.awt.event.*;

import javax.swing.*;

import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.util.ArrayList;

public class GUIMenu extends JFrame implements ActionListener
{
   private JButton addInfo, printInfo, retrieveInfo, deleteInfo;
   private JPanel p1, p2;

   private PersonalLibraryController controller;

   /**
    * Sets the initial GUI for adding the information of media
    */
   private void initialize()
   {

      // Create the panels for the buttons and set GridLayout
      p1 = new JPanel();
      p2 = new JPanel();
      this.setLayout(new GridLayout(3, 1));

      // Creates a button for adding
      addInfo = new JButton("Add");
      this.add(addInfo);
      addInfo.addActionListener(this);

      // Creates a button for printing
      printInfo = new JButton("Print");
      this.add(printInfo);
      printInfo.addActionListener(this);

      // Creates a button for retrieving
      retrieveInfo = new JButton("Retrieve");
      this.add(retrieveInfo);
      retrieveInfo.addActionListener(this);

      // Creates a button for deleting
      deleteInfo = new JButton("Delete");
      this.add(deleteInfo);
      deleteInfo.addActionListener(this);

      // Adds button to the panel and locates the panels
      p1.add(addInfo);
      p1.add(printInfo);
      p2.add(retrieveInfo);
      p2.add(deleteInfo);
      add(new JLabel("   What do you want to do with the library"),
            BorderLayout.NORTH);
      add(p1, BorderLayout.NORTH);
      add(p2, BorderLayout.CENTER);

   }

   /**
    * Shows the initial GUI for main menu
    */
   public GUIMenu(PersonalLibraryController controller)
   {
      this.controller = controller;

      this.initialize();

      this.setSize(300, 250);
      this.setTitle("Personal Library");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      this.setVisible(true);

   }

   /**
    * Connects to the subwindows for adding, printing, retrieving and deleting
    * entries in the Personal Library
    */
   public void actionPerformed(ActionEvent evt)
   {
      // Shows the window for adding information
      if (evt.getSource() == addInfo)
      {
         this.setVisible(false);
         GUIAdd a = new GUIAdd(this.controller, this);
         addInfo.addActionListener(a);
         a.setVisible(true);
      }

      // Shows the window for printing information
      if (evt.getSource() == printInfo)
      {
         this.setVisible(false);

         ArrayList<Media> list = controller.getAllEntries();
         GUIPrintResult p = new GUIPrintResult(list, this);
         printInfo.addActionListener(p);
         p.setVisible(true);
      }

      // Shows the window for retrieving information
      if (evt.getSource() == retrieveInfo)
      {
         this.setVisible(false);
         GUIRetrieve r = new GUIRetrieve(this);
         retrieveInfo.addActionListener(r);
         r.setVisible(true);
      }

      // Shows the window for deleting information
      else if (evt.getSource() == deleteInfo)
      {
         this.setVisible(false);
         GUIDelete d = new GUIDelete(this);
         deleteInfo.addActionListener(d);
         d.setVisible(true);
      }

   }
}
