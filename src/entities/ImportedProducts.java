package entities;

public class ImportedProducts extends Products {
    private double customFee;
    public ImportedProducts(){
    }

    public ImportedProducts(double customFee) {
        this.customFee = customFee;
    }

    public ImportedProducts(String name, double price, double customFee) {
        super(name, price);
        this.customFee = customFee;
    }

    public double getCustomFee() {
        return customFee;
    }

    public void setCustomFee(double customFee) {
        this.customFee = customFee;
    }
    public double totalprice(){
        return getPrice() + customFee;
    }
    @Override
    public String priceTag(){
        return getName() + " % " + totalprice() + " (customFee = " + customFee + ")";
    }
}
