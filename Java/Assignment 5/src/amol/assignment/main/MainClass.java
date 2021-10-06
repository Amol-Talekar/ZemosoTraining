package amol.assignment.main;

import amol.assignment.data.DataClass;
import amol.assignment.singleton.SingletonClass;

public class MainClass {
    public static void main(String[] args) {
        DataClass newData= new DataClass();
        newData.printLocalVariables();
        //Above can not work as variables are not yet initialized

        SingletonClass secondData= SingletonClass.method("Playing Cricket");
        secondData.printString();
    }
}
