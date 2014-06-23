/**
 * Works as Models.
 * One object of this class represents a media libray. In this class, related method adds new entries, sorts the results of printing, 
 * retrieves the library by the title, type or both,
 * and Saves a whole new copy of the library.
 * @author Yp.Y
 */
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.io.ObjectInputStream;
import java.io.ObjectOutputStream;
import java.io.Serializable;
import java.util.ArrayList;

public class PersonalLibraryModel implements Serializable
{
   private ArrayList<Media> list;

   /**
    * default constructor
    */
   public PersonalLibraryModel()
   {
      list = new ArrayList<Media>();
   }

   /**
    * Creates a new array list to store objects
    */
   public ArrayList<Media> getList()
   {
      return this.list;
   }

   /**
    * Adds an object of media to the list
    */
   public void addToLibrary(Media m)
   {
      list.add(m);
   }

   public void writeToLibrary()
   {
      FileOutputStream outFile;
      ObjectOutputStream outObject;
      try
      {
         outFile = new FileOutputStream("data");
         outObject = new ObjectOutputStream(outFile);
         outObject.writeObject(this);
         outFile.close();
         outObject.close();
      } catch (IOException ioe)
      {
         System.out.println("Error writing objects to the file: "
               + ioe.getMessage());
      }
   }

   public static PersonalLibraryModel readFromLibrary()
   {
      FileInputStream inFile;
      ObjectInputStream inObject;
      PersonalLibraryModel model = null;
      try
      {
         inFile = new FileInputStream("data");
         inObject = new ObjectInputStream(inFile);
         model = (PersonalLibraryModel) inObject.readObject();
         inFile.close();
         inObject.close();
      } catch (IOException ioe)
      {
         System.out.println("Error reading objects from the file: "
               + ioe.getMessage());
      } catch (ClassNotFoundException cnfe)
      {
         System.out.println("Error in casting to the list " + cnfe);
      }
      return model;

   }

   /**
    * Sorts the results for printing
    */
   public void sort(ArrayList<Media> list)
   {
      System.out.println("sort() reached.");
   }

   /**
    * Returns a toString which includes all of the information
    */
   public String toString()
   {
      return list.toString();
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
      list.remove(index);
      this.writeToLibrary();
   }

}
