public abstract class Phone implements Printable{
    private String model;
    private String brand;

    public Phone(String model, String brand) {
        this.model = model;
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public String getBrand() {
        return brand;
    }
}
