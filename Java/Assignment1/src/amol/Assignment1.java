package amol;


import java.io.File;

import java.util.Scanner;


public class Assignment1{

    private void findFile()
    {


        File file = new File("/home/amolt");
        //string to store the name of the file
        String str ;
        //  Scanner is declare
        Scanner in = new Scanner(System.in);
        // do while is used to run the program again and again
        do{
            int ab =0;
            System.out.println("ENTER THE NAME OF FILE OR FOLDER");
            //take input
            str =in.nextLine();
            //list of file is stored in string
            String[] files = file.list();
            //continous check each file or folder
            for (String string : files){
                //check the name of file present or not and store in boolean str1
                Boolean isStrEqual = str.equals(string);
                // isStrEqual is true than print the following
                if (Boolean.TRUE.equals(isStrEqual)){
                    ab = 1;
                    System.out.println("File Found at Address : ");
                    System.out.println(string);
                    //print the address of the file
                    System.out.println("Address is : "+ file.getAbsolutePath());
                }
            }

            if(ab == 0)
            {
                System.out.println("File not find : Reenter the name of the file.");
            }
        } while(true);
    }

    //declared main()
    public static void main(String[] args){
        //object of Assignment1 class is created
        Assignment1 obj =new Assignment1();
        //calling the findFile()
        obj.findFile();
    }
}