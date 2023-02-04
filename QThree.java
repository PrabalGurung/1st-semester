/*
 * Week 7 Assignment
 * Question 3
 * Program to print each element from array
 */
public class QThree
{
    public static void main(String [] args)
    {
        QThree object = new QThree();
        int [] [] a = {{1,2,3},{4,5,6,9},{7}};
        object.printEach(a);
    }
    
    public void printEach(int a [] []) 
    {
        for (int i = 0; i < a.length; i++) //loop to count row
        {
            for (int j = 0; j < a[i].length; j++) //loop to count column
            {
                System.out.print(a [i] [j]);
            }
            System.out.println();
        }
    }
}
