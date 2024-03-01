/*
 * Activity 3.7.5
 */
import java.util.ArrayList;

public class LibraryRunner
{
  public static void main(String[] arg)
  {
    Library library = new Library();
    ArrayList<Book> childrensBooks = new ArrayList<Book>();
    childrensBooks.addAll(library.getChildrensBooks());

    //finds the specified author
    String authorToFind = "L. Frank Baum";

    for (int i = 0; i < childrensBooks.size(); i++)
    {
        if(childrensBooks.get(i).getAuthor().equals(authorToFind))
        {
            System.out.println(childrensBooks.get(i).getTitle());
        }
    }

    //gets a list of the books and authors with a rating of at least that of sky island
    String bookToFind = "Sky Island";
    double minimumRating = 0.0;

    for (Book b:childrensBooks)
    {
        if(b.getTitle().equals(bookToFind))
        {
            minimumRating = b.getRating();
        }
    }
    System.out.println("The rating of Sky Island is " + minimumRating);

    for (Book b:childrensBooks)
    {
        if(b.getRating() >= minimumRating)
        {
            System.out.println(b.getTitle());
        }
    }


    
  }
}
