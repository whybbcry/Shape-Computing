/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package miscLib;

/**
 *
 * @author whybbcry
 */
public abstract class GenLib {
    public static int genInt(int start, int end) {
		if (start > end) {
			int temp = start;
			start = end;
			end = temp;
		}
		return ( (int)(Math.random() * (end - start + 1)) + start );
	}
}
