/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash
 */

import java.io.*;


public class ByteArrOutStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos1 = new FileOutputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello.txt");
        FileOutputStream fos2 = new FileOutputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello1.txt");
        String s = "Hello World, My name is Yash Garg.";
        byte b[] = s.getBytes();
        ByteArrayOutputStream arrayOutputStream = new ByteArrayOutputStream();
        arrayOutputStream.write(b);
        //arrayOutputStream.write(65);
        arrayOutputStream.writeTo(fos1);
        arrayOutputStream.writeTo(fos2);
        arrayOutputStream.flush();
        arrayOutputStream.close(); //no effect
        System.out.println("Success");
        }
}
