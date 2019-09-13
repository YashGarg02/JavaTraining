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

public class JPrintWrite {
    public static void main(String[] args) throws Exception  {
        //data to be written on the console
        PrintWriter printWriter1 = new PrintWriter(System.out);
        printWriter1.write("File Successfully created");
        printWriter1.flush();
        printWriter1.close();
        
        //data to write in file using print writer
        PrintWriter writer2 =null;
        writer2 = new PrintWriter(new File("PWriter1.txt"));
        writer2.write("Welcome to the JPrintWrite file. Written by the Print Writer code");
        writer2.flush();
        writer2.close();
    }
}
