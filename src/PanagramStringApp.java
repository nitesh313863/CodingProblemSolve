import java.util.Scanner;
class Paragram
{
    public boolean paraGram(String s)
    {
        if(s.length()<26)
        {
            return false;
        }
        else
        {
            for(char ch='a';ch<='z';ch++)
            {
                if(s.indexOf(ch)<0)
                {
                    return false;
                }
            }
        }
        return true;
    }
}
public class PanagramStringApp {
    public static void main(String[] args) {
        String s;
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String ");
        s=sc.nextLine();
        Paragram ob=new Paragram();
        System.out.println(ob.paraGram(s));

    }
}
