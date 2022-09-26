public class RotateRight
{
    public static void main(String []args)
    {
        int arr[] = {1, 2, 3, 4, 5};
        int n = arr.length-1;


        System.out.print("Original Array : ");
        for(int i=0; i<arr.length; i++)
        {
            System.out.print(arr[i]+" ");
        }

         for(int j=0; j<n; j++)
         {
             int last = arr[arr.length-1];

             for(int k=arr.length-1; k>0; k--)
             {
                 arr[k] = arr[k-1];
             }

             arr[0] = last;
         }

        System.out.println();
        System.out.print("After Rotate Array : ");
         for(int i=0; i<arr.length; i++)
         {
             System.out.print(arr[i]+" ");
         }

    }
}
