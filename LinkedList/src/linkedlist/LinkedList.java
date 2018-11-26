/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package linkedlist;

/**
 *
 * @author Stanley Kwok 187100835
 */
class ListNode {
        //Q5
        //INFORMATION OF HIDDING 
        //CHANGE data AND next INTO PRIVATE
	private Object data;
	private ListNode next;

	public ListNode(Object o) { 
            data = o; 
            next = null; 
        }
        
	public ListNode(Object o, ListNode nextNode){
            data = o; 
            next = nextNode; 
        }

	public Object getData() {
            return data;
        }
        
	public void setData(Object o) {
            data = o;
        }

	public ListNode getNext() { 
            return next; 
        }
        
	public void setNext(ListNode next) {
            this.next = next;
        }
}

class EmptyListException extends RuntimeException {
	public EmptyListException ()
		{ super("List is empty"); }
}

public class LinkedList {
	protected ListNode head;   // <== chnage to protected for inheriting
	protected ListNode tail;      // <== change to protected for inheriting
	protected  int length;		// the length of the list   <== chnage to protected for inheriting

	public LinkedList() {
		head = tail = null;
		length = 0;
	}

	public boolean isEmpty() { 
            return head == null; 
        }

	public void addToHead(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else
			head = new ListNode(item, head);
		length++;
	}

	public void addToTail(Object item) {
		if (isEmpty())
			head = tail = new ListNode(item);
		else {
			tail.setNext(new ListNode(item));
			tail = tail.getNext();
		}
		length++;
	}

	public Object removeFromHead() throws EmptyListException {
		Object item = null;
                
		if (isEmpty())
			throw new EmptyListException();
		item = head.getData();
		if (head == tail)
			head = tail = null;
		else
			head = head.getNext();
		length--;
		return item;
	}

	public Object removeFromTail() throws EmptyListException {
		Object item = null;
                
		if (isEmpty())
			throw new EmptyListException();
		item = tail.getData();
		if (head == tail)
			head = tail = null;
		else {
			ListNode current = head;
			while (current.getNext() != tail)
				current = current.getNext();
			tail = current;
			current.setNext(null);
		}
		length--;
		return item;
	}

	public String toString() {
		String str = "[ ";
		ListNode now = head;
                
		while (now != null) {
			str = str + now.getData() + " ";
			now = now.getNext();
		}
		return str + " ]";
	}
}

