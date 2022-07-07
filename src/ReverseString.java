import java.util.Scanner;

public class ReverseString {
        public static void main(String[] args) {
            Scanner sc=new Scanner(System.in);
            String s=sc.nextLine();
            String temp="";
            int l=s.length()-1;
            for(int i=l;i>=0;i--)
            {
                temp=temp+s.charAt(i);
            }
            System.out.println(temp);
        }
}
