/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queue;

/**
 *
 * @author Stanley Kwok 187100835
 */

public class Queue extends LinkedList {
    public Queue() {
        super();
    }

    public boolean empty() {
        return isEmpty();
    }

    public void enqueue(Object item) {
        addToTail(item);
    }
    
    public Object dequeue(){
        return removeFromHead();
    }
}
