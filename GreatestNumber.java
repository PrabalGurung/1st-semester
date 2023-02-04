
/**
 * This program helps to find greatest number.
 */

class GreatestNumber {
 public static void main(String args[]) {
 int num1 = 30;
 int num2 = 40;
 int num3 = 20;
 if (num1 > num2 && num1 > num3) {
 // Prints num1 since num1 is greater than both num2 & num3
 System.out.println("Greatest number is " + num1);
 } else if (num2 > num1 && num2 > num3) {
 // Prints num2 since num2 is greater than both num1 & num3
 System.out.println("Greatest number is " + num2);
 } else if(num3 > num1 && num3 > num2) {
 // Prints num3 since num2 is greater than both num1 & num2
 System.out.println("Greatest number is " + num3);
 }
 }
} 