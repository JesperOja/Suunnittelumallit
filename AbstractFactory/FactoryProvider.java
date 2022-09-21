public class FactoryProvider {
    public static AbstractFactory getFactory(String choice){
        
        if("Adidas".equalsIgnoreCase(choice)){
            return new Merkki();
        }else if("Boss".equalsIgnoreCase(choice)){
            return new Boss();
        }
        
        return null;
    }
}
