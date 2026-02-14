package Week03.invoice;

public class Main {
    static void main(String[] args) {
        Invoice obj = new Invoice("A1", "Wheel", 3, 20.5);
        System.out.println("The part number : " + obj.getPartNumber());
        System.out.println("The part number : " + obj.getDescription());
        System.out.println("The part number : " + obj.getQuantity());
        System.out.println("The part number : " + obj.getPrice());
        System.out.println("The part number : " + obj.getInvoiceAmount());
    }
}
