public class SortAsc
{
    public static void main(String[]args)
    {
        int arr[] = {5, 2 , 8, 7, 1};
        int temp =0;

        System.out.print("Original Array : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

        for(int i=0; i<arr.length; i++)
        {
            for(int j=i+1; j<arr.length; j++)
            {
                if(arr[i] > arr[j])
                {
                    temp = arr[i];
                    arr[i] = arr[j];
                    arr[j] = temp;
                }
            }
        }

        System.out.println();
        System.out.print("After Ascending Array : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }
    }
}