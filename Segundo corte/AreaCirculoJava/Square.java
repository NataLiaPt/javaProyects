import java.lang.Math;

public class Square {
    
    double side;

    public Square(double side){
        this.side = side;
    }
    public double sPerimeter(){
        return 4 * this.side;
    }
    public double sArea(){
        return Math.pow(this.side, 2);
    }
}
