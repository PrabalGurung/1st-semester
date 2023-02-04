/*
 * Week 7 Assignment
 * Question o1
 * Program to store numbers from 1 to 100
 * 
 */
public class QOne
{
    public static void main (String[] args)
    {
        QOne object = new QOne();
        int [] number = new int [100];
        object.storeEach(number);
    }
    
    public void storeEach(int [] number)
    {
        for (int i=0; i < number.length; i++)
        {
            number [i] = i + 1;
        }
    }
}

