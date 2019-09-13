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

public class JPrintStrm {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileOutputStream fileOutputStream = new FileOutputStream("/Users/yashgarg/NetBeansProjects/JWriter/Files/PS1.txt");
        PrintStream printStream = new PrintStream(fileOutputStream);
        printStream.println(2019);
        printStream.println("Welcome to the print stream file");
        printStream.close();
        fileOutputStream.close();
        System.out.println("Success");
        
    }
}