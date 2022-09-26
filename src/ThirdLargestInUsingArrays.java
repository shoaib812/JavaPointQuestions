import java.util.Arrays;
public class ThirdLargestInUsingArrays
{
    public static int getThirdLargest(int[] a, int total)
    {
        Arrays.sort(a);
        return a[total-3];
    }

    public static void main(String[]ar)
    {
        int a[] = { 1, 2, 5, 6, 3, 2};
        int b[] = {44, 66, 99, 77, 33, 22, 55};
        System.out.println("Third Largest Array Using Arrays : "+getThirdLargest(a,6));
        System.out.println("Third Largest Array Using Arrays : "+getThirdLargest(b,7));
    }
}
