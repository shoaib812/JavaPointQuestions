public class Reverse_Number_Using_WhileLoop
{
    public static void main(String[]args)
    {
        int num = 1234;
        int remainder = 0;
        int reverse =0;

        while (num != 0)
        {
            remainder = num % 10;
            reverse = reverse * 10 + remainder;
            num = num / 10;
        }

        System.out.println("The reverse of the given number : "+reverse);
    }
}
