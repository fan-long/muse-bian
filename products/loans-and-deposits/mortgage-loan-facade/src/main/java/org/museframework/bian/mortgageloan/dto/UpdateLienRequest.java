package org.museframework.bian.mortgageloan.dto;

public class UpdateLienRequest {
    private String mortgageloanid;

    private String lienid;

    private org.museframework.bian.mortgageloan.dto.bq.Lien lien;

    public void setMortgageloanid(String mortgageloanid) {
        this.mortgageloanid = mortgageloanid;
    }

    public String getMortgageloanid() {
        return mortgageloanid;
    }

    public void setLienid(String lienid) {
        this.lienid = lienid;
    }

    public String getLienid() {
        return lienid;
    }

    public void setLien(org.museframework.bian.mortgageloan.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Lien getLien() {
        return lien;
    }
}