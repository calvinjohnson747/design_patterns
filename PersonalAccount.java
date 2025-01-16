/*
 * class to create a type for Factory pattern
 */

public class PersonalAccount implements BankAccount{

    @Override
    public void ValAccount() {
        System.out.print("Personal Account validated");
    }
    
}
