public class Bank {
    private final Customer[] customers;
    private int numberOfCustomers;

    public Bank() {
        customers = new Customer[10];
        numberOfCustomers = 0;
    }

    public Bank(Customer[] customers) {
        this.customers = customers;
    }

    public void addCustomer(String f, String l) {
        Customer newCustomer = new Customer(f, l);
        customers[numberOfCustomers] = newCustomer;
        numberOfCustomers++;
    }

    public int getNumOfCustomers() {
        return numberOfCustomers;
    }

    public Customer getCustomer(int index) {
        if (index >= 0 && index < numberOfCustomers) {
            return customers[index];
        }
        return null;
    }
}