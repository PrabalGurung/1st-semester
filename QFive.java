/*
 * Week 7 Assignment
 * Question 5
 * Program to print given pattern
 */
public class QFive
{
     public static void main (String[] args)
     {
       QFive object = new QFive();
       int [] [] number = {{1,2},{3,4}};
       object.printEach(number);
     }
   
     public void printEach(int number [] [])
     {
       for (int i = 0; i < number.length; i++) //loop to count row
       {
           for (int j = 0; j < number[i].length; j++) // loop to count column
           {
               System.out.print(number[i][j] + " ");
           }
           System.out.println();
       }
     }
}
