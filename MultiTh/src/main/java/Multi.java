/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
public class Multi {
    
    public static void main(String[] args) {
        System.out.println("I am in main thread");
        
        M m = new M();
        //m.run();
        System.out.println(Thread.currentThread().getName());
        m.start();
    }
}

class M extends Thread
{

    @Override
    public void run() {
        super.run(); //To change body of generated methods, choose Tools | Templates.
        System.out.println("I am in thread 1");
        System.out.println(Thread.currentThread().getName());
        
    }
    
}