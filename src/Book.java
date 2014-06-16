import java.io.Serializable;

/**
 * One object of class Book stores the information of one type of media which is
 * a book
 * 
 * @author M.A.
 */
public class Book extends Media implements Serializable
{
   /**
    * getter and setter for the author of a book
    */
   private String author;

   // Sets the value of author to "newAuthor"
   public void setAuthor(String newAuthor)
   {
      this.author = newAuthor;
   }

   // Returns the current value of author
   public String getAuthor()
   {
      return author;
   }

   /**
    * default constructor for Book class object which assigns default values for
    * all class properties
    */
   public Book()
   {
      this.setTitle("title_null");
      this.setFormat("format_null");
      this.setLocation("local_null");
      this.setNotes("notes_null");
      this.setAuthor("author_null");

   }

   /**
    * parameterized constructor for Book class object which assigns values for
    * all class properties based on the values sent into the parameters.
    */
   public Book(String title, String author, String format, String location,
         String notes)
   {
      this.setTitle(title);
      this.setFormat(author);
      this.setLocation(format);
      this.setNotes(location);
      this.setAuthor(notes);
   }

   /**
    * Returns a String containing all the data stored in this object.
    */
   public String toString()
   {
      String result = "\nBook Title: " + this.getTitle() + "\nAuthor: "
            + this.getAuthor() + "\nFormat: " + this.getFormat()
            + "\nLocation: " + this.getLocation() + "\nNotes: "
            + this.getNotes() + "\n\n";
      return result;
   }

}
