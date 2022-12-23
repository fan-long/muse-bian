package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveReconciliationRequest {
    @MetaField
    private String cardclearingid;

    @MetaField
    private String reconciliationid;

    public void setCardclearingid(String cardclearingid) {
        this.cardclearingid = cardclearingid;
    }

    public String getCardclearingid() {
        return cardclearingid;
    }

    public void setReconciliationid(String reconciliationid) {
        this.reconciliationid = reconciliationid;
    }

    public String getReconciliationid() {
        return reconciliationid;
    }
}