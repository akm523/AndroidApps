package DesignPattern.factorymethod;

import android.util.Log;

public class Factory {
    public static void use(String args) {
        DecodedImage decodedImage;
        ImageReader reader = null;
        String image = args;
        String format = image.substring(image.indexOf('.') + 1, (image.length()));
        if (format.equals("gif")) {
            reader = new GifReader(image);
        }

        decodedImage = reader.getDecodeImage();
        Log.i("Outcome", decodedImage.toString());
    }
}
