package com.gduf.util;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Base64;

public class ImageToBase64Converter {
    public static String convertImageToBase64(String imagePath) {
        String base64String = null;
        File imageFile = new File(imagePath);

        try {
            FileInputStream imageInputStream = new FileInputStream(imageFile);
            byte[] imageData = new byte[(int) imageFile.length()];
            imageInputStream.read(imageData);

            base64String = Base64.getEncoder().encodeToString(imageData);

            imageInputStream.close();
        } catch (IOException e) {
            e.printStackTrace();
        }

        return base64String;
    }

    public static void main(String[] args) {
        String imagePath = "H:\\wing-of-anti-fraud\\src\\main\\resources\\static\\15e875eef6c380b7940aa9af729aa84.png"; // 指定你的图片文件路径
        String base64Image = convertImageToBase64(imagePath);
        System.out.println("Base64字符串: " + base64Image);
    }
}
