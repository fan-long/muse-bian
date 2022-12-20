package org.museframework.bian.leasing.dto;

public class InitiateLienResponse {
    private org.museframework.bian.leasing.dto.bq.Lien lien;

    public void setLien(org.museframework.bian.leasing.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.leasing.dto.bq.Lien getLien() {
        return lien;
    }
}