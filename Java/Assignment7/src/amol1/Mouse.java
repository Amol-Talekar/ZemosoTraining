package amol1;


public class Mouse extends Rodent{
    Mouse() {
        System.out.println("Mouse class");
    }

    @Override
    public void tail() {
        System.out.println("long tail in Mouse class");
    }

}