/* Bubble.java example for CS 111B
   Adapted by Craig Persiko from a program by Steve Vaschon (a former student)

   Shows the difference between static
   variables and instance variables.  Below is a static
   variable called count and an instance variable called
   bubbleNo.  Although a bubbleNo variable will be created
   with each object there will only be one count variable
   for all objects keeping count of each bubble created.
*/

public class Bubble
{
  private static int count=0;
  // count is the overall number of Bubbles,
  // so it is static, and starts at 0.
  // But its value will be changed each time
  // the constructor is called.
  
  private final int bubbleNo;
  // bubbleNo is unique for each Bubble

  // Constructor: increase the count, and
  // give this Bubble its unique number.
  public Bubble()
  {
    count++;
    bubbleNo = count;
  }

  // Accessor for a Bubble's number
  public int getBubbleNo()
  {
    return bubbleNo;
  }

  // Text for a Bubble
  public String toString()
  {
    return "I am bubble number " + getBubbleNo();
  }

  // Standard Java compareTo method that 
  // can be used to sort Bubbles: returns -1 if this 
  // Bubble's value is lower than the other Bubble 
  // it's being compared to, or 1 if the opposite is true. 
  // (0 if equal.)
  public int compareTo(Bubble otherBubble)
  {
    if (bubbleNo < otherBubble.bubbleNo)
      return -1;
    else if (bubbleNo == otherBubble.bubbleNo)
      return 0;
    else
      return 1;
  }

  // Above are instance methods
  // Below are static methods

  // Blow a bunch of Bubbles, returning them in an array
  public static Bubble[] makeBubbles(int howMany)
  {
    Bubble[] a = new Bubble[howMany];
    // allocate the array of references (no Bubbles yet)

    System.out.println("Blowing bubbles...");
    for(int i=0; i < howMany; i++)
    { 
      // blow a Bubble (instantiate an object):
      a[i] = new Bubble();
      System.out.println(a[i]);
    }
    return a;
  }
  
  // Accessor for the overall count of Bubbles
  public static int getCount()
  {
    return count;
  }
}
