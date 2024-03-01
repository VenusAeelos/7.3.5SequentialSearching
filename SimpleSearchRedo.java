/*
 * Activity 3.7.5
 */
public class SimpleSearchRedo
{
  public static void main(String[] args)
  {
    int[] primeUnder50 = {3, 5, 7, 11, 13, 17, 19, 23, 29, 31, 37, 41, 43, 47};
    int numToSearchFor = UserInput.getInt();
    
    /* your code goes here */
    //for each loop
    int ind = 0;
    for (int n:primeUnder50)
    {
        if(n == numToSearchFor)
        {
            System.out.println(numToSearchFor + " was found at index " + ind);
        }
        ind++;
    }

    int index = 0;
    while(index < primeUnder50.length)
    {
        if (primeUnder50[index] == numToSearchFor)
        {
            System.out.println(numToSearchFor + " was found at index " + index);
        }
        index++;
    }
    
    
  }
}