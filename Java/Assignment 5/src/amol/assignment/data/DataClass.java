package amol.assignment.data;

public class DataClass {
   public int age;
   public char name;

   public void printNameAndAge(){
       System.out.println("Name is"+name+"and age is"+age);
   }
   public void printLocalVariables(){
       int salary;
       char location;
       //System.out.println("Salary is"+salary+"and location is"+location);

       //Above method is not possible as variables are not initialized and thus they can't be printed;
   }
}
