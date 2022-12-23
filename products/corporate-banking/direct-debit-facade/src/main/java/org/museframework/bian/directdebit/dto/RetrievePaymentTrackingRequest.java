package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePaymentTrackingRequest {
    @MetaField
    private String directdebitid;

    @MetaField
    private String paymenttrackingid;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setPaymenttrackingid(String paymenttrackingid) {
        this.paymenttrackingid = paymenttrackingid;
    }

    public String getPaymenttrackingid() {
        return paymenttrackingid;
    }
}