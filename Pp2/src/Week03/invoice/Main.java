package Week03.invoice;

public class Main {
    public static void main(String[] args) {
        Invoice obj = new Invoice("A1", "Wheel", -2, 23.6);
        System.out.println("The part number : " + obj.getPartNumber());
        System.out.println("The description : " + obj.getDescription());
        System.out.println("The quantity : " + obj.getQuantity());
        System.out.println("The price : " + obj.getPrice());
        System.out.println("Invoice amount : " + obj.getInvoiceAmount());
        obj.setPrice(-3.3);
        System.out.println(obj.getInvoiceAmount());
    }
}
