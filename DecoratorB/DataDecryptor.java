package DecoratorB;

public class DataDecryptor extends DataDecorator{

    public DataDecryptor(Datareader dataToBeEncrypted) {
        super(dataToBeEncrypted);
    }
    
    @Override
    public void datatype(){
        super.datatype();
        System.out.print(" Decrypting data..!");
    }
}
