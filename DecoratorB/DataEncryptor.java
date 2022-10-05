package DecoratorB;

public class DataEncryptor extends DataDecorator{

    public DataEncryptor(Datareader dataToBeEncrypted) {
        super(dataToBeEncrypted);
    }

    @Override
    public void datatype(){
        super.datatype();
        System.out.print(" Adding encryption to data.. ");
        encrypt();
    }

    private void encrypt(){
        //Encrypting data..
    }
    
}
