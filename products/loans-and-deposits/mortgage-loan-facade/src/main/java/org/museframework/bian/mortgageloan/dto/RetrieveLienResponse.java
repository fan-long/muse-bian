package org.museframework.bian.mortgageloan.dto;

public class RetrieveLienResponse {
    private org.museframework.bian.mortgageloan.dto.bq.Lien lien;

    public void setLien(org.museframework.bian.mortgageloan.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.mortgageloan.dto.bq.Lien getLien() {
        return lien;
    }
}