/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
import java.io.*;


public class CharArrRead {
    public static void main(String[] args) throws IOException {
        char[] arr= {'Y','a','s','h',' ','G','a','r','g'};
        CharArrayReader arrayReader = new CharArrayReader(arr);
        int k = 0;
        
        while ((k=arrayReader.read())!=-1)
        {
            char ch = (char) k;
            System.out.print(ch+":");
            System.out.println(k);
        }
        arrayReader.close();
    }
}
