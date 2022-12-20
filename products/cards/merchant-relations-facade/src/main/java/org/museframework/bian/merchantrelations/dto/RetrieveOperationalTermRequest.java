package org.museframework.bian.merchantrelations.dto;

public class RetrieveOperationalTermRequest {
    private String merchantrelationsid;

    private String operationaltermid;

    public void setMerchantrelationsid(String merchantrelationsid) {
        this.merchantrelationsid = merchantrelationsid;
    }

    public String getMerchantrelationsid() {
        return merchantrelationsid;
    }

    public void setOperationaltermid(String operationaltermid) {
        this.operationaltermid = operationaltermid;
    }

    public String getOperationaltermid() {
        return operationaltermid;
    }
}