package org.museframework.bian.letofcre.dto;

public class ExecuteLetterofCreditIssuanceandBookingTaskRequest {
    private String letterofcreditid;

    private String letterofcreditissuanceandbookingtaskid;

    private org.museframework.bian.letofcre.dto.bq.LetterofCreditIssuanceandBookingTask letterofCreditIssuanceandBookingTask;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setLetterofcreditissuanceandbookingtaskid(String letterofcreditissuanceandbookingtaskid) {
        this.letterofcreditissuanceandbookingtaskid = letterofcreditissuanceandbookingtaskid;
    }

    public String getLetterofcreditissuanceandbookingtaskid() {
        return letterofcreditissuanceandbookingtaskid;
    }

    public void setLetterofCreditIssuanceandBookingTask(org.museframework.bian.letofcre.dto.bq.LetterofCreditIssuanceandBookingTask letterofCreditIssuanceandBookingTask) {
        this.letterofCreditIssuanceandBookingTask = letterofCreditIssuanceandBookingTask;
    }

    public org.museframework.bian.letofcre.dto.bq.LetterofCreditIssuanceandBookingTask getLetterofCreditIssuanceandBookingTask() {
        return letterofCreditIssuanceandBookingTask;
    }
}