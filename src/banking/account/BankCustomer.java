package banking.account;

/**
 * This class implements a simple bank customer.
 *  It uses various Parameters like @param name @param lastname @param birthday @param adress @param customerNumber
 *  So that the customer may change his banking information using various methodes 
 *
 */
public class BankCustomer implements Customer {
    // TODO:

    private String firstname; 
    private String lastname; 
    private  String birthday; 
    private String address;
    private int customerNumber;

    /**
     * Constructor to create a finance.banking.account.BankCustomer.
     *
     * @param firstname      the firstname of the customer
     * @param lastname       the last name of the customer
     * @param birthday       the birthday
     * @param address        the address
     */
    public BankCustomer(String firstname, String lastname, String birthday, String address) {
        // TODO:
        this.firstname = firstname;
        this.lastname = lastname;
        this.birthday = birthday;
        this.address = address;
        this.customerNumber = 0; // set by default until the bank or the customer changes his account number 
    }

    /**
     * Returns the last name of this customer
     * 
     * @return the last name of this customer
     */
    @Override
    public String getLastname() {
        // TODO:
        return lastname;
    }

    /**
     * Returns the Customer-Number of this customer
     * 
     * @return the Customer-Number of this customer
     */
    @Override
    public int getCustomerNumber() {
        // TODO:
        return customerNumber;
    }

    /**
     * Returns the first name of this customer.
     *
     * @return the first name of this customer
     */
    public String getName() {
        // TODO:
        return firstname;
    }

    /**
     * Returns the date of birth of this customer as string.
     *
     * @return the date of birth
     */
    public String getBirthday() {
        // TODO:
        return birthday;
    }

    /**
     * Returns the address of this customer.
     *
     * @return the address of this customer
     */
    public String getAddress() {
        // TODO:
        return address;
    }

    /**
     * Sets the customer number for this customer
     *
     * @param customerNumber the new customer number
     * @exception String s tells the user to use a valid customer number
     */
    public void setCustomerNumber(int customerNumber) {
        // TODO:
        if (customerNumber < 0) { // the customer number shall never be null or negeativ 
            throw new IllegalArgumentException("<customerNumber> shall not be negativ or null");
        }

        this.customerNumber = customerNumber;
    }

    /**
     * Sets the last name of this customer.
     *
     * @param lastname the new last name
     */
    public void setLastname(String lastname) {
        // TODO:
        this.lastname = lastname;
    }

    /**
     * Sets the first name of this customer.
     *
     * @param name the new first name
     */
    public void setName(String name) {
        // TODO:
        this.firstname = name;        
    }

    /**
     * Sets the new birthday of this customer.
     *
     * @param birthday the new birthday
     */
    public void setBirthday(String birthday) {
        // TODO:
        this.birthday = birthday;
    }

    /**
     * Sets the new address of this customer.
     *
     * @param address the new address
     */
    public void setAddress(String address) {
        // TODO:
        this.address = address; 
    }
}
