public class Merkki implements AbstractFactory<Vaatteet>{

    @Override
    public Vaatteet create(String merkki) {
        if("Adidas".equalsIgnoreCase(merkki))
            return new Vaatteet(merkki);
        else if("Boss".equalsIgnoreCase(merkki))
            return new Vaatteet(merkki);

        return null;
    }
}
