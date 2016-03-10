/**
 *
 * @author Rachel
 */
//imports
import java.util.Scanner;
public class ReorganizingNumbers {
    public static void main(String[] args) {
        //variables
        Scanner keyboard = new Scanner(System.in);
        int size = 0;
        int [] numberArray;
        
        //get the size first for creating the array
        System.out.print("Enter how many numbers to re-organize: ");
        size = keyboard.nextInt();
        
        //create array
        numberArray = new int [size];
        
        //get all the user input
        for(int i = 0; i < numberArray.length; i++)
        {
            System.out.printf("Enter number %d: ", i);
            numberArray[i] = keyboard.nextInt();
        }
        
        //use sort routine
        sort(numberArray);
        
        //print the numbers out
        for(int i = 0; i < numberArray.length; i++)
        {
            System.out.printf("%d ",numberArray[i]);
        }
    }
    
    public static void sort(int[] array)
    {
      boolean swapped = true;
      int j = 0;
      int tmp;
      while (swapped) {
            swapped = false;
            j++;
            for (int i = 0; i < array.length - j; i++) {                                       
                  if (array[i] > array[i + 1]) {                          
                        tmp = array[i];
                        array[i] = array[i + 1];
                        array[i + 1] = tmp;
                        swapped = true;
                  }
            }                
      }
    }
    
}
