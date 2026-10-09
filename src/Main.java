public class Main {
    public static void main(String[] args) {
        Bank bank = new Bank();

        bank.addCustomer("John", "Doe");
        bank.addCustomer("Jane", "Smith");

        Customer customer1 = bank.getCustomer(0);
        customer1.setAccount(new Account(500000));

        customer1.getAccount().deposit(200000);
        customer1.getAccount().withdraw(150000);

        System.out.println("Jumlah Nasabah: " + bank.getNumOfCustomers());
        System.out.println("Nama Nasabah 1: " + customer1.getFirstName() + " " + customer1.getLastName());
        System.out.println("Saldo Akhir Nasabah 1: Rp " + customer1.getAccount().getBalance());
    }
}