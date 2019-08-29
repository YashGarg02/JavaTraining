/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
public class AbsClass {
    public static void main(String[] args) {
        D d=new D();
        d.sum(6, 7);
        d.msg();
        
        Test t=new Test();
        t.print();
        t.show();
                
    }
}

abstract class C
{
    public abstract void sum(int a, int b);
   void msg()
    {
        System.out.println("hello world. talking from abstract class");
    }
}

class D extends C
{
   @Override
    public void sum(int a, int b) {
        int c = a+b;
        System.out.println(c);//throw new UnsupportedOperationException("Not supported yet."); //To change body of generated methods, choose Tools | Templates.
        //return c;
    }
}


interface Printable
{
    void print();
   
}

interface Showable extends Printable
{
    void show();
    void print();
}

class Test
{
    public void print()
    {
        System.out.println("Printable implemented");
       
    }
    public void show()
    {
    System.out.println("showable implemented");
    }
}

