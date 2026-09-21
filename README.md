# Sistem Penyewaan Skateboard

## 1. Identitas Mahasiswa

* **Nama:** Dzulrrahim Oscar Aditya Akbar
* **NIM:** 2509116107
* **Mata Kuliah:** Pemrograman Berorientasi Objek

## 2. Studi Kasus

Program ini merupakan aplikasi CLI untuk mengelola penyewaan skateboard. Pengguna dapat melihat daftar papan, melakukan penyewaan, melihat data penyewaan, dan mengembalikan papan.

Papan dibagi menjadi dua jenis utama, yaitu **Longboard** dan **Skateboard**.

Jenis Longboard:

* Pintail
* Twin Tip
* Cruiser Longboard

Jenis Skateboard:

* Cruiser
* Mini Cruiser
* Double Kick
* Carver

## 3. Hierarki Class

Class:

* **Papan** → superclass yang berisi data umum papan.
* **Longboard** → subclass dari Papan.
* **Skateboard** → subclass dari Papan.
* **Penyewaan** → menyimpan data transaksi penyewaan.
* **Main** → menjalankan program.

## 4. Penerapan Inheritance

Inheritance diterapkan pada class `Longboard` dan `Skateboard` yang mewarisi class `Papan`.

<img width="727" height="93" alt="image" src="https://github.com/user-attachments/assets/02550b8d-eb23-4af2-8f6f-db0cd03ac6e2" />


<img width="735" height="96" alt="image" src="https://github.com/user-attachments/assets/fc76c8e2-7fbd-4808-8272-f18f797da8bd" />


Dengan menggunakan `extends`, kedua subclass dapat menggunakan atribut dan method yang terdapat pada class `Papan`.

## 5. Screenshot Program

### Menu Utama

<img width="318" height="185" alt="image" src="https://github.com/user-attachments/assets/00797647-bdeb-4891-ad63-c1a356ea108c" />

### Daftar Papan

<img width="476" height="922" alt="image" src="https://github.com/user-attachments/assets/d3aa36dd-76f1-4f65-863c-20d41631cb0e" />

### Penyewaan

<img width="464" height="653" alt="image" src="https://github.com/user-attachments/assets/f8ed46db-5d1a-4ae9-b6fa-8ad865d615c3" />

### Pengembalian

<img width="340" height="375" alt="image" src="https://github.com/user-attachments/assets/ad77b2f5-0036-4431-b9a1-43a24f9e0466" />
