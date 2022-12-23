package org.museframework.bian.opeiteman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateRepaymentRequest {
    @MetaField
    private String openitemmanagementid;

    @MetaField
    private String repaymentid;

    @MetaField(ref=true)
    private org.museframework.bian.opeiteman.dto.bq.Repayment repayment;

    public void setOpenitemmanagementid(String openitemmanagementid) {
        this.openitemmanagementid = openitemmanagementid;
    }

    public String getOpenitemmanagementid() {
        return openitemmanagementid;
    }

    public void setRepaymentid(String repaymentid) {
        this.repaymentid = repaymentid;
    }

    public String getRepaymentid() {
        return repaymentid;
    }

    public void setRepayment(org.museframework.bian.opeiteman.dto.bq.Repayment repayment) {
        this.repayment = repayment;
    }

    public org.museframework.bian.opeiteman.dto.bq.Repayment getRepayment() {
        return repayment;
    }
}