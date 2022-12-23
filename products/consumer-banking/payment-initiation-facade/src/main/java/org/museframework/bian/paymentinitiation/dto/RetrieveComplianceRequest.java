package org.museframework.bian.paymentinitiation.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveComplianceRequest {
    @MetaField
    private String paymentinitiationid;

    @MetaField
    private String complianceid;

    public void setPaymentinitiationid(String paymentinitiationid) {
        this.paymentinitiationid = paymentinitiationid;
    }

    public String getPaymentinitiationid() {
        return paymentinitiationid;
    }

    public void setComplianceid(String complianceid) {
        this.complianceid = complianceid;
    }

    public String getComplianceid() {
        return complianceid;
    }
}