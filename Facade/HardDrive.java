package Facade;

public class HardDrive {
    private String data;

    public String Read(long position, int size){
        data = "Reading file from Hard Drive position " +position + ".. File size " +size+ "Mb";
        return data;
    }
}
