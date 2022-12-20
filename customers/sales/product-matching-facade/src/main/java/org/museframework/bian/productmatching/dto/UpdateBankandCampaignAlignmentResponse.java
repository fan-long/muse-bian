package org.museframework.bian.productmatching.dto;

public class UpdateBankandCampaignAlignmentResponse {
    private org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment bankandCampaignAlignment;

    public void setBankandCampaignAlignment(org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment bankandCampaignAlignment) {
        this.bankandCampaignAlignment = bankandCampaignAlignment;
    }

    public org.museframework.bian.productmatching.dto.bq.BankandCampaignAlignment getBankandCampaignAlignment() {
        return bankandCampaignAlignment;
    }
}