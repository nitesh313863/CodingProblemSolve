//Enter the String 1st :
//        nitesh
//        Enter the String 2nd :
//        hsetin
//        String Anagram


//Enter the String 1st :
//        nitesh
//        Enter the String 2nd :
//        nntesh
//        Sting Not Anagram

import java.util.Scanner;


public class AnagramString {
    public static void main(String[] args) {
        String s1=new String();
        Scanner sc=new Scanner(System.in);
        String s2=new String();
        System.out.println("Enter the String 1st : ");
        s1=sc.nextLine();
        System.out.println("Enter the String 2nd : ");
        s2 =sc.nextLine();
        boolean flag=false;
        if(s1.length()!=s2.length())
        {
            System.out.println("This String not Anagram");
        }
        else {
            for (int i = 0; i < s1.length(); i++)
            {
                int in1=s2.indexOf(s2.charAt(i));
                int in2=s2.lastIndexOf(s2.charAt(i));
                if(in1 !=in2 || in1==-1)
                {
                    flag=true;
                    break;
                }
            }
        }
        if(flag ==true)
        {
            System.out.println("Sting Not Anagram");
        }
        else {
            System.out.println("String Anagram");
        }
    }
}
