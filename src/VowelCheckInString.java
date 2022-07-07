import java.util.Scanner;

public class VowelCheckInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String : ");
        String s=sc.nextLine();
        int vowel=0;
        int constant=0;
        for(int i=0;i<=s.length()-1;i++)
        {
            if(s.charAt(i)=='a'||s.charAt(i)=='e'||s.charAt(i)=='i'||s.charAt(i)=='o'||s.charAt(i)=='u')
            {
                vowel++;
            }
            else {
                constant++;
            }
        }
        if(vowel>=1)
        {
            System.out.println("vowel is present in the String : "+vowel);
        }
        else{
            System.out.println("vowel is not present in the String");
        }
        System.out.println("Total Constant is present in the String : "+constant);
    }
}
