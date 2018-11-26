/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tree;

/**
 *
 * @author Stanley Kwok 187100835
 */

public class Question10 {
    public static void main(String [] args) {
       int data = 0;
       BinarySearchTree tree = new BinarySearchTree();
     
       System.out.println("Inserting :");
       
       int [] sequence = {2,7,9,4,1,5,3,6,0,8};
    
    for (int i = 0; i < sequence.length; i++) {
            System.out.print(sequence[i] + " ");
            tree.insert(sequence[i]);
        }

    
    System.out.println();
    //PRINT THE SEQUENCE AGAIN IN ASCENDING ORDER
    System.out.println("In ascending order:");
    tree.inorder();
    
    //DELET A NODE
    System.out.println("Delete a node:");
    tree.delete(data); // delete the last inserted
    tree.inorder();
    
   }
}
