public class Test {
    public static void main(String[] args) {
        BankAccount stephsAccount = new BankAccount();
        stephsAccount.deposit(500, "savings");
        System.out.println(stephsAccount.getSavingsBalance());

        stephsAccount.withdrawal(200, "savings");
        System.out.println(stephsAccount.getSavingsBalance());
    }
}
