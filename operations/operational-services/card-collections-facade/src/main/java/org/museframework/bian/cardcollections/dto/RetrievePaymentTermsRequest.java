package org.museframework.bian.cardcollections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePaymentTermsRequest {
    @MetaField
    private String cardcollectionsid;

    @MetaField
    private String paymenttermsid;

    public void setCardcollectionsid(String cardcollectionsid) {
        this.cardcollectionsid = cardcollectionsid;
    }

    public String getCardcollectionsid() {
        return cardcollectionsid;
    }

    public void setPaymenttermsid(String paymenttermsid) {
        this.paymenttermsid = paymenttermsid;
    }

    public String getPaymenttermsid() {
        return paymenttermsid;
    }
}