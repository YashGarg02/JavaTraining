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

public class DataConsole2 {
    public static void main(String[] args) {
        try {
            InputStreamReader inputStreamReader = new InputStreamReader(System.in);
            BufferedReader br = new BufferedReader(inputStreamReader);
            String name = "";
            while(!name.equals("stop")&&!name.equals("Stop")&&!name.equals("STOP"))
            {
                System.out.println("Enter Data : ");
                name = br.readLine();
                System.out.println("The data is -> "+name);
            }
            br.close();
            inputStreamReader.close();
        } catch (Exception e) {
        }
    }
}
