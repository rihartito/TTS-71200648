package com.rplbo.utsnota;

public class Item {
    private KertasHVS[] krhvs;
    private BukuTulis[] bktulis;
    private Pulpen[] pen;

    public Item(KertasHVS[] krhvs){

    }
    public Item(BukuTulis[] bktulis){

    }
    public Item(Pulpen[] pen){

    }
    public Item(BukuTulis[] bktulis,Pulpen[] pen){

    }
    public Item(KertasHVS[] krhvs,Pulpen[] pen){

    }
    public Item(BukuTulis[] bktulis,KertasHVS[] krhvs){

    }
    public Item(BukuTulis[] bktulis,KertasHVS[] krhvs,Pulpen[] pen){

    }

    public Pulpen[] getPen() {
        return pen;
    }

    public BukuTulis[] getBktulis() {
        return bktulis;
    }

    public KertasHVS[] getKrhvs() {
        return krhvs;
    }
}
