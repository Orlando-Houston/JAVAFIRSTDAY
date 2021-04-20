package march_22_createClassess;

public class BanksTests {
    public static void main(String[] args) {
        Bank myBank = new Bank(112312,"saving",350);
        Loan myLoan = new Loan(213213,"new loan",4000,1.05,60,30000);
        Loan myCarLoan = new CarLoan(111,"car",3000,1.04,72,400000,1.08,850);
        System.out.println(myCarLoan.calculateMonthlyPayment());
        Loan myHomeLoan = new HomeLoan(123,"home",900000,1.9,300,60000,12000);
    }

}
