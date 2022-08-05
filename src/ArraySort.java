//Arr[5,4,3,2,1] O/P=[1,2,3,4,5]

import java.util.Scanner;
class Sort
{
    public void sortArray(int[] arr)
    {
        for(int i=0;i<=arr.length-1;i++)
        {
            for(int j=0;j< arr.length-1-i;j++)
            {
                if(arr[j]>arr[j+1])
                {
                    int temp=arr[j];
                    arr[j]=arr[j+1];
                    arr[j+1]=temp;
                }
            }
        }
    }
}
public class ArraySort {
    public static void main(String[] args)
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter the Size Of Array : ");
        n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<= arr.length-1;i++)
        {
            arr[i]=sc.nextInt();
        }
        Sort ob=new Sort();
        ob.sortArray(arr);
        for(int i=0;i<= arr.length-1;i++)
        {
            System.out.print("  "+arr[i]);
        }


    }
}
