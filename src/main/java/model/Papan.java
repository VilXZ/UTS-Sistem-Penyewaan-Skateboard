/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kidst
 */
public class Papan {
    private String idPapan;
    private String namaPapan;
    private String jenis;
    private double hargaSewa;
    private boolean tersedia;

    public Papan(String idPapan, String namaPapan, String jenis, double hargaSewa) {
        this.idPapan = idPapan;
        this.namaPapan = namaPapan;
        this.jenis = jenis;
        this.hargaSewa = hargaSewa;
        this.tersedia = true;
    }

    public String getIdPapan() {
        return idPapan;
    }

    public String getNamaPapan() {
        return namaPapan;
    }

    public String getJenis() {
        return jenis;
    }

    public double getHargaSewa() {
        return hargaSewa;
    }

    public boolean isTersedia() {
        return tersedia;
    }

    public void setTersedia(boolean tersedia) {
        this.tersedia = tersedia;
    }

    public void tampilkanInfo() {
        System.out.println("ID         : " + idPapan);
        System.out.println("Nama       : " + namaPapan);
        System.out.println("Jenis      : " + jenis);
        System.out.println("Harga/Jam  : Rp" + hargaSewa);

        if (tersedia) {
            System.out.println("Status     : Tersedia ");
        } else {
            System.out.println("Status     : Disewa ");
        }
    }
}

