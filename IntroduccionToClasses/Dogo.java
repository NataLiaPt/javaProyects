package dogo;

public class Dogo {
    String breed;
    boolean owner;
    int age;
    
    public Dogo(String dogBreed, boolean owned, int dogAge){
        System.out.println("Constructor is here!");
        breed = dogBreed;
        owner = owned;
        age = dogAge;
        
    }

    public static void main(String[] args) {
        System.out.println("Main method has been started");
        Dogo Luna = new Dogo("Schnauzer", true, 12);
        Dogo Blue = new Dogo( "Husky", true, 5);
        int totalAge = Blue.age + Luna.age;
        boolean isBlueOlder = Blue.age > Luna.age;
        System.out.println("There are two new dogs: a " + Luna.breed + " and a " + Blue.breed);
        System.out.println("Is Bllue Older then Luna? That's " + isBlueOlder);
        System.out.println("The total age between both dogs is: " + totalAge);
        System.out.println("Main method has been finished");
    }
    
}
