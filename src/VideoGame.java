import java.io.Serializable;

/**
 * One object of class VideoGame stores the information of one type of media
 * which is a video game.
 * @author M.A.
 */
public class VideoGame extends Media implements Serializable
{

   /**
    * default constructor for VideoGame class object which assigns default
    * values for all class properties
    */
   public VideoGame()
   {
      this.setTitle("title_null");
      this.setFormat("format_null");
      this.setLocation("loca_null");
      this.setNotes("notes_null");
   }

   /**
    * parameterized constructor for VideoGame class object which assigns values
    * for all class properties based on the values sent into the parameters.
    */
   public VideoGame(String title, String format, String location, String notes)
   {
      this.setTitle(title);
      this.setFormat(format);
      this.setLocation(location);
      this.setNotes(notes);
   }

   /**
    * Returns a String containing all the data stored in this object.
    */
   public String toString()
   {
      String result = "\nGame Title: " + this.getTitle() + "\nFormat: "
            + this.getFormat() + "\nLocation: " + this.getLocation()
            + "\nNotes: " + this.getNotes() + "\n\n";
      return result;
   }
}
