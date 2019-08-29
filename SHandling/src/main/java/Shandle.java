/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
public class Shandle {
    public static void main(String[] args) {
    String s1 = "yash";
    char ch[] = {'Y','a','s','h'};
    String s2 = new String(ch);
    String s3="Garg";
    String s4 = new String ("I am Yash Garg");
    String s5 = "Yash";
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);
        System.out.println(s4);
        System.out.println(s5);
        System.out.println(s1.equals(s2));
        System.out.println(s1.equals(s3));
        System.out.println(s1.equals(s5));
        System.out.println(s1.equalsIgnoreCase(s2));
       
        System.out.println(s1.replace(s1, s4));
        System.out.println(s1.toUpperCase());
        System.out.println(s1.concat(s3));
        //System.out.println(s4.split(s4, 5));
        
        
        StringBuffer sb = new StringBuffer("Hello world, I am Yash");
        System.out.println(sb.append( "Garg"));
        System.out.println(sb.insert(4, s5));
        System.out.println(sb.replace(1, 7, s3));
        System.out.println(sb.delete(2, 7));
        System.out.println(sb.deleteCharAt(0));
        System.out.println(sb.reverse());
        System.out.println(sb.capacity());
        sb.ensureCapacity(50);
        System.out.println(sb.capacity());
        
       // System.out.println("");
        
       StringBuilder build = new StringBuilder("Hello world, I am Yash");
        System.out.println(build.append( "Garg"));
        System.out.println(build.insert(4, s5));
        System.out.println(build.replace(1, 7, s3));
        System.out.println(build.delete(2, 7));
        System.out.println(build.deleteCharAt(0));
        System.out.println(build.reverse());
        System.out.println(build.capacity());
        sb.ensureCapacity(50);
        System.out.println(build.capacity());
       
    }


}