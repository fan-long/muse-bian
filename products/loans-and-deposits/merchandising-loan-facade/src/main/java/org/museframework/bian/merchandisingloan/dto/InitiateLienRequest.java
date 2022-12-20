package org.museframework.bian.merchandisingloan.dto;

public class InitiateLienRequest {
    private String merchandisingloanid;

    private String lienid;

    private org.museframework.bian.merchandisingloan.dto.bq.Lien lien;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setLienid(String lienid) {
        this.lienid = lienid;
    }

    public String getLienid() {
        return lienid;
    }

    public void setLien(org.museframework.bian.merchandisingloan.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Lien getLien() {
        return lien;
    }
}