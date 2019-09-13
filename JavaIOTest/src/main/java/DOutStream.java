/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash
 */

import java.io.DataOutputStream;
import java.io.FileOutputStream;


public class DOutStream {
    public static void main(String[] args) {
        try {
            FileOutputStream fos = new FileOutputStream("C:\\Users\\Yash\\Desktop\\Java Training\\Hello.txt");
            DataOutputStream dataOutputStream = new DataOutputStream(fos);
            dataOutputStream.writeChars("Hello how are you??");
            dataOutputStream.flush();
            dataOutputStream.close();
        } catch (Exception e) {
        }
    }
}
