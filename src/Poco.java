public class Poco extends Phone{
    private int memoryCapacity;

    public Poco(String model, String brand, int memoryCapacity) {
        super(model, brand);
        this.memoryCapacity = memoryCapacity;
    }

    public int getMemoryCapacity() {
        return memoryCapacity;
    }

    @Override
    public void print() {
        System.out.println("Poco: " + getBrand() + "\nModel: " + getModel() + "\nMemory Capacity: " + memoryCapacity);
    }
}
