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

public class BuffReadvsInpStrmRead {
    public static void main(String[] args) throws IOException {
        InputStreamReader inputStreamReader = new InputStreamReader(System.in);
        BufferedReader br = new BufferedReader(inputStreamReader);
        System.out.println("Enter Your Name :");
        String name = br.readLine();
        System.out.println("Welcome to Netbeans, "+name);
    }
}
