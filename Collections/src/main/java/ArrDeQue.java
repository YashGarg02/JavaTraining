
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
public class ArrDeQue {
    public static void main(String[] args) {
        Deque<String> queue = new ArrayDeque<>();
        queue.add("iPhone");
        queue.add("iPad");
        queue.add("iPod");
        queue.add("Apple Watch");
        queue.add("Apple TV");
        
      
        Iterator i = queue.iterator();
        while(i.hasNext()){
            System.out.println(i.next());
        }
        
        
    }

}
