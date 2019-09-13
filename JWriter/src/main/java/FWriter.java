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



public class FWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/yashgarg/NetBeansProjects/JWriter/Files/Filewriter1.txt");
        fileWriter.write("Welcome to this file named filewriter");
        fileWriter.close();
        System.out.println("success");
    }
    
}
