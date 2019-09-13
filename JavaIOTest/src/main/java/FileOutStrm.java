/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash
 */
import java.io.FileOutputStream;
        
public class FileOutStrm {
    public static void main(String[] args) {
        try {
//            FileOutputStream fos = new FileOutputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello.txt");
//            fos.write(77);
//            fos.close();
//            System.out.println("File Overwritten");
        FileOutputStream fout=new FileOutputStream("D:\\testout.txt"); 
        String s="Welcome to cmpundhir.";
        byte b[]=s.getBytes();//converting string into byte array fout.write(b);
        fout.close();
        System.out.println("success...");
        
        
        } catch (Exception e) {
        }

    }
}
