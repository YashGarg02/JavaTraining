/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.exhandle;

/**
 *
 * @author yashgarg
 */
public class EHandle extends Parent {
    public static void main(String[] args) {
        
        EHandle eh1 = new EHandle();
        EHandle eh2 = new EHandle();
        eh1.msg();
        eh1=null;
        eh2.msg();
        eh2=null;
        System.gc();
        checkAge(6);
    }
    
    
    
    @Override
   public void msg() throws RuntimeException
   {
       super.msg();
       System.out.println("child");
   }
           
    @Override
   protected void finalize() throws Throwable{
        System.out.println("finalize called");
        super.finalize();
   }
           
    private static void checkAge(int age)
    {
        if( age>18)
        {
            System.out.println("You can vote.");
        }
        else
        {
            try {
                throw new MyEx();
            }
            catch(MyEx e)
            {
                System.out.println("Exception caught");
            }
                       
            }
        }
    
    
     private static class MyEx extends Exception
     {
         public MyEx()
         {
                 System.out.println("Not eligible to vote");
          }
     }
}

class Parent
{
   public void msg() throws IndexOutOfBoundsException
   {
       
       System.out.println("You are in parent class");
   }
            
}