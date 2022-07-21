import java.util.Scanner;

public class ReverseNumber {
    public static void main(String[] args) {
        System.out.println("Enter the Number");
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int temp=0;
        while (n!=0)
        {
            temp=temp*10+n%10;
            n=n/10;
        }
        System.out.println("ReverseDigit"+temp);
    }

}
