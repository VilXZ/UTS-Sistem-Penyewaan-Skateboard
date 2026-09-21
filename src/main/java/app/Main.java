/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package app;

/**
 *
 * @author kidst
 */

import java.util.ArrayList;
import java.util.Scanner;
import model.Longboard;
import model.Papan;
import model.Penyewaan;
import model.Skateboard;

public class Main {

    static Scanner input = new Scanner(System.in);

    static ArrayList<Papan> daftarPapan = new ArrayList<>();
    static ArrayList<Penyewaan> daftarPenyewaan = new ArrayList<>();

    public static void main(String[] args) {

        isiDataAwal();

        int pilihan;

        do {
            System.out.println("\n=========================================");
            System.out.println("      SISTEM PENYEWAAN SKATEBOARD");
            System.out.println("=========================================");
            System.out.println("1. Lihat Daftar Papan");
            System.out.println("2. Sewa Papan");
            System.out.println("3. Lihat Data Penyewaan");
            System.out.println("4. Kembalikan Papan");
            System.out.println("5. Keluar");
            System.out.println("=========================================");
            System.out.print("Pilih menu : ");

            pilihan = input.nextInt();
            input.nextLine();

            switch (pilihan) {
                case 1:
                    lihatDaftarPapan();
                    break;

                case 2:
                    sewaPapan();
                    break;

                case 3:
                    lihatPenyewaan();
                    break;

                case 4:
                    kembalikanPapan();
                    break;

                case 5:
                    System.out.println("\nProgram selesai.");
                    break;

                default:
                    System.out.println("\nPilihan tidak tersedia.");
            }

        } while (pilihan != 5);

        input.close();
    }

    public static void isiDataAwal() {

        daftarPapan.add(
            new Longboard(
                "LB001",
                "Longboard Zed",
                "Pintail",
                25000
            )
        );

        daftarPapan.add(
            new Longboard(
                "LB002",
                "Longboard Rift",
                "Twin Tip",
                28000
            )
        );

        daftarPapan.add(
            new Longboard(
                "LB003",
                "Longboard Cruiser",
                "Cruiser Longboard",
                23000
            )
        );

        // Skateboard
        daftarPapan.add(
            new Skateboard(
                "SK001",
                "Skateboard Quip",
                "Cruiser",
                20000
            )
        );

        daftarPapan.add(
            new Skateboard(
                "SK002",
                "Mini Cruiser Quip",
                "Mini Cruiser",
                18000
            )
        );

        daftarPapan.add(
            new Skateboard(
                "SK003",
                "Skateboard Alameda",
                "Double Kick",
                22000
            )
        );

        daftarPapan.add(
            new Skateboard(
                "SK004",
                "Carver Board",
                "Carver",
                25000
            )
        );
    }

    public static void lihatDaftarPapan() {

        System.out.println("\n==============================================================");
        System.out.println("                    DAFTAR PAPAN");
        System.out.println("==============================================================");

        if (daftarPapan.isEmpty()) {
            System.out.println("Belum ada data papan.");
            return;
        }

        for (Papan papan : daftarPapan) {

            System.out.println("ID          : " + papan.getIdPapan());
            System.out.println("Nama        : " + papan.getNamaPapan());
            System.out.println("Jenis       : " + papan.getJenis());
            System.out.println("Harga/Jam   : Rp" + papan.getHargaSewa());
            System.out.println("Status      : "
                    + (papan.isTersedia() ? "Tersedia" : "Disewa"));

            System.out.println("--------------------------------------------------------------");
        }
    }

    public static void sewaPapan() {

        System.out.println("\n=========================================");
        System.out.println("           PENYEWAAN PAPAN");
        System.out.println("=========================================");

        System.out.print("Masukkan nama penyewa : ");
        String nama = input.nextLine();

        System.out.println("\nDaftar papan yang tersedia:");

        boolean adaPapan = false;

        for (Papan papan : daftarPapan) {

            if (papan.isTersedia()) {

                System.out.println(
                    papan.getIdPapan()
                    + " - "
                    + papan.getNamaPapan()
                    + " - "
                    + papan.getJenis()
                    + " - Rp"
                    + papan.getHargaSewa()
                    + "/jam"
                );

                adaPapan = true;
            }
        }

        if (!adaPapan) {
            System.out.println("Tidak ada papan yang tersedia.");
            return;
        }

        System.out.print("\nMasukkan ID papan : ");
        String id = input.nextLine();

        Papan papanDipilih = null;

        for (Papan papan : daftarPapan) {

            if (papan.getIdPapan().equalsIgnoreCase(id)
                    && papan.isTersedia()) {

                papanDipilih = papan;
                break;
            }
        }

        if (papanDipilih == null) {
            System.out.println("Papan tidak ditemukan atau sedang disewa.");
            return;
        }

        System.out.print("Lama sewa (jam) : ");
        int lamaSewa = input.nextInt();
        input.nextLine();

        if (lamaSewa <= 0) {
            System.out.println("Lama sewa harus lebih dari 0 jam.");
            return;
        }

        String idPenyewaan = "TRX" + (daftarPenyewaan.size() + 1);

        Penyewaan penyewaan = new Penyewaan(
            idPenyewaan,
            nama,
            papanDipilih,
            lamaSewa
        );

        daftarPenyewaan.add(penyewaan);

        System.out.println("\nPenyewaan berhasil!");
        penyewaan.tampilkanPenyewaan();
    }

    public static void lihatPenyewaan() {

        System.out.println("\n=========================================");
        System.out.println("          DATA PENYEWAAN");
        System.out.println("=========================================");

        if (daftarPenyewaan.isEmpty()) {
            System.out.println("Belum ada data penyewaan.");
            return;
        }

        for (Penyewaan penyewaan : daftarPenyewaan) {
            penyewaan.tampilkanPenyewaan();
        }
    }

    public static void kembalikanPapan() {

        System.out.println("\n=========================================");
        System.out.println("          PENGEMBALIAN PAPAN");
        System.out.println("=========================================");

        if (daftarPenyewaan.isEmpty()) {
            System.out.println("Belum ada data penyewaan.");
            return;
        }

        System.out.println("Daftar penyewaan:");

        for (Penyewaan penyewaan : daftarPenyewaan) {

            System.out.println(
                penyewaan.getIdPenyewaan()
                + " - "
                + penyewaan.getNamaPenyewa()
                + " - "
                + penyewaan.getPapan().getNamaPapan()
            );
        }

        System.out.print("\nMasukkan ID penyewaan : ");
        String id = input.nextLine();

        Penyewaan transaksiDitemukan = null;

        for (Penyewaan penyewaan : daftarPenyewaan) {

            if (penyewaan.getIdPenyewaan().equalsIgnoreCase(id)) {

                transaksiDitemukan = penyewaan;
                break;
            }
        }

        if (transaksiDitemukan == null) {
            System.out.println("Data penyewaan tidak ditemukan.");
            return;
        }

        transaksiDitemukan.getPapan().setTersedia(true);

        daftarPenyewaan.remove(transaksiDitemukan);

        System.out.println("\nPapan berhasil dikembalikan.");
        System.out.println(
            "Papan "
            + transaksiDitemukan.getPapan().getNamaPapan()
            + " sekarang tersedia."
        );
    }
}
