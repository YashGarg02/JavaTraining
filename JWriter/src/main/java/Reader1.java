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

public class Reader1 {
    public static void main(String[] args) {
        try {
            Reader r = new FileReader("Hello.txt");
            int data = r.read();
            while (data!=-1) {
                System.out.print((char)data);
                data = r.read();
            }
            r.close();
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
