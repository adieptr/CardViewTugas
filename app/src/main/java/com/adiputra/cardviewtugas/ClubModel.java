package com.adiputra.cardviewtugas;

public class ClubModel {
    private String mahas;
    private int logo;

    public ClubModel(String mahas, int logo) {
        this.mahas = mahas;
        this.logo = logo;
    }

    public String getMahas() {
        return mahas;
    }

    public void setMahas(String mahas) {
        this.mahas = mahas;
    }

    public int getLogo() {
        return logo;
    }

    public void setLogo(int logo) {
        this.logo = logo;
    }
}
