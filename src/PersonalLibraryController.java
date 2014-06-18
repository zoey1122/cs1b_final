import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

/**
 * This class works as the Controller including a reference to both the Model
 * and the View. This class contains the main() method, which creates one object
 * of each other classes and calls every method on each object created.
 * 
 * @author Yp.Y
 * @edited by M.A.
 */

import java.util.ArrayList;

public class PersonalLibraryController
{
   public static void main(String args[])
   {
      PersonalLibraryModel model = new PersonalLibraryModel();
      GUIMenu g = new GUIMenu();
   }
 
      

   /**
    * Add all of the media information to the list
    */
   public void addMediaInfo(String title, String format, String location,
         String notes)
   {
      Media m = new Media();
      m.setTitle(title);
      m.setFormat(format);
      m.setLocation(location);
      m.setNotes(notes);
   }

   /**
    * Add all of the book information to the list
    */
   public void addBookInfo(String title, String author, String format,
         String location, String notes)
   {
      Book bk = new Book();
      bk.setTitle(title);
      bk.setAuthor(author);
      bk.setFormat(format);
      bk.setLocation(location);
      bk.setNotes(notes);
      PersonalLibraryModel model = new PersonalLibraryModel();
      model.addToLibrary(bk);
   }

   /**
    * Add all of the song information to the list
    */
   public void addSongInfo(String title, String artist, String genre,
         String format, String location, String notes)
   {
      Song sg = new Song();
      sg.setTitle(title);
      sg.setArtist(artist);
      sg.setGenre(genre);
      sg.setFormat(format);
      sg.setLocation(location);
      sg.setNotes(notes);
      PersonalLibraryModel model = new PersonalLibraryModel();
      model.addToLibrary(sg);
   }

   /**
    * Add all of the video information to the list
    */
   public void addVideoInfo(String title, String star, String format,
         String location, String notes)
   {
      Video vo = new Video();
      vo.setTitle(title);
      vo.setStar(star);
      vo.setFormat(format);
      vo.setLocation(location);
      vo.setNotes(notes);
      PersonalLibraryModel model = new PersonalLibraryModel();
      model.addToLibrary(vo);
   }

   public void addVideoGameInfo(String title, String format, String location,
         String notes)
   {
      VideoGame vg = new VideoGame();
      vg.setTitle(title);
      vg.setFormat(format);
      vg.setLocation(location);
      vg.setNotes(notes);
      PersonalLibraryModel model = new PersonalLibraryModel();
      model.addToLibrary(vg);
   }

   /**
    * Listen to the GUI classes to make any change to personal library and
    * communicates the data that it reads here to the Controller
    */
   public void actionPerformed(ActionEvent evt)
   {

   }
}

// -----------------------SAMPLE RUN-----------------//

/*
[
Book Title: book1
Author: 
Format: 
Location: 
Notes: 

, 
Song Title: song1
Artist: 
Genre: 
Format:
Location: 
Notes: 

, 
Video Title: video1
Star:
Format: 
Location: 
Notes: 

, 
Book Title: book2
Author: 
Format: 
Location: 
Notes: 

]
 */
// -----------------------SAMPLE RUN-----------------//
