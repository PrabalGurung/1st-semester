/*
 * Week 7 Assignment
 * Question 4
 * Program to count even and odd numbers separately in given array
 */
public class QFour
{
      public static void main (String[] args)
      {
         QFour object = new QFour();
         int [] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
         int [] newNumber = new int [numbers.length]; //resolving unique number
         int index = 0;
          for (int i = 0; i < numbers.length; i++) //loop to take element one by one from the left-side     
          {   
           int flag = 0;  
             for (int j = 0; j < i; j++)//loop to compare between elements
             {  
               if (numbers[i] == numbers[j])//checks whether following elements are same
               {   
                 flag = 1;  
                 break;   
               }  
             }  
             if (flag == 0)//stores element if unique
             {   
                 newNumber[index] = numbers[i];  
                 index++; 
             }  
            }  
         int [] unique = new int [index]; //making new variable for storing unique value only
         for (int i = 0; i < index; i++)  //loop for inserting number given by question only
         {
           unique[i] = newNumber[i];
         }
         object.oe(unique);
      }
        
     
      public void oe(int [] unique)
      {
          int countEven = 0;
          int countOdd = 0;
         for (int i = 0; i < unique.length; i++) //loop to count 1D array
         {
           if (unique[i] % 2 == 0)
           {
               countEven++;
           }else{
               countOdd++;
           }
         }
         System.out.println("Even number: " + countEven + " Odd number: " + countOdd);
      }
}
