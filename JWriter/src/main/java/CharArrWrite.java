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

public class CharArrWrite {
    public static void main(String[] args) {
        try {
            CharArrayWriter arrayWriter = new CharArrayWriter();
            arrayWriter.write("This is written by the char array writer file");
            FileWriter fileWriter1 = new FileWriter("/Users/yashgarg/NetBeansProjects/JWriter/Files/CAW1.txt");
            FileWriter fileWriter2 = new FileWriter("/Users/yashgarg/NetBeansProjects/JWriter/Files/CAW2.txt");
            FileWriter fileWriter3 = new FileWriter("/Users/yashgarg/NetBeansProjects/JWriter/Files/CAW3.txt");
            FileWriter fileWriter4 = new FileWriter("/Users/yashgarg/NetBeansProjects/JWriter/Files/CAW4.txt");
            
            arrayWriter.writeTo(fileWriter1);
            arrayWriter.writeTo(fileWriter2);
            arrayWriter.writeTo(fileWriter3);
            arrayWriter.writeTo(fileWriter4);
            
            fileWriter1.close();
            fileWriter2.close();
            fileWriter3.close();
            fileWriter4.close();
            System.out.println("Success");
                    
        } catch (Exception e) {
        }
    }
}
