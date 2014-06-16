import java.io.Serializable;

/**
 * One object of class Video stores the information of one type of media which
 * is a video.
 * @author M.A.
 */
public class Video extends Media implements Serializable
{

   /**
    * getter and setter for the star of a book
    */
   private String star;

   // Sets the value of author to "newStar"
   public void setStar(String newStar)
   {
      this.star = newStar;
   }

   // Returns the current value of author
   public String getStar()
   {
      return star;
   }

   /**
    * default constructor for Video class object which assigns default values
    * for all class properties
    */
   public Video()
   {
      this.setTitle("title_null");
      this.setFormat("format_null");
      this.setLocation("loca_null");
      this.setNotes("notes_null");
      this.setStar("star_null");
   }

   /**
    * parameterized constructor for Video class object which assigns values for
    * all class properties based on the values sent into the parameters.
    */
   public Video(String title, String star, String format, String location,
         String notes)
   {   
      this.setTitle(title);
      this.setStar(star);
      this.setFormat(format);
      this.setLocation(location);
      this.setNotes(notes);
      
   }

   /**
    * Returns a String containing all the data stored in this object.
    */
   public String toString()
   {
      String result = "\nVideo Title: " + this.getTitle() + "\nStar:"
            + this.getStar() + "\nFormat: " + this.getFormat() + "\nLocation: "
            + this.getLocation() + "\nNotes: " + this.getNotes() + "\n\n";
      return result;
   }
}
