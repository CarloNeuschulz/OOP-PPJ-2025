package banking.account;
// Girokonto

import static banking.account.BankAccount.AccountType; // Importiert irgendwie die Art des Kontos von BankAccount

/**
 * This class models a check account implementing banking.accounts.BankAccount.
 *
 * @see BaseBankAccount
 *
 */
public class CheckingAccount implements BankAccount {
    // TODO:

    private final BaseBankAccount baseBankAccount;

    /**
     * Creates a new checking bank account for the given customer.
     *
     * @param accountNumber the account number
     * @param owner the owner of the account
     * @param pin the pin for the account
     */
    public CheckingAccount(int accountNumber, Customer owner, int pin) {
        // TODO:
        this.baseBankAccount = new BaseBankAccount(accountNumber, owner, pin);
    }

    @Override
    public final AccountType getAccountType() {
        // TODO:
        return AccountType.Checking;
    }

    @Override
    public final void closeAccount() {
        // TODO:
        double balance =  baseBankAccount.getBalance();
        if (balance > 0) {
            baseBankAccount.withdrawMoney(balance);
        }
    }

    @Override
    public boolean validatePin(int pin) {
        // TODO:
        return false;
    }

    @Override
    public Customer getOwner() {
        // TODO:
        return null;
    }

    @Override
    public int getAccountNumber() {
        // TODO:
        return 0;
    }

    @Override
    public double getBalance() {
        // TODO:
        return 0;
    }

    @Override
    public void withdrawMoney(double money) {
        // TODO:
    }

    @Override
    public void depositMoney(double money) {
        // TODO:
    }

    @Override
    public final String getAccountInformation(){
        // TODO:
        return null;
    }
}