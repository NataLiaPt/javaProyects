package relationaloperetor;

public class RelationalOperetor {

    public static void main(String[] args) {
        double actualCredits = 154.3;
        double logicCredits = 3;
        double necesaryCredits = 180;
        double CreditsAfterLogic = actualCredits + logicCredits;
        System.out.println(actualCredits > necesaryCredits);
        System.out.println(necesaryCredits < CreditsAfterLogic);
    }
}
