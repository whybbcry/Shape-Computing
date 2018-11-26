package stacklab;

/**
 *
 * @author Stanley Kwok 187100835
 */
import java.util.EmptyStackException;

public class ListStack extends LinkedList {
    
    //Constructor
    public ListStack() {    
        super();
    }

    public boolean empty() {
        return super.isEmpty();
    }

    public Object push(Object item) {
        super.addToTail(item);
        return item;
    }

    public Object pop() {
        return super.removeFromTail();
    }

    public Object peek() {
        return tail.getData();
    }

    public int search(Object item) {
        int count = 0;
        if (empty()) {
            return -1;
        } else {
            ListNode curr = head;
              if (item.equals(curr.getData())) {
                return super.length;
            } else {
                while (curr.getNext() != null) {
                    curr = curr.getNext();
                    count++;
                    if (item.equals(curr.getData())) {
                        return super.length - count;
                    }
                }
            }
            return -1;
        }
    }
}
          