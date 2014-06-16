import java.io.Serializable;

/**
 * One object of class Media stores the information for one type of media.
 * 
 * @author Z.R.
 */
public class Media implements Comparable<Media>, Serializable
{
   /**
    * getter and setter for the title of one object
    */
   private String title;

   // Sets the value of title to "newTitle"
   public void setTitle(String newTitle)
   {
      this.title = newTitle;
   }

   // Returns the current value of title
   public String getTitle()
   {
      return title;
   }

   /**
    * getter and setter for the format of one object
    */
   private String format;

   // Sets the value of format to "newFormat"
   public void setFormat(String newFormat)
   {
      this.format = newFormat;
   }

   // Returns the current value of format
   public String getFormat()
   {
      return format;
   }

   /**
    * getter and setter for the location of one object
    */
   private String location;

   // Sets the value of location to "newLocation"
   public void setLocation(String newLocation)
   {
      this.location = newLocation;
   }

   // Returns the current value of location
   public String getLocation()
   {
      return location;
   }

   /**
    * getter and setter for the notes of one object
    */
   private String notes;

   // Sets the value of note to "newNotes"
   public void setNotes(String newNotes)
   {
      this.notes = newNotes;
   }

   // Returns the current value of notes
   public String getNotes()
   {
      return notes;
   }

   /**
    * Counter methods for ID of each object
    */
   private static int counter = 0;

   // Returns the current value of notes
   public int getCounter()
   {
      return counter;
   }

   /**
    * default constructor for Media class object which assigns default values
    * for all class properties
    */
   public Media()
   {
      this.setTitle("title_null");
      this.setFormat("format_null");
      this.setLocation("local_null");
      this.setNotes("notes_null");

   }

   /**
    * parameterized constructor for Media class object which assigns values for
    * all class properties based on the values sent into the parameters.
    */
   public Media(String title, String format, String location, String notes)
   {
      this.setTitle(title);
      this.setFormat(format);
      this.setLocation(location);
      this.setNotes(notes);
      counter++;
   }

   /**
    * Returns a String containing all the data stored in this object.
    */
   public String toString()
   {
      String result = "\nTitle: " + this.getTitle() + "\nFormat: "
            + this.getFormat() + "\nLocation: " + this.getLocation()
            + "\nNotes: " + this.getNotes() + "\n\n";
      return result;
   }

   /**
    * Compares two media objects and returns a number
    */
   public int compareTo(Media arg0)
   {
      return 0;
   }

}
