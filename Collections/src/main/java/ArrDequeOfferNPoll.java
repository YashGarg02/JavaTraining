
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.Iterator;
import java.util.PriorityQueue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
public class ArrDequeOfferNPoll {
   public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.add("iPhone");
        queue.add("iPad");
        queue.add("iPod");
        queue.add("Apple Watch");
        queue.offerFirst("Apple TV");
        
        System.out.println("after offerFirst Traversal");
        Iterator i = queue.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        queue.pollLast();
        
        System.out.println("after pollLast traversal");
        Iterator<String> i2 = queue.iterator();
        while(i2.hasNext()){
            System.out.println(i2.next());
        }
        
        
        
    }
} 
