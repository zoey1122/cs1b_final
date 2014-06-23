/**
 * A GUI application that prints every entry in the Personal Library and 
 * interacts with the user via Buttons and ActionListener interface.
 * @author Z.R. & M.A.
 */
import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
import java.util.Collections;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;

public class GUIPrintResult extends JFrame implements ActionListener
{

   private JButton cancel;
   private JTextArea printArea;
   private JPanel p1, p2;
   private ArrayList<Media> personalLibraryList;
   
   // private GUIAdd parentView;
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
      printArea = new JTextArea();
      printArea.setEditable(false);
      this.add(printArea);
      JScrollPane sp = new JScrollPane();
      sp.setViewportView(printArea);

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
    * Shows the initial GUI for window
    */
   public GUIPrintResult(ArrayList<Media> list, GUIMenu menu)
   {
      this.initialize();
      this.menuView = menu;

      String result = "";
      for (int i = 0; i < list.size(); i++)
      {
         int id = i + 1;
         result = result + "ID number: ¡¾ " + id + " ¡¿"+ list.get(i).toString();
      }
      printArea.append(result);
      System.out.println(result);
      
      
//      Collections.sort(personalLibraryList, Media.COMPARE_BY_TITLE);
//      Collections.sort(personalLibraryList, Media.COMPARE_BY_TYPE);

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
         menuView.setVisible(true);
      }
   }
}
