import java.util.Scanner;
class FactorialLogic
{
    public int factorialLogic(int n)
    {
        if(n==1)
        {
            return 1;
        }
        else
        {
            return (n*factorialLogic(n-1));
        }
    }
}
public class Factorial {
    public static void main(String[] args) {
        int n;
        Scanner sc =new Scanner(System.in);
        System.out.println("Enter the Find Factorial Number : ");
        n=sc.nextInt();
        FactorialLogic fl=new FactorialLogic();

        System.out.println(fl.factorialLogic(n));
        // Using for Loop
        int fac=1;
        for(int i=n;i>=1;i--)
        {
             fac=fac*i;
        }
        System.out.println("for loop : "+fac);
    }
}
