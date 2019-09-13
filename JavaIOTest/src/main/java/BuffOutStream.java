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


public class BuffOutStream {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fos1 = new FileOutputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello.txt");
        BufferedOutputStream bos = new BufferedOutputStream(fos1, 4);
        String s = "Hello World, My name is Yash Garg.";
        byte b[] = s.getBytes();
        bos.write(b);
        bos.flush();
        bos.close();
        fos1.close();
        System.out.println("Success");
        }
}
