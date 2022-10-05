package DecoratorB;

public abstract class DataDecorator implements Datareader{
    protected Datareader dataToBeEncrypted;

    public DataDecorator( Datareader dataToBeEncrypted ){
        this.dataToBeEncrypted = dataToBeEncrypted;
    }

    public void datatype(){
        dataToBeEncrypted.datatype();
    }
    
}