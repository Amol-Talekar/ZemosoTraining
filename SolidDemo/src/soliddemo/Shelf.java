package soliddemo;


public class Shelf {

    void addProduct(String pro) {
        if(pro.equals("DVD")){
            DVD d=new DVD();
            d.add(pro);
        }
        else if(pro.equals("Book")){
            Books b=new Books();
            b.add(pro);
        }
        else if(!pro.equals("DVD")&&!pro.equals("Book")){
            System.out.println("Invalid Category thus nothing was added to shelf");
        }

    }
}
