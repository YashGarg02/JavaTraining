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

public class FReader {
    public static void main(String[] args) throws FileNotFoundException, IOException {
        FileReader fileReader = new FileReader("/Users/yashgarg/NetBeansProjects/JWriter/Files/Filewriter1.txt");
        int i;
        while ((i=fileReader.read())!=-1)
            System.out.print((char)i);
        fileReader.close();
    }
}
