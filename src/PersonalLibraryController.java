/**
 * This class works as the Controller including a reference to both the Model
 * and the View and contains the main() method.
 * 
 * @author Yp.Y
 * @edited by M.A.
 */
import java.util.ArrayList;

public class PersonalLibraryController
{
   /**
    * Constructor for controller
    */
   public PersonalLibraryController()
   {
      GUIMenu g = new GUIMenu(this);
      model = PersonalLibraryModel.readFromLibrary();
      if (model == null)
         model = new PersonalLibraryModel();
   }

   private PersonalLibraryModel model;

   /**
    * One object of this class represents the
    */
   public static void main(String args[])
   {
      PersonalLibraryController controller = new PersonalLibraryController();
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
      model.addToLibrary(bk);
      model.writeToLibrary();
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
      model.addToLibrary(sg);
      model.writeToLibrary();
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
      model.addToLibrary(vo);
      model.writeToLibrary();
   }

   public void addVideoGameInfo(String title, String format, String location,
         String notes)
   {
      VideoGame vg = new VideoGame();
      vg.setTitle(title);
      vg.setFormat(format);
      vg.setLocation(location);
      vg.setNotes(notes);
      model.addToLibrary(vg);
      model.writeToLibrary();
   }

   public void deleteEntries(int index)
   {
      model.delete(index);
   }

   public ArrayList<Media> getAllEntries()
   {
      return model.getList();
   }
}

// -----------------------SAMPLE RUN-----------------//

// -----------------------SAMPLE RUN-----------------//
