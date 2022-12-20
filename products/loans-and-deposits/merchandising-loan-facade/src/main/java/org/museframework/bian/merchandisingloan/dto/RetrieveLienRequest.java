package org.museframework.bian.merchandisingloan.dto;

public class RetrieveLienRequest {
    private String merchandisingloanid;

    private String lienid;

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
}