/* Bubbles example program for CS 111B
   Adapted by Craig Persiko from a program by Steve Vaschon
   
   Shows the difference between static variables/methods 
   and instance variables/methods.

   The static count variable is printed out at the
   beginning and at the end of the program,
   displaying the total number of objects created.
*/

import java.util.Scanner;

class Main
{
  public static void main(String args[])
  {
    Scanner scan = new Scanner (System.in);
    int num;
    Bubble[] myBubbles; // ready to store array of Bubble objects

    System.out.println("We are starting with " + Bubble.getCount() + " bubbles.");

    System.out.print("Enter the number of bubbles: ");
    num = scan.nextInt();

    myBubbles = Bubble.makeBubbles(num);

    System.out.println("\nNow we have " + Bubble.getCount() + " bubbles.");
    System.out.println("At index 0, you find bubble number " 
                       + myBubbles[0].getBubbleNo());
    
    if(myBubbles.length > 4) // if element number 4 exists:
    {
      System.out.println("Comparing the bubbles at indexes 2 and 4:");
      if (myBubbles[2].compareTo(myBubbles[4]) < 0)
        System.out.println("We find that they are in order.");
      else
        System.out.println("The bubbles are out of order or duplicated.");
    }
  }
}

/* Sample Output:

We are starting with 0 bubbles.
Enter the number of bubbles: 5
Blowing bubbles...
I am bubble number 1
I am bubble number 2
I am bubble number 3
I am bubble number 4
I am bubble number 5

Now we have 5 bubbles.
At index 0, you find bubble number 1
Comparing the bubbles at indexes 2 and 4:
We find that they are in order.


We are starting with 0 bubbles.
Enter the number of bubbles: 3
Blowing bubbles...
I am bubble number 1
I am bubble number 2
I am bubble number 3

Now we have 3 bubbles.
At index 0, you find bubble number 1


We are starting with 0 bubbles.
Enter the number of bubbles: 0
Blowing bubbles...

Now we have 0 bubbles.
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 0 out of bounds for length 0
    at Main.main(Main.java:30)
exit status 1

*/
