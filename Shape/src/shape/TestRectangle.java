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

public class TestRectangle {
   public static void main(String[] args) {

      Rectangle rectangle;

      //X, Y, LENGTH, WIDTH
      rectangle = new Rectangle( 7.5, 2, 18 , 11);

      //PRINT TOPLEFT, LENGTH, WIDTH
      System.out.println(rectangle.getName() +  ": " + rectangle.toString());
      
      //AREA
      System.out.println("Area = " + rectangle.getArea());
   }
}
