import java.util.Scanner;

public class NumbeOofOccurencesOfCharacter {
    public static void main(String[] args) {
        String s =new String();
        String c=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        s=sc.nextLine();
        System.out.println("Enter the Occurrence:");
        c=sc.next();
        int count=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            if(c.charAt(0)==s.charAt(i))
            {
                count++;
            }
        }
        System.out.println(count);
    }
}
