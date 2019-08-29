/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
public class CThread {
    public static void main(String[] args) {
        Th t1 = new Th();
        
        Thread t2 = new Thread (new Runnable(){
            @Override
            public void run() {
            
            for (int i = 0; i < 10; i++) {
                try
                {
                    Thread.sleep(1000);
                }
                catch(InterruptedException e){
                    System.out.println(e);
                    
                }
                
                System.out.println("no in t2---"+i);
            }
        }
        });
    t1.start();
    t2.start();

    }
    }

class Th extends Thread
{

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        for (int i = 0; i < 10; i++) {
            try
            {
                Thread.sleep(1000);
            }
            catch(InterruptedException ex)
            {
                System.out.println(ex);
            }
            System.out.println("number in t1---" +i);
                        
        }
    }
    
}