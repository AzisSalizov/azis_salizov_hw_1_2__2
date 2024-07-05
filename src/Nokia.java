public class Nokia extends Phone {
    private boolean hasPhysicalKeyboard;

    public Nokia(String model, String brand, boolean hasPhysicalKeyboard) {
        super(model, brand);
        this.hasPhysicalKeyboard = hasPhysicalKeyboard;
    }

    public boolean isHasPhysicalKeyboard() {
        return hasPhysicalKeyboard;
    }

    @Override
    public void print() {
        System.out.println("Nokia :\n" + "Model: " + getModel() + "\nBrand: " + getBrand() + "\nHas Physical Keyboard: " + hasPhysicalKeyboard);
    }
}
