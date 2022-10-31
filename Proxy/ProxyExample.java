package Proxy;

import java.util.ArrayList;
import java.util.List;

public class ProxyExample {
    public static void main(String[] args){
        List<Image> imageList = new ArrayList<Image>();

        imageList.add(new ProxyImage("ensimmäinen.jpg"));
        imageList.add(new ProxyImage("Toinen.jpg"));
        imageList.add(new ProxyImage("Kolmas.jpg"));
        imageList.add(new ProxyImage("Viimeinen.jpg"));

        for ( Image i : imageList){
            i.showData();
        }

        for ( Image i : imageList){
            i.displayImage();
        }
    }
}
