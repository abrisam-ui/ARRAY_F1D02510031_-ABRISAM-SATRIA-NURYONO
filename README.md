Tugas Praktikum PBO - Array dan ArrayList

NIM: F1D02510031
Nama: Abrisam Satria Nuryono

Kelas: PBO - 4 Array dan ArrayList

Deskripsi Program
---
## 📌 Penggunaan Array & ArrayList pada Kode

* **Array / ArrayList**: Digunakan untuk menyimpan koleksi objek `Customer` dan `Account` secara dinamis di dalam kelas `Bank`.
* **Fungsi**: Memungkinkan penambahan data nasabah baru secara fleksibel, penelusuran daftar nasabah, serta pembaruan data transaksi secara terstruktur.

---

## 📚 Library Tambahan dalam Kode

* **`java.util.Scanner`**: Digunakan pada `Main.java` untuk membaca input interaktif dari pengguna melalui terminal/CLI.
* **`java.util.ArrayList`**: Digunakan untuk mengelola koleksi data nasabah yang jumlahnya dapat bertambah secara dinamis.

---

## 📸 Screenshot Output Program

| Menu / Fitur | Screenshot Output |
| :--- | :--- |
| **1. Inisialisasi & Tampil Nasabah** | ![Menu 1](menu%201.png) |
| **2. Tambah Nasabah Baru** | ![Menu 2](menu%202.png) |
| **3. Setor Uang (Deposit)** | ![Menu 3](menu%203.png) |
| **4. Tarik Uang (Withdraw)** | ![Menu 4](menu%204.png) |
| **5. Keluar Program** | ![Menu 5](menu%205.png) |

---

## 📁 Struktur File Repositori

```text
src/
├── Account.java   # Mengelola informasi saldo dan transaksi
├── Customer.java  # Mengelola profil nasabah
├── Bank.java      # Mengelola daftar nasabah menggunakan Array/ArrayList
└── Main.java      # Program utama dengan menu interaktif CLI