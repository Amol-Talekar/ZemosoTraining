package soliddemo;

public class HardcoverUI implements HardcoverAction{

    @Override
    public void seeReviews() {
        System.out.println("Hard Cover Review section");
    }

    @Override
    public void searchSecondhand() {
        System.out.println("Searching Book");
    }

}
