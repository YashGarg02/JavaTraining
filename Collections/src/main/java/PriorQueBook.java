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

public class PriorQueBook {
    public static void main(String[] args) {
        Queue<Book> q = new PriorityQueue<>();
    
        Book b1 = new Book(201,"title1","author1","publisher1",7);
        Book b2 = new Book(131,"title2","author2","publisher2",17);
        Book b3 = new Book(141,"title3","author3","publisher3",3);
        Book b4 = new Book(156,"title4","author4","publisher4",86);
        Book b5 = new Book(173,"title5","author5","publisher5",82);
        
        q.add(b1);
        q.add(b2);
        q.add(b3);
        q.add(b4);
        q.add(b5);
        
        System.out.println("Traversing elements in the queue-");
        for(Book b:q){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
        q.remove();
        System.out.println("after removing one book from the record :");
        for(Book b:q){
            System.out.println(b.id+" "+b.name+" "+b.author+" "+b.publisher+" "+b.quantity);
        }
    }
}

class Book implements Comparable<Book>{
    int id, quantity;
    String name, author, publisher;
    
    public Book(int id, String name, String author, String publisher, int quantity){
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

//same ques