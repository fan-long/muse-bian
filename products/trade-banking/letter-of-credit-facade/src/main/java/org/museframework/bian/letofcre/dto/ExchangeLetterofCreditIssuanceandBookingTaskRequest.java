package org.museframework.bian.letofcre.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeLetterofCreditIssuanceandBookingTaskRequest {
    @MetaField
    private String letterofcreditid;

    @MetaField
    private String letterofcreditissuanceandbookingtaskid;

    @MetaField(ref=true)
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