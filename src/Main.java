import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        Bank bank = new Bank();
        boolean running = true;

        while (running) {
            System.out.println("\n=== MENU UTAMA PERBANKAN ===");
            System.out.println("1. Tambah Nasabah");
            System.out.println("2. Tampilkan Daftar Nasabah");
            System.out.println("3. Setor Uang (Deposit)");
            System.out.println("4. Tarik Uang (Withdraw)");
            System.out.println("5. Keluar");
            System.out.print("Pilih menu (1-5): ");

            int pilihan = scanner.nextInt();
            scanner.nextLine(); 

            switch (pilihan) {
                case 1:
                    System.out.print("Masukkan Nama Depan: ");
                    String firstName = scanner.nextLine();
                    System.out.print("Masukkan Nama Belakang: ");
                    String lastName = scanner.nextLine();

                    bank.addCustomer(firstName, lastName);
                    int index = bank.getNumberOfCustomers() - 1;
                    
                    System.out.print("Masukkan Saldo Awal: ");
                    double saldoAwal = scanner.nextDouble();
                    bank.getCustomer(index).setAccount(new Account(saldoAwal));

                    System.out.println(">> Nasabah berhasil ditambahkan!");
                    break;

                case 2:
                    System.out.println("\n--- DAFTAR NASABAH ---");
                    int total = bank.getNumberOfCustomers();
                    if (total == 0) {
                        System.out.println("Belum ada data nasabah.");
                    } else {
                        for (int i = 0; i < total; i++) {
                            Customer c = bank.getCustomer(i);
                            double saldo = (c.getAccount() != null) ? c.getAccount().getBalance() : 0.0;
                            System.out.println((i + 1) + ". " + c.getFirstName() + " " + c.getLastName() + " | Saldo: Rp " + saldo);
                        }
                    }
                    break;

                case 3:
                    if (bank.getNumberOfCustomers() == 0) {
                        System.out.println(">> Belum ada nasabah! Tambahkan nasabah terlebih dahulu.");
                        break;
                    }
                    System.out.print("Masukkan nomor urut nasabah (1-" + bank.getNumberOfCustomers() + "): ");
                    int idxDeposit = scanner.nextInt() - 1;

                    if (idxDeposit >= 0 && idxDeposit < bank.getNumberOfCustomers()) {
                        System.out.print("Masukkan jumlah setoran: ");
                        double jumlahSetor = scanner.nextDouble();
                        Customer c = bank.getCustomer(idxDeposit);
                        if (c.getAccount() != null) {
                            c.getAccount().deposit(jumlahSetor);
                            System.out.println(">> Setoran berhasil! Saldo baru: Rp " + c.getAccount().getBalance());
                        } else {
                            System.out.println(">> Nasabah belum memiliki rekening.");
                        }
                    } else {
                        System.out.println(">> Nomor nasabah tidak valid!");
                    }
                    break;

                case 4:
                    if (bank.getNumberOfCustomers() == 0) {
                        System.out.println(">> Belum ada nasabah! Tambahkan nasabah terlebih dahulu.");
                        break;
                    }
                    System.out.print("Masukkan nomor urut nasabah (1-" + bank.getNumberOfCustomers() + "): ");
                    int idxWithdraw = scanner.nextInt() - 1;

                    if (idxWithdraw >= 0 && idxWithdraw < bank.getNumberOfCustomers()) {
                        System.out.print("Masukkan jumlah penarikan: ");
                        double jumlahTarik = scanner.nextDouble();
                        Customer c = bank.getCustomer(idxWithdraw);
                        if (c.getAccount() != null) {
                            boolean sukses = c.getAccount().withdraw(jumlahTarik);
                            if (sukses) {
                                System.out.println(">> Penarikan berhasil! Saldo tersisa: Rp " + c.getAccount().getBalance());
                            } else {
                                System.out.println(">> Gagal! Saldo tidak mencukupi.");
                            }
                        } else {
                            System.out.println(">> Nasabah belum memiliki rekening.");
                        }
                    } else {
                        System.out.println(">> Nomor nasabah tidak valid!");
                    }
                    break;

                case 5:
                    running = false;
                    System.out.println(">> Terima kasih telah menggunakan layanan perbankan.");
                    break;

                default:
                    System.out.println(">> Pilihan tidak valid. Silakan pilih 1-5.");
            }
        }
        scanner.close();
    }
}