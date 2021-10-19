package amol;


import java.util.*;
import java.io.*;

public class Assignment11 {
    public static void main(String[] args) throws IOException{

        HashMap<Character,Integer> characterCounter=new HashMap<>();

        FileReader fileReader=new FileReader("/home/amolt/ZemosoAssignments/Java/Assignment11/src/amol/input.txt");
        int counter;
        while ((counter=fileReader.read())!=-1) {
            if (characterCounter.containsKey((char) counter)) {
                characterCounter.put((char) counter, characterCounter.get((char) counter) + 1);
            } else {
                if ((char) counter == '\n')
                    continue;
                characterCounter.put((char) counter, 1);
            }
        }
        System.out.println(characterCounter);


        FileWriter fileWriter=new FileWriter("/home/amolt/ZemosoAssignments/Java/Assignment11/src/amol/output.txt");
        fileWriter.flush();

        for (Map.Entry<Character, Integer> entry : characterCounter.entrySet()) {
            fileWriter.write(entry.getKey() + " Occurred " + entry.getValue()+"times\n");
        }
        fileWriter.close();

    }
}
