545, 151, 34543, 343, 171, 48984


import java.util.Scanner;
class PalindromeLogicClass
{
    public boolean palindromeNumber(int n)
    {
        int p=0;
        int n1=n;
       while(n!=0)
       {
           p=p*10+n%10;
           n=n/10;
       }
       if(p==n1)
       {
           return true;
       }
       return false;
    }

}
public class PalindromeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        int n= sc.nextInt();
        PalindromeLogicClass ob=new PalindromeLogicClass();
        System.out.println(ob.palindromeNumber(n));

    }
}
