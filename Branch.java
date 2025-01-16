/*
 * Class to implement Factory pattern
 */

public class Branch {
    public BankAccount openAccount(String type){
        BankAccount bankAccount = null;
        if(type.equals("P")){
            bankAccount = new PersonalAccount();
        }

        bankAccount.ValAccount();
        return bankAccount;
    }

    
}
