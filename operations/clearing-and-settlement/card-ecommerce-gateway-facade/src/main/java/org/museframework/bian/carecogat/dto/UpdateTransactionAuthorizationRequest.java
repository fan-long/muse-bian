package org.museframework.bian.carecogat.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTransactionAuthorizationRequest {
    @MetaField
    private String cardecommercegatewayid;

    @MetaField
    private String transactionauthorizationid;

    @MetaField(ref=true)
    private org.museframework.bian.carecogat.dto.bq.TransactionAuthorization transactionAuthorization;

    public void setCardecommercegatewayid(String cardecommercegatewayid) {
        this.cardecommercegatewayid = cardecommercegatewayid;
    }

    public String getCardecommercegatewayid() {
        return cardecommercegatewayid;
    }

    public void setTransactionauthorizationid(String transactionauthorizationid) {
        this.transactionauthorizationid = transactionauthorizationid;
    }

    public String getTransactionauthorizationid() {
        return transactionauthorizationid;
    }

    public void setTransactionAuthorization(org.museframework.bian.carecogat.dto.bq.TransactionAuthorization transactionAuthorization) {
        this.transactionAuthorization = transactionAuthorization;
    }

    public org.museframework.bian.carecogat.dto.bq.TransactionAuthorization getTransactionAuthorization() {
        return transactionAuthorization;
    }
}