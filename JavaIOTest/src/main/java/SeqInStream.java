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

//contains 2 examples
public class SeqInStream {
    public static void main(String[] args) {
        try {
            FileInputStream fis1 = new FileInputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello.txt");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello1.txt");
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Yash\\Desktop\\Java Training\\HellOutput.txt"); //contains output of hello1 and hello files  reading from multiple files and adding to one
            SequenceInputStream inputStream = new SequenceInputStream(fis1, fis2);
            int j;
            while ((j=inputStream.read())!=-1) {
                
                
                System.out.print((char)j);
                //fos.write(j); //##for creating another output file
            }
            
            inputStream.close();
         //##   fos.close(); 
            fis1.close();
            fis2.close();
            System.out.println("Success..");
        } catch (Exception e) {
        }
    }
}
