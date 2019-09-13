/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Yash
 */
import java.io.File;
import java.io.FileOutputStream;
import java.io.FilterOutputStream;

public class FiltOutStream {
    public static void main(String[] args) {
        try {
            File data = new File("C:\\Users\\Yash\\Desktop\\Java Training\\Hello.txt");
            FileOutputStream fileOutputStream = new FileOutputStream(data);
            FilterOutputStream filterOutputStream = new FilterOutputStream(fileOutputStream);
            String s = "Welcome to this new file.";
            byte b[] = s.getBytes();
            filterOutputStream.write(b);
            filterOutputStream.flush();
            filterOutputStream.close();
            fileOutputStream.close();
            System.out.println("success");
        } catch (Exception e) {
        }
    }
}
