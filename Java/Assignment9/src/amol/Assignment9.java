package amol;

import java.util.Scanner;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Assignment9 {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter a String");
        String input=scanner.nextLine();

        String desiredPattern="[A-Z].*\\.$";
        Pattern pattern= Pattern.compile(desiredPattern);
        Matcher match=pattern.matcher(input);
        if(match.find())
        {
            System.out.println("This input has first letter as a Capital letter and last letter as a period");
        }
        else
        {
            System.out.println("Input doesn't match the desired pattern");
        }
    }
}
