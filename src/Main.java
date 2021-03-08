public class Main {

    public static void main(String[] args){
      boolean hasHighIncome = false;
      boolean haGoodCredit = true;
      boolean hasCriminalRecord = false;
      boolean isEligible = (hasHighIncome || haGoodCredit) && !hasCriminalRecord;
        System.out.println(isEligible);
    }
}
