public class Main {
    public static void main(String[] args) {
        AbstractFactory factory;

        factory = FactoryProvider.getFactory("Adidas");
        Vaatteet adidas =(Vaatteet) factory.create("Adidas");

        factory = FactoryProvider.getFactory("Boss");
        Vaatteet boss = (Vaatteet) factory.create("Boss");
    }
}
