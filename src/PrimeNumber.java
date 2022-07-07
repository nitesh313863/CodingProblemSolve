import java.util.Scanner;

public class PrimeNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a= sc.nextInt();
        int count=0;
        boolean flag=false;
        if (a == 0 || a == 1) {
            flag=false;
        }
        for(int i=2;i<=a/2;i++)
        {
            if(a%i==0)
            {
                flag=true;
                break;
            }

        }
        if(flag==true)
        {
            System.out.println("This number Is Not Prime");
        }
        else {
            System.out.println("This Number IS Prime");
        }

    }
}

