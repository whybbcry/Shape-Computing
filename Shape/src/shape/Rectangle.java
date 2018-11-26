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

public class Rectangle extends Shape {

    private Point topLeft;
    private double length;
    private double width;

    public Rectangle(double x, double y, double length, double width) {
        super("Rectangle");
        this.topLeft = new Point(x, y);
        this.length = length;
        this.width = width;
    }

    public Rectangle(double x, double y, double length, double width, String name) {
        super(name);
        this.topLeft = new Point(x, y);
        this.length = length;
        this.width = width;
    }

    @Override
    public double getArea() {
        return length * width;
    }

    public Point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(Point topLeft) {
        this.topLeft = topLeft;
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    @Override
    public String toString() {
        return "Rectangle{" + "TopLeft=" + topLeft + ", Length=" + length + ", Width=" + width + '}';
    }
}

