
/**
 * Write a description of class SwapNumberWithoutVariable here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class SwapNumberWithoutVariable
{
public static void main(String[] args)
    {
        int a=-6;
        int b=11;
        
        a=a+b;
        b=a-b;
        a=a-b;
        
        System.out.println("Swapped value of a is "+a);
        System.out.println("Swapped value of b is "+b);
    }
}
