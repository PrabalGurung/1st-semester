/*
 * Week 7 Assignment
 * Question 6
 * Program to print unique element from the given array
 */
//main method start
public class QSix
{
  public static void main (String[] args){
      QSix object = new QSix();
      int [] array = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
      int [] unique = new int [20];//integer to store unique element
      object.uni(array, unique);
  }
  
  public void uni(int [] array, int [] unique){
      int index = 0;
      for (int i = 0; i < array.length; i++) //loop to take element one by one from the left-side     
        {   
         int flag = 0;  
         for (int j = 0; j < i; j++)//loop to compare between elements
         {  
         if (array[i] == array[j])//checks whether following elements are same
         {   
                    flag = 1;  
                    break;   
                }  
         }  
         if (flag == 0)//stores element if unique
         {   
                unique[index] = array[i];  
                index++; 
         }  
        }  
      for(int i = 0; i < index; i++)  //prints unique number
      {
            System.out.println( unique[i]);
      }
  }
}
