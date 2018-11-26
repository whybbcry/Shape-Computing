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
public class Circle extends Shape {
    public Point center;
    public double radius;

    public Circle(double x, double y, double radius) {
        super("Circle");
        this.center = new Point(x, y);
        this.radius = radius;
    }
    
    public Circle(double x, double y, double radius, String name) {
        super(name);
        this.center = new Point(x, y);
        this.radius = radius;
    }
    
    public Point getCenter() {
        return center;
    }

    public void setCenter(Point center) {
        this.center = center;
    }

    public double getRadius() {
        return radius;
    }

    public void setRadius(double radius) {
        this.radius = radius;
    }

    @Override
    public double getArea() {
        return getRadius() * getRadius() * Math.PI ;
    }

    @Override
    public String toString() {
        return "Circle{" + "Center=" + center + ", Radius=" + radius + '}';
    }

}

