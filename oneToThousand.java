
public class oneToThousand
{
   public static void main (String[] args){
       int i = 10;
       for( int w = 20; w >= 0; w = w - 2){
           System.out.println(2 + " X " + (i--) + " = " + (w));
       }
   }
}

