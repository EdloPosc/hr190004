package com.hr190004.hr190004_mucahit_burak_yalcintepe_but.model;

import com.google.gson.annotations.Expose;
import com.google.gson.annotations.SerializedName;

public class ChatModel {

    @SerializedName("KullaniciAdi")
    @Expose
    private String kullaniciAdi;
    @SerializedName("KullaniciResmi")
    @Expose
    private String kullaniciResmi;
    @SerializedName("InstagramIcon")
    @Expose
    private String instagramIcon;
    @SerializedName("WhatsappIcon")
    @Expose
    private String whatsappIcon;
    @SerializedName("KullaniciMesaj")
    @Expose
    private String kullaniciMesaj;

    public String getKullaniciAdi() {
        return kullaniciAdi;
    }

    public void setKullaniciAdi(String kullaniciAdi) {
        this.kullaniciAdi = kullaniciAdi;
    }

    public String getKullaniciResmi() {
        return kullaniciResmi;
    }

    public void setKullaniciResmi(String kullaniciResmi) {
        this.kullaniciResmi = kullaniciResmi;
    }

    public String getInstagramIcon() {
        return instagramIcon;
    }

    public void setInstagramIcon(String instagramIcon) {
        this.instagramIcon = instagramIcon;
    }

    public String getWhatsappIcon() {
        return whatsappIcon;
    }

    public void setWhatsappIcon(String whatsappIcon) {
        this.whatsappIcon = whatsappIcon;
    }

    public String getKullaniciMesaj() {
        return kullaniciMesaj;
    }

    public void setKullaniciMesaj(String kullaniciMesaj) {
        this.kullaniciMesaj = kullaniciMesaj;
    }

}