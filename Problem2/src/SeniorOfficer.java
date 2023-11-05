class SeniorOfficer implements AuthorizationHandler 
{
    private AuthorizationHandler nextHandler;

    @Override
    public void authorize(int amount) {
        if (amount > 10000 && amount <= 1000000)
         {
            System.out.println("cashier and senior officer  authorizes the withdrawal.");
        } else if (nextHandler != null) 
        {
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