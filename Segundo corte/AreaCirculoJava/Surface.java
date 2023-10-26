public class Surface {

    public static void main(String[] args) {
        Circle mPizza = new Circle(12);
        Circle lote = new Circle(344);

        System.out.println("Perimeter: " + mPizza.calcPerimeter());
        System.out.println("Area: " + mPizza.calcArea());

        System.out.println("Perimeter: " + lote.calcPerimeter()); 
        System.out.println("Area: " + lote.calcArea()); 
    }
}