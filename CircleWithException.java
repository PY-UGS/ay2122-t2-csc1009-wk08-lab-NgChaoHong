package Lab8;

import static java.lang.Math.*;
import java.util.Scanner;

public class CircleWithException {
    private double radius;
    private double area;
    private double diameter;

    public CircleWithException(double radius){
        this.radius = radius;
    }

    public double getRadius(){
        return this.radius;
    }

    public void setRadius(double radius){
        this.radius = radius;
    }

    public double getArea(){
        return area = PI * pow(radius, 2);
    }

    public void setArea(double area){
        this.area = area;
    }

    public double getDiameter(){
        return( 2 * Math.PI * this.radius );
    }

    public void setDiameter (double diameter) {
        this.diameter = diameter;
    }

    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        try {
            System.out.print("Input radius of the circle: ");
            double radius = input.nextDouble();
            CircleWithException circle = new CircleWithException(radius);
            double diameter = circle.getDiameter();
            double area = circle.getArea();

            if (radius <= 0){
                input.close();
                throw new IllegalArgumentException();
            }
            if (area > 1000){
                input.close();
                throw new Exception();
            }

            System.out.println("Area: " + diameter);
            System.out.println("Diameter: " + area);
            input.close();

        } catch (IllegalArgumentException e) {
            System.out.println("Value of radius cannot be negative or zero");
        } catch (Exception e){
            System.out.println("Value of area exceeded 1000");
        }
    }
}
    

