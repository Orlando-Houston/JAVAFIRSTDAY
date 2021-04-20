package march_22_createClassess;

public class CarLoan  extends Loan{
    double APR;
    int creditScore;

    public CarLoan(int accNumber, String accName, double bal, double intRate, int numPayment, double amount, double APR, int creditScore) {
        super(accNumber, accName, bal, intRate, numPayment, amount);
        this.APR = APR;
        this.creditScore = creditScore;
    }
    public double calculateMonthlyPayment(){
        double monthly=super.loanAmount*this.APR/super.numberOfPayment-(this.creditScore/10);
        return monthly;
    }
}
