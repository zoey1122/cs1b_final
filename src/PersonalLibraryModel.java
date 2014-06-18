/**
 * Works as Models.
 * One object of this class represents a media libray. In this class, related method adds new entries, sorts the results of printing, 
 * retrieves the library by the title, type or both,
 * and Saves a whole new copy of the library.
 * @author Yp.Y
 */
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectOutputStream;
import java.util.ArrayList;

public class PersonalLibraryModel
{
   /**
    * Creates a new array list to store objects
    */
   private ArrayList<Media> list = new ArrayList<Media>();

   /**
    * Adds an object of media to the list
    */
   public void addToLibrary(Media m)
   {

      list.add(m);
      FileOutputStream outFile;
      ObjectOutputStream outObject;
      try
      {
         outFile = new FileOutputStream("data");
         outObject = new ObjectOutputStream(outFile);
         outObject.writeObject(list);
         outFile.close();
         outObject.close();
      } catch (IOException ioe)
      {
         System.out.println("Error writing objects to the file: "
               + ioe.getMessage());
      }

   }

   /**
    * Sorts the results for printing
    */
   public void sort()
   {
      System.out.println("sort() reached.");
      //return new ArrayList<Media>();
   }

   /**
    * Returns a toString which includes all of the information
    */
   public String toString()
   {
      
      return null;
   }

   /**
    * Retrieves by title
    */
   public ArrayList<Media> retrieveByTitle(String title)
   {
      System.out.println("retrieveByTitle() reached.");
      return new ArrayList<Media>();
   }

   /**
    * Retrieves by title
    */
   public ArrayList<Media> retrieveByType(String type)
   {
      System.out.println("retrieveByType() reached.");
      return new ArrayList<Media>();

   }

   /**
    * Deletes an entry
    */
   public void delete(int index)
   {
      System.out.println("delete() reached.");
   }

}
