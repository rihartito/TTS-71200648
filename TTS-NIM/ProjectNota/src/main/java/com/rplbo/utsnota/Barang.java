package com.rplbo.utsnota;

public class Barang {
    private String deskripsi;
    private String kodeBarang;
    private  int harga;
    private int berat;

    public Barang(String deskripsi, int harga, int berat, String kodeBarang, String merk){
        this.deskripsi =deskripsi;
        this.harga =harga;
        this.berat = berat;
        this.kodeBarang =kodeBarang;


    }

    public Barang(String kode, int harga, int berat, String deskripsi, int gram) {
    }

    public int getBerat() {
        return berat;
    }

    public int getHarga() {
        return harga;
    }

    public String getDeskripsi() {
        return deskripsi;
    }

    public String getKodeBarang() {
        return kodeBarang;
    }

    public void setBerat(int berat) {
        this.berat = berat;
    }

    public void setDeskripsi(String deskripsi) {
        this.deskripsi = deskripsi;
    }

    public void setHarga(int harga) {
        this.harga = harga;
    }

    public void setKodeBarang(String kodeBarang) {
        this.kodeBarang = kodeBarang;
    }
    public void getInformasi(){
        getDeskripsi();
        getKodeBarang();
        getHarga();
        getBerat();
    }
}
