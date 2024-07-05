public class Main {
    public static Printable createObject(String className) {
        switch (className) {
            case "Nokia":
                return new Nokia("Nokia" , "3310" , true);
            case "Iphone":
                return new Iphone("Apple", "Iphone 13 pro max" , "IOS 17");
            case "Samsung":
                return new Samsung("Samsung" , "Galaxy S21" , true);
            case "Poco":
                return new Poco("Poco", "X3 Pro" , 512);
            default:
                return null;
        }
    }
    public static void main(String[] args) {
        Printable nokia = createObject("Nokia");
        Printable iphone = createObject("Iphone");
        Printable samsung = createObject("Samsung");
        Printable poco = createObject("Poco");

        Printable[] phones = {nokia, iphone, samsung, poco};

        for (Printable phone : phones) {
            phone.print();
            System.out.println("-----------");
        }
    }
}