public class Customer {
    private final String firstName;
    private final String lastName;
    private Account account;

    public Customer(String f, String l) {
        this.firstName = f;
        this.lastName = l;
    }

    public String getFirstName() {
        return firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setAccount(Account acct) {
        this.account = acct;
    }

    public Account getAccount() {
        return account;
    }
}