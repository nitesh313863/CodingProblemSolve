//Enter the String :
//        nitesh
//        String All Character Unique :-   True

//Enter the String :
//        nitesht
//        String All Character Not Unique False

import java.util.Scanner;

public class StringAllCharacterUnique {
    public static void main(String[] args) {
        String s=new String();
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        s=sc.nextLine();
        boolean flag=false;
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.indexOf(s.charAt(i))==s.lastIndexOf(s.charAt(i)))
            {
                flag=true;
            }
            else
            {
                flag=false;
                break;
            }
        }
        if (flag==true)
        {
            System.out.println("String All Character Unique :-   True");
        }
        else
        {
            System.out.println("String All Character Not Unique False");
        }
    }
}
