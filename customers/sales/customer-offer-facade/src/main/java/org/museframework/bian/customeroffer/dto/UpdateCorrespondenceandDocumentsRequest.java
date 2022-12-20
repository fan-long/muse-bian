package org.museframework.bian.customeroffer.dto;

public class UpdateCorrespondenceandDocumentsRequest {
    private String customerofferid;

    private String correspondenceanddocumentsid;

    private org.museframework.bian.customeroffer.dto.bq.CorrespondenceandDocuments correspondenceandDocuments;

    public void setCustomerofferid(String customerofferid) {
        this.customerofferid = customerofferid;
    }

    public String getCustomerofferid() {
        return customerofferid;
    }

    public void setCorrespondenceanddocumentsid(String correspondenceanddocumentsid) {
        this.correspondenceanddocumentsid = correspondenceanddocumentsid;
    }

    public String getCorrespondenceanddocumentsid() {
        return correspondenceanddocumentsid;
    }

    public void setCorrespondenceandDocuments(org.museframework.bian.customeroffer.dto.bq.CorrespondenceandDocuments correspondenceandDocuments) {
        this.correspondenceandDocuments = correspondenceandDocuments;
    }

    public org.museframework.bian.customeroffer.dto.bq.CorrespondenceandDocuments getCorrespondenceandDocuments() {
        return correspondenceandDocuments;
    }
}