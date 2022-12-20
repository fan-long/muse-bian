package org.museframework.bian.customeroffer.dto;

public class RetrieveCorrespondenceandDocumentsRequest {
    private String customerofferid;

    private String correspondenceanddocumentsid;

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
}