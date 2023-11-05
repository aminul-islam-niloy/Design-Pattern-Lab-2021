// Define the Handler Interface

interface AuthorizationHandler 
{
    void authorize(int amount);
    void setNextHandler(AuthorizationHandler nextHandler);
}