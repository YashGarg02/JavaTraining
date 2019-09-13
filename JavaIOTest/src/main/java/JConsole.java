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

public class JConsole {
    public static void main(String[] args) throws IOException, NullPointerException{
//        String text=System.console().readLine(); 
//        System.out.println("Text is: "+text); throws null pointer exception


        Console c=System.console(); 
//        System.out.println("Enter your name: "); 
//        String n=c.readLine(); 
//        System.out.println("Welcome "+n);
        
        
        
        System.out.println("Enter password: "); 
        char[] ch=c.readPassword();
        String pass=String.valueOf(ch);//converting char array into string 
        System.out.println("Password is: "+pass);
    }
}
