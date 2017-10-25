//import java.util.Random;

/**
 * Class implementing a bank account.
 * <p>
 * Complete and document this class as part of Lab 8.
 *
 * @see <a href="https://cs125.cs.illinois.edu/lab/8/">Lab 8 Description</a>
 */
public class BankAccount {

    /** Type of account.  */
    public enum BankAccountType {
        /** Checking account. */
        CHECKING,
        /** Savings account. */
        SAVINGS,
        /** Student account. */
        STUDENT,
        /** Workplace account. */
        WORKPLACE
    }
    /** Account number. */
    private int accountNumber;

    /** Type of account. */
    private BankAccountType accountType;

    /** Account balance. */
    private double accountBalance;

    /** Name of owner. */
    private String ownerName;

    /** interest rate. */
    private double interestRate;

    /** earned interest. */
    private double interestEarned;

    /** Bank account constructor.
     *  @param name of owner
     *  @param accountCategory account type.
     */
    public BankAccount(final String name, final BankAccountType accountCategory) {
        this.ownerName = name;
        this.accountType = accountCategory;
        Bank.setTotalAccounts(Bank.getTotalAccounts() + 1);
    }

    /** accountNumber accessor.
     *  @return accountNumber
     */
    public int getAccountNumber() {
        return this.accountNumber;
    }
    /** accountType accessor.
     * @return accountType
     */
    public BankAccountType getAccountType() {
        return this.accountType;
    }
    /** accountType setter.
     * @param type BankAccountType to change accountType to
     */
    public void setAccountType(final BankAccountType type) {
        this.accountType = type;
    }
    /** accountBalance accessor.
     *  @return balance
     */
    public double getAccountBalance() {
        return this.accountBalance;
    }
    /** deposit to account.
     * @param d amount to deposit
     */
    public void deposit(final double d) {
        this.accountBalance += d;
    }
    /** withdrawal from account.
     *  @param d amount to withdrawal
     */
    public void withdraw(final double d) {
        this.accountBalance -= d;
    }

    /** ownerName accessor.
     * @return ownerName
     */
    public String getOwner() {
        return this.ownerName;
    }
    /** ownerName setter.
     * @param name to set ownerName to
     */
    public void setOwnerName(final String name) {
        this.ownerName = name;
    }
    /** interestRate accessor.
     * @return interestRate
     */
    public double getInterestRate() {
        return this.interestRate;
    }
    /** interestRate setter.
     * @param rate to set interestRate to
     */
    public void setInterestRate(final double rate) {
        this.interestRate = rate;
    }

    /** interestEarned accessor.
     * @return interestEarned
     */
    public double getInterestearned() {
        return this.interestEarned;
    }
}
