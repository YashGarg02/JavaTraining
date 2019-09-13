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
public class FileInStrm {
    public static void main(String[] args) {
    //    try {
            
  //  FileInputStream fis = new FileInputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello.txt");
//    int i = fis.read();
//            System.out.println(i);
//            fis.close();
//        } catch (Exception e) {
//        }
//    
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello.txt");
            int i = 0;
            while ((i=fis.read())!=-1)
            {
            System.out.print((char)i);
            }
            fis.close();
        } catch (Exception e) {
        }
    
    
    }
}
