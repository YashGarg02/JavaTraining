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

public class BuffInStrm {
    public static void main(String[] args) {
        try {
            FileInputStream fis = new FileInputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello.txt");
            BufferedInputStream bis = new BufferedInputStream(fis);
            int i;
            while ((i=fis.read())!=-1){
                System.out.print((char)i);
              
            }
            bis.close();
            fis.close();
        } catch (Exception e) {
        }
    }
}
