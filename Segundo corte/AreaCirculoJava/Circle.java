import java.lang.Math;

public class Circle {

    double radius;
    double diameter;

    public Circle(double diameter) {
        this.radius = diameter / 2;
    }
    public double calcArea(){
        return Math.PI * Math.pow(this.radius, 2);
    }
    public double calcPerimeter(){
        return Math.PI * 2 * this.radius;
    }
}