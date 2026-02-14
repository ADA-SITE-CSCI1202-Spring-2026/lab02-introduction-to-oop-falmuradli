package Week03.invoice;

public class Invoice {
    private String partNumber;
    private String description;
    private Integer quantity;
    private Double price;

    public Invoice(String partNumber, String description, Integer quantity, Double price) {
        this.partNumber = partNumber;
        this.description = description;
        setQuantity(quantity);
        setPrice(price);
    }

    public String getPartNumber() {
        return partNumber;
    }
    public void setPartNumber(String partNumber) {
        this.partNumber = partNumber;
    }

    public String getDescription() {
        return description;
    }
    public void setDescription(String description) {
        this.description = description;
    }

    public Integer getQuantity()  {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        if(quantity <= 0) {
            this.quantity = 0;
        } else {
            this.quantity = quantity;
        }
    }

    public Double getPrice() {
        return price;
    }

    public void setPrice(Double price) {
        if(price <= 0) {
            this.price = 0.0;
        } else {
            this.price = price;
        }
    }
    public Double getInvoiceAmount() {
        return quantity * price;
    }

}
