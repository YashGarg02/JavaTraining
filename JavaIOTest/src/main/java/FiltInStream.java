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

public class FiltInStream {
    public static void main(String[] args) {
        try {
            
            FileInputStream fin=new FileInputStream("D:\\testout.txt"); 
            int i=fin.read();
            System.out.print((char)i);
            fin.close();
            
            
//            File data = new File ("C:\\Users\\Yash\\Desktop\\Java Training\\Hello1.txt");
//            FileInputStream f = new FileInputStream(data);
//            FilterInputStream filterInputStream =  new BufferedInputStream(f);
//            int k=0;
//            while ((k=filterInputStream.read())!=-1);
//            System.out.println((char)k);
//            f.close();
//            filterInputStream.close();
                    
        } catch (Exception e) {
        }
    }
}
