package banking.account;
// Girokonto

/**
 * This class models a check account implementing banking.accounts.BankAccount.
 *
 * @see BaseBankAccount
 *
 */
public class CheckingAccount implements BankAccount, Customer {
    // TODO:
    private int accountNumber;
    private Customer owner; 
    private int pin;

    /**
     * Creates a new checking bank account for the given customer.
     *
     * @param accountNumber the account number
     * @param owner the owner of the account
     * @param pin the pin for the account
     */
    public CheckingAccount(int accountNumber, Customer owner, int pin) {
        // TODO:
        this.accountNumber = accountNumber;
        this.owner = owner;
        this.pin = pin;
    }

    @Override
    public final AccountType getAccountType() {
        // TODO:
        if ()
    }

    @Override
    public final void closeAccount() {
        // TODO:
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