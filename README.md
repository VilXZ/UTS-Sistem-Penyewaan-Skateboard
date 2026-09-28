# Sistem Penyewaan Skateboard

## 1. Identitas Mahasiswa

* **Nama:** Dzulrrahim Oscar Aditya Akbar
* **NIM:** 2509116107
* **Mata Kuliah:** Pemrograman Berorientasi Objek

## 2. Studi Kasus

Program ini merupakan aplikasi CLI untuk mengelola penyewaan skateboard. Pengguna dapat melihat daftar papan, melakukan penyewaan, melihat data penyewaan, dan mengembalikan papan.

Program memiliki beberapa fitur, yaitu:

* Melihat daftar papan
* Menyewa papan
* Melihat data penyewaan
* Mengembalikan papan

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

## 5. Penerapan Polymorphism

Polymorphism diterapkan menggunakan Method Overriding pada method tampilkanInfo().

Pada class `Longboard`:

<img width="488" height="131" alt="image" src="https://github.com/user-attachments/assets/b58655b0-55e5-4626-9510-152dde83db7f" />

Pada class `Skateboard`:

<img width="479" height="129" alt="image" src="https://github.com/user-attachments/assets/91078c40-f5f3-4671-be98-2eb9d9299122" />

Method tersebut memiliki nama yang sama dengan method pada class Papan, tetapi memiliki implementasi yang berbeda pada masing-masing subclass.

Pemanggilannya dilakukan melalui:

<img width="346" height="73" alt="image" src="https://github.com/user-attachments/assets/1750a9bd-28b9-4718-a734-770e94b5faa8" />

##6. Conditioning dan Looping

Program menggunakan if-else untuk menentukan pilihan menu dan memeriksa kondisi papan.

Contoh:

Program juga menggunakan looping untuk menjalankan menu dan menampilkan data.

Contoh `do-while`:

<img width="716" height="854" alt="image" src="https://github.com/user-attachments/assets/187572a1-0493-41fd-b2fb-1afb86cc1d3d" />

Contoh `for`:

<img width="346" height="73" alt="image" src="https://github.com/user-attachments/assets/1750a9bd-28b9-4718-a734-770e94b5faa8" />

## 7. Screenshot Program

### Menu Utama

<img width="318" height="185" alt="image" src="https://github.com/user-attachments/assets/00797647-bdeb-4891-ad63-c1a356ea108c" />

### Daftar Papan

<img width="476" height="922" alt="image" src="https://github.com/user-attachments/assets/d3aa36dd-76f1-4f65-863c-20d41631cb0e" />

### Penyewaan

<img width="464" height="653" alt="image" src="https://github.com/user-attachments/assets/f8ed46db-5d1a-4ae9-b6fa-8ad865d615c3" />

### Pengembalian

<img width="340" height="375" alt="image" src="https://github.com/user-attachments/assets/ad77b2f5-0036-4431-b9a1-43a24f9e0466" />
