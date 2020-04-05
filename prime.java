
/**
 * Write a description of class prime here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class prime
{
    // instance variables - replace the example below with your 

    /**
     * Constructor for objects of class prime
     */
    public static void main(String args[]) {
     
        prime_num(5);
        // initialise instance variables
       
    }

    /**
     * An example of a method - replace this comment with your own
     *
     * @param  y  a sample parameter for a method
     * @return    the sum of x and y
     */
    public static void prime_num(int y)
    {
        // put your code here
        int i,s=0;
        for(i=1;i<=y;i++)
        {
            if((y%i)==0)
            {
                s++;
            }
        }
        if(s==2)
        {
            System.out.println("number is prime");
        }
        else
        {
            System.out.println("number is not prime");
        }
        
    }
}
