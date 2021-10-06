package amol.assignment.singleton;

public class SingletonClass {
    String hobby;
   public static SingletonClass method(String h){
        SingletonClass newobj=new SingletonClass();
        newobj.hobby=h;
        return newobj;

    }
    public void printString()
    {
        System.out.println(hobby);
    }
}
