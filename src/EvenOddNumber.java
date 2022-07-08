import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
class EvenOddLogic
{
    public void EvenOdd(List<Integer> list)
    {
        int even = 0;
        int odd = 0;
    for(int i=0;i<=list.size()-1;i++)
    {
        if(list.get(i)%2==0)
        {
            even++;
        }
        else
        {
            odd++;
        }

    }
        System.out.println("Total Even Number Is : "+even);
        System.out.println("Total Odd Number Is : "+odd);

    }
}
public class EvenOddNumber {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the Number : ");
        int n=sc.nextInt();
        List<Integer> list=new ArrayList<>(n);

        for(int i=0;i<=n-1;i++)
        {
            int li=sc.nextInt();
            list.add(li);
        }
        EvenOddLogic ob=new EvenOddLogic();
        ob.EvenOdd(list);
    }
}
