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
import java.security.PermissionCollection;


public class FPermiss {
    public static void main(String[] args) throws IOException {
    String srg = "/Users/yashgarg/NetBeansProjects/JWriter/Files/BufferWriter.txt";
    FilePermission file1 = new FilePermission("/Users/yashgarg/NetBeansProjects/JWriter/Files/*", "read"); 
    PermissionCollection permission = file1.newPermissionCollection(); 
    permission.add(file1);
        FilePermission file2 = new FilePermission(srg, "write");
        permission.add(file2);
        if(permission.implies(new FilePermission(srg, "read,write"))) { 
            System.out.println("Read, Write permission is granted for the path "+srg ); 
            }
        else 
            {
            System.out.println("No Read, Write permission is granted for the path "+srg); 
            } 
    }
}

