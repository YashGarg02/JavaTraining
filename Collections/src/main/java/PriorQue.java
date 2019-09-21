/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
import java.util.*;

public class PriorQue {
    public static void main(String[] args) {
        PriorityQueue<String> queue = new PriorityQueue<>();
        queue.add("iPhone");
        queue.add("iPad");
        queue.add("iPod");
        queue.add("Apple Watch");
        queue.add("Apple TV");
        
        System.out.println("head : " +queue.element());
        System.out.println("head : " +queue.peek());
        System.out.println("iterating the queue elements");
        Iterator i = queue.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        queue.remove();
        queue.poll();
        System.out.println("after removing the 2 elements : ");
        
        Iterator<String> i2 = queue.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
    }
}

//Ques - on what basis is the queue being created alphabetically or as printed?