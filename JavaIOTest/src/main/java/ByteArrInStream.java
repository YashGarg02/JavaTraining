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


public class ByteArrInStream {
    public static void main(String[] args) {
        try {
            byte[] b={35,36,37,38,39,40,41,42,43,44};
            ByteArrayInputStream bais = new ByteArrayInputStream(b);
            int i = 0;
            while ((i=bais.read())!=-1){
                char ch = (char)i;
                System.out.println("ascii value "+i+"special char is "+ch);
            }
        } catch (Exception e) {
        }
    }
}
