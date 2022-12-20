package org.museframework.bian.letofcre.dto;

public class RetrieveLetterofCreditIssuanceandBookingTaskRequest {
    private String letterofcreditid;

    private String letterofcreditissuanceandbookingtaskid;

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
}