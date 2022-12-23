package org.museframework.bian.standingorder.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateStandingOrderPaymentRequest {
    @MetaField
    private String standingorderid;

    @MetaField
    private String standingorderpaymentid;

    @MetaField(ref=true)
    private org.museframework.bian.standingorder.dto.bq.StandingOrderPayment standingOrderPayment;

    public void setStandingorderid(String standingorderid) {
        this.standingorderid = standingorderid;
    }

    public String getStandingorderid() {
        return standingorderid;
    }

    public void setStandingorderpaymentid(String standingorderpaymentid) {
        this.standingorderpaymentid = standingorderpaymentid;
    }

    public String getStandingorderpaymentid() {
        return standingorderpaymentid;
    }

    public void setStandingOrderPayment(org.museframework.bian.standingorder.dto.bq.StandingOrderPayment standingOrderPayment) {
        this.standingOrderPayment = standingOrderPayment;
    }

    public org.museframework.bian.standingorder.dto.bq.StandingOrderPayment getStandingOrderPayment() {
        return standingOrderPayment;
    }
}