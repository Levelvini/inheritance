package entities;

import java.time.LocalDateTime;

public class UsedProducts extends Products{
    LocalDateTime manufactureDate = LocalDateTime.now();

    public UsedProducts(LocalDateTime manufactureDate) {
        this.manufactureDate = manufactureDate;
    }

    public UsedProducts(String name, double price, LocalDateTime manufactureDate) {
        super(name, price);
        this.manufactureDate = manufactureDate;
    }

    @Override
    public String priceTag(){
        return getName() + "(used) $ " + getPrice() + "(manufacturedDate) " + manufactureDate;
    }

    public LocalDateTime getManufactureDate() {
        return manufactureDate;
    }

    public void setManufactureDate(LocalDateTime manufactureDate) {
        this.manufactureDate = manufactureDate;
    }
}
