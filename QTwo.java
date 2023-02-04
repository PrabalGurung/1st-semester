/*
 * Week 7 Assignment
 * Question 2
 * Program to compute sum and average of the array elements
 */
public class QTwo
{
public static void main()
{
    QTwo object = new QTwo();
    int[] numbers = {2, -9, 0, 5, 12, -25, 22, 9, 8, 12};
    float sum = object.arraySum(numbers);
    float average = object.average(numbers, sum);
    System.out.println(sum + ", " + average);
}

public float arraySum(int[] numbers) //this method calculates sum
{
    float sum = 0;
    for (int i=0; i < numbers.length; i++)
    {
        sum = sum + numbers[i];
    }
    return sum;
}

public static float average(int[] numbers, float sum) //this method calculates average
{
    float average = sum/numbers.length;
    return average;
}
}
