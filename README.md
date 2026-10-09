Tugas Praktikum PBO - Array dan ArrayList

Data Mahasiswa

Nama: Abrisam Satria Nuryono

NIM: F1D02510031

Kelas: PBO - 4 Array dan ArrayList

Deskripsi Program

Program ini merupakan simulasi sistem perbankan sederhana berbasis pemrograman berorientasi objek (OOP) menggunakan bahasa Java. Program terdiri dari beberapa kelas yang saling berkaitan untuk mengelola akun bank dan nasabah:

Account.java: Mengelola informasi saldo (balance), transaksi deposit (deposit), serta penarikan tunai (withdraw).

Customer.java: Mengisi data nasabah seperti nama depan, nama belakang, serta menghubungkan nasabah dengan objek Account.

Bank.java: Mengelola sekumpulan nasabah (array of Customer) serta menghitung jumlah total nasabah yang terdaftar.

Main.java: Kelas utama untuk menjalankan serta menguji seluruh fungsi dan logika program.

Struktur File

src/
├── Account.java
├── Customer.java
├── Bank.java
└── Main.java


Output Pengujian Program

Saat file Main.java dijalankan, output yang dihasilkan adalah sebagai berikut:

Jumlah Nasabah: 2
Nama Nasabah 1: John Doe
Saldo Akhir Nasabah 1: Rp 550000.0
