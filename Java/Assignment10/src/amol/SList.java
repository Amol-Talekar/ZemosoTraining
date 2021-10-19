package amol;


import java.util.Scanner;


public class SList<T> {

    static Link head;

    private static SListIterator iterator(Link head){

        SListIterator iterator = new SListIterator(head);
        return iterator;

    }

    public static void main(String args[]){

        SList sl = new SList();
        head = new Link("Head Link is ",null);
        SListIterator iterator = iterator(head);

        while(true){
            System.out.println("Press 1 to insert");
            System.out.println("Press 2 to remove");
            System.out.println("Press 3 to print the list");
            System.out.println("Press -1 to exit");

            Scanner scanner = new Scanner(System.in);
            int i = scanner.nextInt();
            if(i == -1){
                break;
            }
            if(i==1){
                System.out.println("Enter the data to be inserted");
                iterator.insert(scanner.next());
                System.out.println("Insertion Operation Successful \n");
            }
            else if(i==2){
                iterator.remove();

            }
            else if(i==3){
                iterator.iterate();
            }
            else if(i!=1&&i!=2&&i!=3){
                System.out.println("Invalid response");
            }

        }

    }

}