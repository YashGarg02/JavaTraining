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
import java.util.*;

public class SeqInStreamEnum {
    public static void main(String[] args) {
        
        try {
            FileInputStream fis1 = new FileInputStream("C:\\Users\\Yash\\Desktop\\Java Training\\a.txt");
            FileInputStream fis2 = new FileInputStream("C:\\Users\\Yash\\Desktop\\Java Training\\b.txt");
            FileInputStream fis3 = new FileInputStream("C:\\Users\\Yash\\Desktop\\Java Training\\c.txt");
            FileInputStream fis4 = new FileInputStream("C:\\Users\\Yash\\Desktop\\Java Training\\d.txt");
        
            Vector v = new Vector();
            v.add(fis1);
            v.add(fis2);
            v.add(fis3);
            v.add(fis4);
            Enumeration e = v.elements();
            
            SequenceInputStream sis = new SequenceInputStream (e);
            int i=0;
            while ((i=sis.read())!=-1){
                System.out.print((char)i);
            }
            sis.close();
            fis1.close();
            fis2.close();
            fis3.close();
            fis4.close();
            
        
        } catch (Exception e) {
        }
    }
}
