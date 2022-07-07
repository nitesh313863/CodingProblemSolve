import java.util.Scanner;

public class SwapTwoNumber {
    public static void main(String[] args) {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.print("Enter A Value :");
        a=sc.nextInt();
        System.out.print("Enter b Value :");
        b= sc.nextInt();
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A : "+a+"\nb : "+b);

    }
}
