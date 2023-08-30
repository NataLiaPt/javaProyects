package relationaloperator3;

public class RelationalOperator3 {

    public static void main(String[] args) {
        double waterRecommended = 8;
        double challengeDays = 30;
        double waterConsumed = 235.5;
        double totalRecomended = waterRecommended * challengeDays;
        boolean challengeComplete = waterConsumed >= totalRecomended;
        System.out.println(challengeComplete);
    }
    
}
