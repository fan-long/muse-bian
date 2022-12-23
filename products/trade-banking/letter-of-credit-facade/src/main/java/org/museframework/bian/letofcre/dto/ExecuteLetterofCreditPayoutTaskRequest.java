package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExecuteLetterofCreditPayoutTaskRequest {
    @MetaField
    private String letterofcreditid;

    @MetaField
    private String letterofcreditpayouttaskid;

    @MetaField(ref=true)
    private org.museframework.bian.letofcre.dto.bq.LetterofCreditPayoutTask letterofCreditPayoutTask;

    public void setLetterofcreditid(String letterofcreditid) {
        this.letterofcreditid = letterofcreditid;
    }

    public String getLetterofcreditid() {
        return letterofcreditid;
    }

    public void setLetterofcreditpayouttaskid(String letterofcreditpayouttaskid) {
        this.letterofcreditpayouttaskid = letterofcreditpayouttaskid;
    }

    public String getLetterofcreditpayouttaskid() {
        return letterofcreditpayouttaskid;
    }

    public void setLetterofCreditPayoutTask(org.museframework.bian.letofcre.dto.bq.LetterofCreditPayoutTask letterofCreditPayoutTask) {
        this.letterofCreditPayoutTask = letterofCreditPayoutTask;
    }

    public org.museframework.bian.letofcre.dto.bq.LetterofCreditPayoutTask getLetterofCreditPayoutTask() {
        return letterofCreditPayoutTask;
    }
}