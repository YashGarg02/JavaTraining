
import java.util.ArrayDeque;
import java.util.Deque;
import java.util.PriorityQueue;
import java.util.Queue;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author yashgarg
 */
public class ArrDQBook {
    public static void main(String[] args) {
        Deque<Books> q = new ArrayDeque<>();
    
        Books b1 = new Books(201,"title1","author1","publisher1",7);
        Books b2 = new Books(131,"title2","author2","publisher2",17);
        Books b3 = new Books(141,"title3","author3","publisher3",3);
        Books b4 = new Books(156,"title4","author4","publisher4",86);
        Books b5 = new Books(173,"title5","author5","publisher5",82);
        
        q.add(b1);
        q.add(b2);
        q.add(b3);
        q.add(b4);
        q.add(b5);
        
        System.out.println("Traversing elements in the queue-");
        for(Books b:q){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
       
    }
}

class Books {
    int id, quantity;
    String name, author, publisher;
    
    public Books(int id, String name, String author, String publisher, int quantity){
        this.id=id;
        this.name=name;
        this.author=author;
        this.publisher=publisher;
        this.quantity=quantity;
    }
    public int compareTo(Book b){
        if(id>b.id){
            return 1;
        }
        else if (id<b.id){
            return -1;
        }else{
        
        return 0;
        }
    }
}    

