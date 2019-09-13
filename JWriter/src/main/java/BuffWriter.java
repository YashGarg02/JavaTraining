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

public class BuffWriter {
    public static void main(String[] args) throws IOException {
        FileWriter fileWriter = new FileWriter("/Users/yashgarg/NetBeansProjects/JWriter/Files/BufferWriter.txt");
        BufferedWriter bufferedWriter = new BufferedWriter(fileWriter);
        bufferedWriter.write("welcome to buffered writer file");
        bufferedWriter.close();
        System.out.println("success");
    }
}
