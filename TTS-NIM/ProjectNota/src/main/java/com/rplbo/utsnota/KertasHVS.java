package com.rplbo.utsnota;

public class KertasHVS extends Barang{
    private int gram;


    public KertasHVS(String kode, int harga, int berat, String deskripsi, int gram) {
        super(kode,harga,berat,deskripsi,gram);
    }

    public void setGram(int gram) {
        this.gram = gram;
    }

    public int getGram() {
        return gram;
    }

    @Override
    public void getInformasi() {
        super.getInformasi();
    }

}
