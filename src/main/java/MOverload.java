/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
public class MOverload {
    
public static void main(String[] args) {
        A a = new A();
        a.sum(4, 5);
        a.sum(500,2.432, 55.32);
        a.sum(384.44, 3.33);
        //System.out.println(a);
    }
}

class A{
    public static int sum (int a, int b)
    {
        int c=a+b;
        
        System.out.println(c);
        return c;
    }
    public static double sum (double a, double b, double c)
    {
        double d=a+b+c;
      
        System.out.println(d);
        return d;
    }
    public static double sum (double a, double b)
    {
        double c=a+b;
        
        System.out.println(c);
        return c;
    }
}