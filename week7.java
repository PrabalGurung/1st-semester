
/**
 * Write a description of class week6 here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class week7
{
    public static void main(String [] args){
        // week7 object = new week7();
        // int addition = object.add(1, 2);
        // int subtraction = object.sub(1, 5);
        // System.out.println(subtraction + addition);
        // System.out.println("Subtraction" + subtraction + ", Addition" + addition);
        week7 object = new week7();
        int[] array = {3,5,7,9,0};
        object.printEach(array);
        
        
    }
    
    
    public void printEach(int array[]){
        for(int i=0; i < array.length; i++){
            System.out.println(array[i]);
        }
    }
        
    
    // public int add(int a, int b){
        // int addition = a + b;
        // return addition;
    // }
    
    // public int sub(int a, int b){
        // int subtract = a - b;
        // return subtract;
    // }

    
}
