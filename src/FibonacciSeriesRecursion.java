import java.util.Scanner;

class FibonacciLogicClass
{
    public int Fibonacci(int a)
    {
        if(a<=1)
        {
            return a;
        }
        return Fibonacci(a-1)+Fibonacci(a-2);
    }

}
public class FibonacciSeriesRecursion {
    public static void main(String[] args) {
        int a ;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number");
        a=sc.nextInt();
        FibonacciLogicClass ob=new FibonacciLogicClass();
        System.out.println(ob.Fibonacci(a));


    }
}
