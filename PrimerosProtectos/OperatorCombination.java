package operatorcombination;

public class OperatorCombination {

    public static void main(String[] args) {
        
        int numCandies = 17;
        System.out.println("Welcome to the candy store, there are " + numCandies + " candies on your cart");
        
        numCandies -= 3;
        System.out.println("Now your amount of candies is " + numCandies);
        
        numCandies /= 2;
        System.out.println("You have two bags with " + numCandies + " candies each.");
        
        numCandies *= 3;
        System.out.println("Each candy costs 3$, the total price is " + numCandies + "$");
        
    }
    
}
