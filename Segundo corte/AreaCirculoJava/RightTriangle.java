import java.lang.Math;

public class RightTriangle {

    double base;
    double height;
    double hypotenuse;

    public RightTriangle(double base, double height){
        this.base = base;
        this.height = height;
    }
    public double tPerimeter(){
        this.hypotenuse = Math.pow(Math.pow(this.base, 2) + Math.pow(this.height, 2), 0.5);
        return this.hypotenuse + this.base + this.height;
    }
    public double tArea(){
        return (this.base * this.height)/2;
    }

    
}
