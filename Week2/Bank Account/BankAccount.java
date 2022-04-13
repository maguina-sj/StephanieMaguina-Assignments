public class BankAccount {
    private double checkingBalance = 0;
    private double savingsBalance = 0;
    public static int numOfAccounts = 0;
    public static double totalMoney = 0;

    public BankAccount() {
        BankAccount.numOfAccounts += 1;
        this.checkingBalance = 0;
        this.savingsBalance = 0;
    }
    public double getCheckingBalance() {
        return this.checkingBalance;
    }
    public double getSavingsBalance() {
        return this.savingsBalance;
    }
    public static double getTotalMoney() {
        return totalMoney;
    }
    public void deposit(double amount, String accountType) {
        if (accountType == "checking") {
            this.checkingBalance += amount;
            totalMoney += amount;
        }
        else if(accountType == "savings") {
            this.savingsBalance += amount;
            totalMoney += amount;
        }
        else {
            System.out.println("specify which account please");
        }
    }
    public void withdrawal (double amount, String accountType) {
        if (accountType == "checking") {
            if (amount > this.checkingBalance) {
                System.out.println("Insufficient funds");
                return;
            }
            else {
            checkingBalance -= amount; 
            totalMoney -= amount;
        }
        }
        else if(accountType == "savings"){
            if (amount > this.savingsBalance) {
                System.out.println("Insufficient funds");
                return;
            }
            else {
            savingsBalance -= amount;
            totalMoney -= amount;
        }
        }
        else {
            System.out.println("specify which account please");
        }
        }
    }
