package DecoratorB;

public class Reading {
    public static void main(String[] args) {
		Datareader encrypted = new DataEncryptor(new Simpledata());
        encrypted.datatype();

        System.out.println("\n\n******************************\n");

        Datareader decrypted = new DataDecryptor(
                                new DataEncryptor(new Simpledata()));
        decrypted.datatype();
	}
}
