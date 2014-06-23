/**
 * A GUI application that displays the window for choosing a type to add and 
 * interacts with the user via Buttons and ActionListener interface.
 * @author Z.R.
 */
import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.BorderFactory;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;

public class GUIAdd extends JFrame implements ActionListener
{
   private JButton addBook, addSong, addVideo, addGame;
   private JButton cancel;
   private JPanel p1, p2, p3;

   private PersonalLibraryController controller;
   private GUIMenu menuView;

   /**
    * Sets the initial GUI for for choosing a type to add
    */
   private void initialize()
   {

      // Create the panels for the buttons and set GridLayout
      p1 = new JPanel();
      p2 = new JPanel();
      p3 = new JPanel();
      this.setLayout(new GridLayout(4, 2, 10, 5));

      // Creates a button for adding a book
      addBook = new JButton("Book");
      this.add(addBook);
      addBook.addActionListener(this);

      // Creates a button for adding a song
      addSong = new JButton("Song");
      this.add(addSong);
      addSong.addActionListener(this);

      // Creates a button for adding a video
      addVideo = new JButton("Video");
      this.add(addVideo);
      addVideo.addActionListener(this);

      // Creates a button for adding a video game
      addGame = new JButton("Video Game");
      this.add(addGame);
      addGame.addActionListener(this);

      // Creats a button for going back to the main menu
      cancel = new JButton("Cancel");
      this.add(cancel);
      cancel.addActionListener(this);

      // Adds button to the panel and locates the panels
      p1.add(addBook);
      p1.add(addSong);
      p2.add(addVideo);
      p2.add(addGame);
      p3.add(cancel);
      add(new JLabel("   Please choose a media type"), BorderLayout.NORTH);
      add(p1, BorderLayout.WEST);
      add(p2, BorderLayout.EAST);
      add(p3, BorderLayout.SOUTH);

   }

   /**
    * Shows the initial GUI for this window
    */
   public GUIAdd(PersonalLibraryController controller, GUIMenu menu)
   {
      this.initialize();

      this.controller = controller;
      this.menuView = menu;

      this.setSize(300, 250);
      setTitle("Add a New Entry");
      this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      // this.setVisible(false);

   }

   /**
    * Connects to the subwindows for adding the different types of media
    */
   public void actionPerformed(ActionEvent evt)
   {

      // Shows the window for adding a book
      if (evt.getSource() == addBook)
      {
         this.setVisible(false);
         GUIAddBook addbk = new GUIAddBook(this, this.controller, this.menuView);
         addBook.addActionListener(addbk);
         addbk.setVisible(true);
      }

      // Shows the window for adding a song
      else if (evt.getSource() == addSong)
      {
         this.setVisible(false);
         GUIAddSong addsg = new GUIAddSong(this, this.controller, this.menuView);
         addSong.addActionListener(addsg);
         addsg.setVisible(true);
      }

      // Shows the window for adding a video
      else if (evt.getSource() == addVideo)
      {
         this.setVisible(false);
         GUIAddVideo addvd = new GUIAddVideo(this, this.controller,
               this.menuView);
         addVideo.addActionListener(addvd);
         addvd.setVisible(true);
      }

      // Shows the window for adding a video game
      else if (evt.getSource() == addGame)
      {
         this.setVisible(false);
         GUIAddVideoGame addvg = new GUIAddVideoGame(this, this.controller,
               this.menuView);
         addGame.addActionListener(addvg);
         addvg.setVisible(true);
      }

      // Goes back to the main menu after clicking on "cancel" button
      else //if (evt.getSource() == cancel)
      {
         this.setVisible(false);
         menuView.setVisible(true);
      }

   }
}
