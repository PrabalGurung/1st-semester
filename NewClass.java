
/**
 * Write a description of class NewClass here.
 *
 * @author (your name)
 * @version (a version number or a date)
 */
public class NewClass
{
    public static void main(String[] args){ //attribute
        Calculation calculate = new Calculation();
        calculate.numberOne = 1;
        calculate.numberTwo = 2;
        int addition = calculate.add();
        int subtraction = calculate.subtract();
        calculate.display(addition);
        calculate.display(subtraction);
    }
}
