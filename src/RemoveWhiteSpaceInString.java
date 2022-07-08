import java.util.Scanner;
import java.util.StringTokenizer;

public class RemoveWhiteSpaceInString {
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter the String");
        String str=sc.nextLine();
        System.out.println(str.replaceAll(" ",""));


    }
}
