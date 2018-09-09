/* This turned into something a little more than just basic arithmetic lol
but its just your basic loops and shit. Nothing too bad!
 */

import java.util.*;

public class Examples
{
    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);


        int num1;
        int num2;
        String choice;
        int result;
        String a;


        do
        {
            System.out.println("Please enter your first number: ");
            num1 = input.nextInt();

            System.out.println("Please enter your second number: ");
            num2 = input.nextInt();

            System.out.println("\nAdd?\nSubtract?\nDivide?\nMultiply?\nRemainder?\n");
            choice = input.next();


            switch (choice)
            {
                case "Add":
                    result = num1 + num2;
                    System.out.println(result);
                    break;
                case "Subtract":
                    result = num1 - num2;
                    System.out.println(result);
                    break;
                case "Divide":
                    result = num1 / num2;
                    System.out.println(result);
                    break;
                case "Multiply":
                    result = num1 * num2;
                    System.out.println(result);
                    break;
                case "Remainder":
                    result = num1 % num2;
                    System.out.println(result);
                    break;
                default:
                    System.out.println("Please make sure you wrote out your response exactly how it appears on screen.");
                    break;
            }

            System.out.println("Again? y/n");
            a = input.next();

        } while (a.equals("y"));


    }
}