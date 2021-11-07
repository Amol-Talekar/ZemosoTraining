package soliddemo;


public class InventoryView {
    Book book;

    InventoryView(Book book) {
        this.book = book;
    }

    void searchBook() {
        System.out.println("Book Search began");
    }
}