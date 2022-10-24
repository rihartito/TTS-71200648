package com.rplbo.utsnota;

public class BukuTulis extends Barang {
    private String merk;


    public BukuTulis(String deskripsi, int harga, int berat, String kodeBarang,String merk) {
        super(deskripsi, harga, berat, kodeBarang,merk);
    }

    public void setMerk(String merk) {
        this.merk = merk;
    }

    public String getMerk() {
        return merk;
    }

    @Override
    public void getInformasi() {
        super.getInformasi();
    }
}
