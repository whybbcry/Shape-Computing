/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shape;

/**
 *
 * @author Stanley Kwok 187100835
 */

public class TestCircle{
   public static void main(String[] args) {

      Circle circle;
      
      //X, Y, RADIUS
      circle = new Circle( 22, 8, 3.5 );

      //PRINT THE RESULT, CENTER AND RADIUS
      System.out.println(circle.getName() + ": " + circle.toString());
      
      //AREA
      System.out.println("Area = " + circle.getArea());
   }
}