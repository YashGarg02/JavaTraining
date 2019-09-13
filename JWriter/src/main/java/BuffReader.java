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

public class BuffReader {
    public static void main(String[] args) throws IOException {
        FileReader fileReader = new FileReader("/Users/yashgarg/NetBeansProjects/JWriter/Files/BufferWriter.txt");
        BufferedReader br = new BufferedReader(fileReader);
        int i;
        while ((i=br.read())!=-1){
            
            System.out.print((char)i);
        }
        
        br.close();
        fileReader.close();
    }
}
