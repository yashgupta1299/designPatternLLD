package ProxyDesignPattern.v2;

import ProxyDesignPattern.v2.Img.ProxyImage;
import ProxyDesignPattern.v2.Img.Image;

public class ProxyPatternExample {
    public static void main(String[] args) {
        Image image = new ProxyImage("example.jpg");

        // Lazyloading
        // Image will be loaded from disk only when display() is called
        image.display();

        // Image will not be loaded again, as it has been cached in the Proxy
        image.display();
    }
}