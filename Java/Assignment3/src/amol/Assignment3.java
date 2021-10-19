package amol;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Scanner;

public class Assignment3 {

    public static void runSystemCommand(String command) {

        try {
            List<Float> time=new ArrayList<>();
            Process newProcess = Runtime.getRuntime().exec(command);
            BufferedReader inputStream = new BufferedReader(new InputStreamReader(newProcess.getInputStream()));

            String str = "";
            while ((str = inputStream.readLine()) != null) {
                System.out.println(str);
                int index=str.indexOf("Time = ");
                if(index!=-1)
                    time.add(Float.parseFloat(str.substring(index+5,str.indexOf("ms"))));
            }
            Collections.sort(time);
            System.out.println(time);
            if(time.size()%2==0)
                System.out.println("The median is "+(time.get(time.size()/2)+time.get((time.size()/2)-1))/2);
            else
                System.out.println("The median is "+time.get(time.size()/2));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {

        Scanner scanner=new Scanner(System.in);
        System.out.println("Enter the ip address");
        String ip =scanner.next();
        System.out.println("Enter the number of times to ping");
        int c=scanner.nextInt();
        runSystemCommand("ping -c "+c+" "+ ip);


    }
}