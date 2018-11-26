/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stacklab;

/**
 *
 * @author Stanley Kwok 187100835
 */

import java.util.EmptyStackException;

public class ListStackComp  {

	private LinkedList list;	// compose with a LinkedList object

    public ListStackComp() {   // <== constructor, different from ListStack.java
		list = new LinkedList();
    }

	public boolean empty() {
		return list.isEmpty();
	}

	public Object push(Object item) {
		list.addToTail(item);
                return item;
	}

	public Object pop() {
		return list.removeFromTail();
	}

	public Object peek() {
		return list.head.getData();
	}

	public int search(Object item) {
            int count = 0;
            
        if (empty()) {
            return -1;
        } else {
            ListNode curr = list.head;
              if (item.equals(curr.getData())) {
                return list.length;
            } else {
                while (curr.getNext() != null) {
                    curr = curr.getNext();
                    count++;
                    if (item.equals(curr.getData())) {
                        return list.length - count;
                    }
                }
            }
            return -1;
        }
    }
        
	public String toString() {
		return list.toString();
	}

}