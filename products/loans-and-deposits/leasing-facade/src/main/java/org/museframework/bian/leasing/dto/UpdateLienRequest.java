package org.museframework.bian.leasing.dto;

public class UpdateLienRequest {
    private String leasingid;

    private String lienid;

    private org.museframework.bian.leasing.dto.bq.Lien lien;

    public void setLeasingid(String leasingid) {
        this.leasingid = leasingid;
    }

    public String getLeasingid() {
        return leasingid;
    }

    public void setLienid(String lienid) {
        this.lienid = lienid;
    }

    public String getLienid() {
        return lienid;
    }

    public void setLien(org.museframework.bian.leasing.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.leasing.dto.bq.Lien getLien() {
        return lien;
    }
}