package org.museframework.bian.payraiope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePaymentAccountReconciliationFunctionRequest {
    @MetaField
    private String paymentrailoperationsid;

    @MetaField
    private String paymentaccountreconciliationfunctionid;

    public void setPaymentrailoperationsid(String paymentrailoperationsid) {
        this.paymentrailoperationsid = paymentrailoperationsid;
    }

    public String getPaymentrailoperationsid() {
        return paymentrailoperationsid;
    }

    public void setPaymentaccountreconciliationfunctionid(String paymentaccountreconciliationfunctionid) {
        this.paymentaccountreconciliationfunctionid = paymentaccountreconciliationfunctionid;
    }

    public String getPaymentaccountreconciliationfunctionid() {
        return paymentaccountreconciliationfunctionid;
    }
}