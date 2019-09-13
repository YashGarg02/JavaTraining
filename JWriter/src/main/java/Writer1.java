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

public class Writer1 {
    public static void main(String[] args) {
        try {
            Writer w = new FileWriter("Hello.txt");
            String content = "Hello world how are you?";
            String c = "What are you doing?";
            w.write(content+c);
            w.close();
            System.out.println("done");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
   
}
