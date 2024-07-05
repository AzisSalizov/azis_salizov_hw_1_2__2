public class Samsung extends Phone{
    private boolean support5G;

    public Samsung(String model, String brand, boolean support5G) {
        super(model, brand);
        this.support5G = support5G;
    }

    public boolean isSupport5G() {
        return support5G;
    }

    @Override
    public void print() {
        System.out.println("Samsung: " + getBrand() + "\nModel " + getModel() + "\nsupport5G " + support5G);
    }
}
