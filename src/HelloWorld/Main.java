package HelloWorld;
import java.util.Scanner;

public class Main {
	public static void main(String[] args)
	{
	      Scanner scnr = new Scanner(System.in);
	      
	      boolean[] chptList = new boolean[16]; // Valid chapters are 1-15. 1 means include, 0 exclude. Element 0 unused. 
	      int includeChpt;
	      int i, j;
	      
	      // Get the chapter selections
	      for (i = 1; i <= 15; ++i) {
	         includeChpt = scnr.nextInt(); 
	         if (includeChpt==1) {
	            chptList[i] = true;
	         }
	         else {
	            chptList[i] = false;
	         }
	      }
	      
	      i = 1;
	      while (i <= 15) {
	         if (chptList[i]) {
	            System.out.print(i);
	            j = i;
	            try
	            {
	               while (chptList[j] && j <= 15)
	               {
	                  j += 1;
	               }
	            }
	            catch (ArrayIndexOutOfBoundsException e)
	            {
	               j = j;
	            }
	            if (j - i >= 3)
	            {
	               System.out.print("-"+(j-1));
	               i = j-1;
	            }
	            else if (i!=(j-1))
	            {
	               System.out.print(" "+(j-1));
	               i = j-1;
	            }
	            System.out.print(" ");
	         }
	         i = i + 1;
	      }
	      boolean any = false;
	      for (i = 1; i <= 15; i++)
	      {
	         any = any || chptList[i];
	      }
	      if (!(any))
	      {
	         System.out.println("None ");
	      }
	      else
	      {
	         System.out.println();
	      }
	}
}
