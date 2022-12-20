package org.museframework.bian.bankdrafts.dto;

public class UpdateBearerDocumentCreationandRegistrationTaskRequest {
    private String bankdraftsid;

    private String bearerdocumentcreationandregistrationtaskid;

    private org.museframework.bian.bankdrafts.dto.bq.BearerDocumentCreationandRegistrationTask bearerDocumentCreationandRegistrationTask;

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

    public void setBearerDocumentCreationandRegistrationTask(org.museframework.bian.bankdrafts.dto.bq.BearerDocumentCreationandRegistrationTask bearerDocumentCreationandRegistrationTask) {
        this.bearerDocumentCreationandRegistrationTask = bearerDocumentCreationandRegistrationTask;
    }

    public org.museframework.bian.bankdrafts.dto.bq.BearerDocumentCreationandRegistrationTask getBearerDocumentCreationandRegistrationTask() {
        return bearerDocumentCreationandRegistrationTask;
    }
}