package march_22_createClassess;

public class HomeLoan extends Loan{
    double PMI;

    public HomeLoan(int accNumber, String accName, double bal, double intRate, int numPayment, double amount, double PMI) {
        super(accNumber, accName, bal, intRate, numPayment, amount);
        this.PMI = PMI;
    }
    public double calculateMonthlyPayment(){
        return super.loanAmount*super.interestRate/super.numberOfPayment+this.PMI;
    }
    public double calculateTotalPayment(){
        return super.loanAmount*super.interestRate+this.PMI*super.numberOfPayment;
    }
}
