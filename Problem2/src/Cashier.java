//  Create Concrete Handlers
class Cashier implements AuthorizationHandler 
{
    private AuthorizationHandler nextHandler;

    @Override
    public void authorize(int amount) {
        if (amount <= 10000) {
            System.out.println("Cashier authorizes the withdrawal.");
        } else if (nextHandler != null) {
            nextHandler.authorize(amount);
        } else {
            System.out.println("Authorization denied.");
        }
    }

    @Override
    public void setNextHandler(AuthorizationHandler nextHandler)
     {
        this.nextHandler = nextHandler;
    }
}
