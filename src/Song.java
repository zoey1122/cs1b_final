import java.io.Serializable;

/**
 * One object of class Song stores the information of one type of media which is
 * a song.
 * 
 * @author M.A.
 */
public class Song extends Media implements Serializable
{

   /**
    * getter and setter for the artist of a song
    */
   private String artist;

   // Sets the value of artist to "newArtist"
   public void setArtist(String newArtist)
   {
      this.artist = newArtist;
   }

   // Returns the current value of artist
   public String getArtist()
   {
      return artist;
   }

   /**
    * getter and setter for the genre of a song
    */
   private String genre;

   // Sets the value of genre to "newGenre"
   public void setGenre(String newGenre)
   {
      this.genre = newGenre;
   }

   // Returns the current value of genre
   public String getGenre()
   {
      return genre;
   }

   /**
    * default constructor for Song class object which assigns default values for
    * all class properties
    */
   public Song()
   {
      this.setTitle("title_null");
      this.setFormat("format_null");
      this.setLocation("loca_null");
      this.setNotes("notes_null");
      this.setArtist("artist_null");
      this.setGenre("genre_null");
   }

   /**
    * parameterized constructor for Song class object which assigns values for
    * all class properties based on the values sent into the parameters.
    */
   public Song(String title, String artist, String genre, String format,
         String location, String notes)
   {
      this.setTitle(title);
      this.setArtist(artist);
      this.setGenre(genre);
      this.setFormat(format);
      this.setLocation(location);
      this.setNotes(notes);
   }

   /**
    * Returns a String containing all the data stored in this object.
    */
   public String toString()
   {
      String result = "\nSong Title: " + this.getTitle() + "\nArtist: "
            + this.getArtist() + "\nGenre: " + this.getGenre() + "\nFormat:"
            + this.getFormat() + "\nLocation: " + this.getLocation()
            + "\nNotes: " + this.getNotes() + "\n\n";
      return result;
   }
}
