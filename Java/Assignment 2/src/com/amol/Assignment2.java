package com.amol;

import java.util.HashMap;
import java.util.Scanner;

//Time Complexity is o(n) and Space Complexity is o(1)
public class Assignment2 {

    public boolean abcdChecker(String input)
    {

        input=input.toLowerCase();
        HashMap<Character,Integer> result=new HashMap<>();

        for(int i=0;i<input.length();i++)
        {
            if(input.charAt(i)>='a' && input.charAt(i)<='z'&& !result.containsKey(input.charAt(i))) {

                    result.put(input.charAt(i), 1);

            }
        }
        boolean isSizeEqualTo26;
        if(result.size()==26) {
            isSizeEqualTo26 = true;
        }
        else {
            isSizeEqualTo26 = false;
        }
        return isSizeEqualTo26;
    }

    public static void main(String[] args) {
        Assignment2 obj=new Assignment2();

        while(true) {
            System.out.println("\n"+"Enter the input to check all alphabets or x to exit");
            Scanner scanner = new Scanner(System.in);
            String input = scanner.next();
            if(input.equals("x"))
                break;


            if (obj.abcdChecker(input)) {
                System.out.println("\n"+ "Output: "+input + " has all the alphabets");
            } else {
                System.out.println("\n"+ "Output: "+input + " does not have all alphabets");
            }
        }
    }
}
