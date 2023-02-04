
/**
 * Write a description of class Subtraction here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class Subtraction
{
    public static void main(String[] args)
    {
        int a=4;
        int b=4;
        System.out.println("Subtraction is= "+(a-b));
        System.out.println("Subtraction is= "+(b-a));
        Subtraction object= new Subtraction();
        object.subtract(a,b);
    }
    
        public void subtract(int a, int b)
        {
            System.out.println("Subtraction of given number is= "+(a-b));
        }
    
}

