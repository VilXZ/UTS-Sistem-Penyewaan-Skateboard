/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package model;

/**
 *
 * @author kidst
 */
public class Longboard extends Papan {

    public Longboard(String idPapan, String namaPapan,
                     String jenis, double hargaSewa) {

        super(idPapan, namaPapan, jenis, hargaSewa);
    }

    @Override
    public void tampilkanInfo() {
        System.out.println("ID         : " + getIdPapan());
        System.out.println("Nama       : " + getNamaPapan());
        System.out.println("Jenis      : " + getJenis());
        System.out.println("Kategori   : Longboard");
        System.out.println("Harga/Jam  : Rp" + getHargaSewa());

        if (isTersedia()) {
            System.out.println("Status     : Tersedia ");
        } else {
            System.out.println("Status     : Disewa ");
        }
    }
}
