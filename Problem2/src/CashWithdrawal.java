public class CashWithdrawal {
    public static void main(String[] args) {
        AuthorizationHandler cashier = new Cashier();
        AuthorizationHandler seniorOfficer = new SeniorOfficer();
        AuthorizationHandler manager = new Manager();

        // Create the chain of responsibility
        cashier.setNextHandler(seniorOfficer);
        seniorOfficer.setNextHandler(manager);

        // Request to withdraw money with different amounts
        cashier.authorize(10000);
        cashier.authorize(25000);
        cashier.authorize(150000);
        cashier.authorize(5000000);
    }
}