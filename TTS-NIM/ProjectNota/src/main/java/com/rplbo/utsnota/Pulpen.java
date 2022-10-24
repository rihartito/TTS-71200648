package com.rplbo.utsnota;

public class Pulpen extends Barang {
    private String warna;
    public Pulpen(String deskripsi, int harga, int berat, String kodeBarang, String warna, String warna1) {
        super(deskripsi, harga, berat, kodeBarang, warna);
        this.warna = warna;
    }

    public Pulpen(String kode, int harga, int berat, String deskripsi, String warna) {
        super(kode,harga,berat,deskripsi,warna);
    }

    public String getWarna() {
        return warna;
    }

    public void setWarna(String warna) {
        this.warna = warna;
    }

    @Override
    public void getInformasi() {
        super.getInformasi();
    }

}
