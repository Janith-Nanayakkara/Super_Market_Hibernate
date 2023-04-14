package lk.ijse.supermarket.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class Item {
    @Id
     String code;
     String description;
     double price;
     int qty;

    public Item(){

    }

    public Item(String code, String description, double price, int qty) {
        this.setCode(code);
        this.setDescription(description);
        this.setPrice(price);
        this.setQty(qty);
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public double getPrice() {
        return price;
    }

    public void setPrice(double price) {
        this.price = price;
    }

    public int getQty() {
        return qty;
    }

    public void setQty(int qty) {
        this.qty = qty;
    }
}
