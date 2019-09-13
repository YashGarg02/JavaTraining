/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash
 */

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.InputStream;

public class DInStream {
    public static void main(String[] args) {
        try {
            InputStream fileInputStream = new FileInputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello.txt");
            DataInputStream dataInputStream = new DataInputStream(fileInputStream);
            int c = fileInputStream.available();
            byte[] arr = new byte[c];
            dataInputStream.read(arr);
            for (byte bt : arr) {
                char k = (char) bt;
                System.out.print(k+"-");
            }
        } catch (Exception e) {
        }
    }
}
