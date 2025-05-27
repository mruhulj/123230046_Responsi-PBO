/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Model;

/**
 *
 * @author Lab Informatika
 */
public class DataRental {
    private int idRental;
    private String nama;
    private String kontak;
    private String jenis_mobil;
    private int durasi;
    private int total_biaya;
    private String status_pembayaran;

    public int getIdRental() {
        return idRental;
    }

    public String getNama() {
        return nama;
    }

    public String getKontak() {
        return kontak;
    }

    public String getJenis_mobil() {
        return jenis_mobil;
    }

    public int getDurasi() {
        return durasi;
    }

    public int getTotal_biaya() {
        return total_biaya;
    }

    public String getStatus_pembayaran() {
        return status_pembayaran;
    }

    public void setIdRental(int idRental) {
        this.idRental = idRental;
    }

    public void setNama(String nama) {
        this.nama = nama;
    }

    public void setKontak(String kontak) {
        this.kontak = kontak;
    }

    public void setJenis_mobil(String jenis_mobil) {
        this.jenis_mobil = jenis_mobil;
    }

    public void setDurasi(int durasi) {
        this.durasi = durasi;
    }

    public void setTotal_biaya(int total_biaya) {
        this.total_biaya = total_biaya;
    }

    public void setStatus_pembayaran(String status_pembayaran) {
        this.status_pembayaran = status_pembayaran;
    }


    


}