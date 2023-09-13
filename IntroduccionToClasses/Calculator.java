package calculator;

public class Calculator {
    public Calculator(){
        
    }
    
    public int add(int a, int b) {
        return a + b;
    }
    
    public int substract (int a, int b) {
        return a - b;
    }
    public int multiply(int a, int b) {
        return a*b;
    }
    
    public int divide(int a, int b) {
        return a/b;
    }
    public int module (int a, int b) {
        return a%b;
    }
    public static void main(String[] args) {
        Calculator c = new Calculator();
        System.out.println(c.add(7,2));
        System.out.println(c.substract(14,13));
        System.out.println(c.multiply(10,3));
        System.out.println(c.divide(50, 5));
        System.out.println("The module of 81/9 is: " + c.module(81, 9));
    }
    
}
