package org.museframework.bian.merchandisingloan.dto;

public class ExchangeLienResponse {
    private org.museframework.bian.merchandisingloan.dto.bq.Lien lien;

    public void setLien(org.museframework.bian.merchandisingloan.dto.bq.Lien lien) {
        this.lien = lien;
    }

    public org.museframework.bian.merchandisingloan.dto.bq.Lien getLien() {
        return lien;
    }
}