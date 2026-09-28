/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kidst
 */
public class Penyewaan {
    private String idPenyewaan;
    private String namaPenyewa;
    private Papan papan;
    private int lamaSewa;
    private double totalHarga;

    public Penyewaan(String idPenyewaan, String namaPenyewa,
                     Papan papan, int lamaSewa) {

        this.idPenyewaan = idPenyewaan;
        this.namaPenyewa = namaPenyewa;
        this.papan = papan;
        this.lamaSewa = lamaSewa;

        totalHarga = papan.getHargaSewa() * lamaSewa;

        papan.setTersedia(false);
    }

    public String getIdPenyewaan() {
        return idPenyewaan;
    }

    public String getNamaPenyewa() {
        return namaPenyewa;
    }

    public Papan getPapan() {
        return papan;
    }

    public int getLamaSewa() {
        return lamaSewa;
    }

    public double getTotalHarga() {
        return totalHarga;
    }

    public void tampilkanPenyewaan() {
        System.out.println("----------------------------------------");
        System.out.println("ID Penyewaan : " + idPenyewaan);
        System.out.println("Nama Penyewa : " + namaPenyewa);
        System.out.println("Papan        : " + papan.getNamaPapan());
        System.out.println("Jenis        : " + papan.getJenis());
        System.out.println("Lama Sewa    : " + lamaSewa + " jam ");
        System.out.println("Harga/Jam    : Rp" + papan.getHargaSewa());
        System.out.println("Total Harga  : Rp" + totalHarga);
        System.out.println("----------------------------------------");
    }
}