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

public class Point {
   // the coordinates of the Point
   public double x;
   public double y;
   

   // constructor
   public Point( double a, double b ) {
       setPoint( a, b ); 
   }

   // Set x and y coordinates of Point
   public void setPoint( double a, double b )  {
      x = a;
      y = b;
   }

   // get x coordinate
   public double getX() { 
       return x; 
   }

   // get y coordinate
   public double getY() {
       return y; 
   }

   // convert the point into a String representation
   public String toString(){
       return "[" + x + ", " + y + "]"; 
   }
}