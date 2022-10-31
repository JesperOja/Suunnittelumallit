package Proxy;

public class RealImage implements Image{
    private final String filename;

    public RealImage(String filename){
        this.filename = filename;
        loadImageFromDisk();
    }
/**
     * Loads the image from the disk
     */
    private void loadImageFromDisk() {
        System.out.println("Loading   " + filename);
    }

    /**
     * Displays the image
     */
    public void displayImage() {
        System.out.println("Displaying " + filename);
    }

    @Override
    public void showData() {
        System.out.println("Filename: " + filename);
        
    }
    
}
