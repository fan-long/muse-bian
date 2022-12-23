package org.museframework.bian.cardcapture.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateTransactionAuthorizationRequest {
    @MetaField
    private String cardcaptureid;

    @MetaField
    private String transactionauthorizationid;

    @MetaField(ref=true)
    private org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization transactionAuthorization;

    public void setCardcaptureid(String cardcaptureid) {
        this.cardcaptureid = cardcaptureid;
    }

    public String getCardcaptureid() {
        return cardcaptureid;
    }

    public void setTransactionauthorizationid(String transactionauthorizationid) {
        this.transactionauthorizationid = transactionauthorizationid;
    }

    public String getTransactionauthorizationid() {
        return transactionauthorizationid;
    }

    public void setTransactionAuthorization(org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization transactionAuthorization) {
        this.transactionAuthorization = transactionAuthorization;
    }

    public org.museframework.bian.cardcapture.dto.bq.TransactionAuthorization getTransactionAuthorization() {
        return transactionAuthorization;
    }
}