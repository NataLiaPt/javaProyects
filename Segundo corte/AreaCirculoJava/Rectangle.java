public class Rectangle {
    double base;
    double height;

    public Rectangle (double base, double height){
        this.base = base;
        this.height = height;
    }
    public double rPerimeter(){
        return 2* (this.base + this.height);
    }
    public double rArea(){
        return this.base * this.height;
    }
    
}
