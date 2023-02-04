public class CopyOfQ6
{
  public static void main (String[] args){
      CopyOfQ6 object = new CopyOfQ6();
      int [] array = {1, 2, 3, 4, 5, 6, 5, 4, 3, 2, 1};
      int [] unique = new int [20];
      object.uni(array, unique);
  }
  
  public void uni(int [] array, int [] unique){
      int index = 0;
      for (int i = 0; i < array.length; i++)   
        {   
         for (int j = 0; j < i; j++)
         {  
         if (array[i] == array[j])
         {     
             break;   
             }else{   
             unique[index] = array[i];  
             index++; 
         }  
        }  
      for(int k = 0; i < index; i++)  
            System.out.println( unique[i]);   
      }
  }
}
