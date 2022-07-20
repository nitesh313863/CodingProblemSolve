public class IntersectionTwoArray {
    public static void main(String[] args) {
    int arr[]={1,2,6,4,5};
    int arr1[]={7,8,9,2,4,6,1};
    for(int i=0;i<=arr.length-1;i++)
        for (int j = 0; j <= arr1.length - 1; j++)
            if (arr[i] == arr1[j])
                System.out.println(arr[i]);
    }
}
