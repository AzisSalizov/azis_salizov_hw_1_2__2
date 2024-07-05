public class Iphone extends Phone{
    private String osVersion;

    public Iphone(String model, String brand, String osVersion) {
        super(model, brand);
        this.osVersion = osVersion;
    }

    public String getOsVersion() {
        return osVersion;
    }

    @Override
    public void print() {
        System.out.println("Iphone :\n" + "Model: " + getModel() + "\nBrand: " + getBrand() + "\nOS Version: " + getOsVersion());
    }
}
