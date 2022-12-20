package org.museframework.bian.bankdrafts.dto;

public class NotifyBearerDocumentCreationandRegistrationTaskRequest {
    private String bankdraftsid;

    private String bearerdocumentcreationandregistrationtaskid;

    public void setBankdraftsid(String bankdraftsid) {
        this.bankdraftsid = bankdraftsid;
    }

    public String getBankdraftsid() {
        return bankdraftsid;
    }

    public void setBearerdocumentcreationandregistrationtaskid(String bearerdocumentcreationandregistrationtaskid) {
        this.bearerdocumentcreationandregistrationtaskid = bearerdocumentcreationandregistrationtaskid;
    }

    public String getBearerdocumentcreationandregistrationtaskid() {
        return bearerdocumentcreationandregistrationtaskid;
    }
}