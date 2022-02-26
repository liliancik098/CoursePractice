package tekwill.course.homework.lesson15;

import tekwill.course.homework.lesson15.util.ValidationInput;

public class Invoice {
    ValidationInput validationInput = new ValidationInput();
    private String deviceModel;
    private String deviceDescription;
    private int qtyPurchasedProducts;
    private double priceProduct;

    public Invoice(String deviceModel, String deviceDescription, int qtyPurchasedProducts, double priceProduct) {
        this.deviceModel = deviceModel;
        this.deviceDescription = deviceDescription;
        this.qtyPurchasedProducts = validationInput.validInt(qtyPurchasedProducts);
        this.priceProduct = validationInput.validDouble(priceProduct);
    }

    public String getDeviceModel() {
        return deviceModel;
    }

    public void setDeviceModel(String deviceModel) {
        this.deviceModel = deviceModel;
    }

    public String getDeviceDescription() {
        return deviceDescription;
    }

    public void setDeviceDescription(String deviceDescription) {
        this.deviceDescription = deviceDescription;
    }

    public int getQtyPurchasedProducts() {
        return qtyPurchasedProducts;
    }

    public void setQtyPurchasedProducts(int qtyPurchasedProducts) {
        this.qtyPurchasedProducts = validationInput.validInt(qtyPurchasedProducts);
    }

    public double getPriceProduct() {
        return priceProduct;
    }

    public void setPriceProduct(double priceProduct) {
        this.priceProduct = validationInput.validDouble(priceProduct);
    }

    public void getAmount() {
        System.out.println(this.getPriceProduct()*this.getQtyPurchasedProducts());
    }

}
