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

//Q6

import java.util.Stack;
import java.util.Iterator;

public class TestStack {
	public static void main (String args[]) {
		Stack s = new Stack();				// <== comment this for Q1 and Q2
		//ListStack s = new ListStack();  // <== uncomment this for Q1
		//ListStackComp s = new ListStackComp();	// <== uncomment this for Q2

		System.out.println(s);

		System.out.println("Patrick is at " + s.search("Patrick"));

		s.push(new Character('A'));
		System.out.println(s);
		s.push(new Character('B'));
		System.out.println(s);
		s.push("Cat");
		System.out.println(s);
		s.push("Dog");
		System.out.println(s);
		s.push(new Integer(123));
		System.out.println(s);
		s.push("Patrick");
		System.out.println(s);
		s.push(new Character('E'));
		System.out.println(s);
		s.push(new Double(789.123));
		System.out.println(s);

		System.out.println("peek() returns: " + s.peek());

		System.out.println("Patrick is at " + s.search("Patrick"));
		System.out.println("A is at " + s.search(new Character('A')));
		System.out.println("789.123 is at " + s.search(new Double(789.123)));
		System.out.println("Peter is at " + s.search("Peter"));
		System.out.println();
	}
}