public class EvenPositionArray
{
    public static void main(String[]args)
    {
        int num[] = {1, 2, 3, 4, 5, 6};

        System.out.print("Elements of given array present on even position : ");

        for(int i=1; i<=num.length; i=i+2)
        {
            System.out.print(num[i]+" ");
        }
    }
}
