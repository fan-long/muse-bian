package org.museframework.bian.productmatching.dto;

public class RetrieveBankandCampaignAlignmentRequest {
    private String productmatchingid;

    private String bankandcampaignalignmentid;

    public void setProductmatchingid(String productmatchingid) {
        this.productmatchingid = productmatchingid;
    }

    public String getProductmatchingid() {
        return productmatchingid;
    }

    public void setBankandcampaignalignmentid(String bankandcampaignalignmentid) {
        this.bankandcampaignalignmentid = bankandcampaignalignmentid;
    }

    public String getBankandcampaignalignmentid() {
        return bankandcampaignalignmentid;
    }
}