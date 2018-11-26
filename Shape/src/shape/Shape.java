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
public abstract class Shape {

   String name;

   public Shape(String n) {
      name = new String(n);
   }

   public abstract double getArea();

   public String getName() {
       return name;
   }

}