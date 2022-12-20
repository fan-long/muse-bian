package org.museframework.bian.merchandisingloan.dto;

public class RetrieveDepositsRequest {
    private String merchandisingloanid;

    private String depositsid;

    public void setMerchandisingloanid(String merchandisingloanid) {
        this.merchandisingloanid = merchandisingloanid;
    }

    public String getMerchandisingloanid() {
        return merchandisingloanid;
    }

    public void setDepositsid(String depositsid) {
        this.depositsid = depositsid;
    }

    public String getDepositsid() {
        return depositsid;
    }
}