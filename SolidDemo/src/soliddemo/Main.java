package soliddemo;


import java.util.Scanner;

public class Main {
    public static void main(String args[]){
        Book bb=new Book();
        InventoryView iv= new InventoryView(bb);
        iv.searchBook();
        System.out.println("Enter the type of book for discount: cooking or bio");
        Scanner in= new Scanner(System.in);
        String disc=in.nextLine();
        DiscountManager dm=new DiscountManager();
        dm.processBookDiscount(disc);
        HardcoverBookDelivery hcd=new HardcoverBookDelivery();
        AudiobookBookDelivery abd= new AudiobookBookDelivery();
        hcd.getDeliveryLocations();
        abd.getSoftwareOptions();
        HardcoverUI hi= new HardcoverUI();
        AudiobookUI ai= new AudiobookUI();
        hi.seeReviews();hi.searchSecondhand();
        ai.listenSample();ai.seeReviews();
        System.out.println("Enter the type of product to be added to Shelf: DVD or Book");
        Scanner inn= new Scanner(System.in);
        String ty=inn.nextLine();
        Shelf s= new Shelf();
        s.addProduct(ty);
    }
}
