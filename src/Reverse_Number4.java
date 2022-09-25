import java.util.Scanner;
public class Reverse_Number4
{
    public static void main(String[] args)
    {
        System.out.print("Enter the number that you want to reverse: ");
        Scanner sc = new Scanner(System.in);
        int num = sc.nextInt();
        int reverse_number = reverseNumber(num);
        System.out.println("The reverse of the given number is: "+reverse_number);
    }

    public static int reverseNumber(int number)
    {
        boolean isNoNegative = number < 0 ? true : false;

        if(isNoNegative)
        {
            number = number * -1;
        }

        int reverse =0;
        int remainder =0;

        while (number != 0)
        {
            remainder = number % 10;
            reverse = reverse * 10 + remainder;
            number = number / 10;
        }

        return isNoNegative == true ? reverse*-1 : reverse;
    }
}
