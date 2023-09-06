package conditionals3;

public class Conditionals3 {

    public static void main(String[] args) {
        int marks = 32;
        if (marks < 50){
            System.out.println("You failed");
        }
        else if (marks >= 50 && marks < 70){
            System.out.println("Your grade is D");
        }
        else if (marks >= 60 && marks < 70){
            System.out.println("Your grade is C");
        }
        else if (marks >= 70 && marks < 70){
            System.out.println("Your grade is B");
        }
        else if (marks >= 80 && marks < 90){
            System.out.println("Your grade is A");
        }
        else if (marks >= 90 && marks < 100){
            System.out.println("Your grade is A+");
        } else {
            System.out.println("Invalid");
        }
    }
    
}
