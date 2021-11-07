package soliddemo;


public class CookbookDiscount implements BookDiscount{
    @Override
    public String getBookDiscount() {
        String discount = "30% between Dec 1 and 24.";

        return discount;
    }
}
