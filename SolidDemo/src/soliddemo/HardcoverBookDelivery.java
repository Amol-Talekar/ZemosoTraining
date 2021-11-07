package soliddemo;


public class HardcoverBookDelivery extends OfflineBookDelivery {

    @Override
    void getDeliveryLocations() {
        System.out.println("Hardcore Delivery is only available in Mumbai");
    }
}
