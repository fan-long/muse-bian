package org.museframework.bian.productmatching.dto;

public class InitiateBankandCampaignAlignmentRequest {
    private String productmatchingid;

    private String bankandcampaignalignmentid;

    private org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment bankandCampaignAlignment;

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

    public void setBankandCampaignAlignment(org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment bankandCampaignAlignment) {
        this.bankandCampaignAlignment = bankandCampaignAlignment;
    }

    public org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment getBankandCampaignAlignment() {
        return bankandCampaignAlignment;
    }
}