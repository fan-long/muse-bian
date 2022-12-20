package org.museframework.bian.proinvdis.dto;

public class CaptureMailingRequest {
    private String productinventorydistributionid;

    private String mailingid;

    private org.museframework.bian.proinvdis.dto.bq.Mailing mailing;

    public void setProductinventorydistributionid(String productinventorydistributionid) {
        this.productinventorydistributionid = productinventorydistributionid;
    }

    public String getProductinventorydistributionid() {
        return productinventorydistributionid;
    }

    public void setMailingid(String mailingid) {
        this.mailingid = mailingid;
    }

    public String getMailingid() {
        return mailingid;
    }

    public void setMailing(org.museframework.bian.proinvdis.dto.bq.Mailing mailing) {
        this.mailing = mailing;
    }

    public org.museframework.bian.proinvdis.dto.bq.Mailing getMailing() {
        return mailing;
    }
}