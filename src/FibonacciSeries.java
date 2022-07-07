public class FibonacciSeries {
    public static void main(String[] args) {
        int n=15;
        int a=0;
        int b=1;
        int c=1;
        if(n>=0)
        {
            System.out.print(a+" "+b);
            for(int i=0;i<=n;i++)
            {
                a=b;
                b=c;
                System.out.print(" "+c);
                c=a+b;

            }
        }
    }
}
