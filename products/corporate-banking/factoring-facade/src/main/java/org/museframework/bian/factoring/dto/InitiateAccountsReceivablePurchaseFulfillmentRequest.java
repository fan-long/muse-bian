package org.museframework.bian.factoring.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateAccountsReceivablePurchaseFulfillmentRequest {
    @MetaField
    private String factoringid;

    @MetaField
    private String accountsreceivablepurchasefulfillmentid;

    @MetaField(ref=true)
    private org.museframework.bian.factoring.dto.bq.AccountsReceivablePurchaseFulfillment accountsReceivablePurchaseFulfillment;

    public void setFactoringid(String factoringid) {
        this.factoringid = factoringid;
    }

    public String getFactoringid() {
        return factoringid;
    }

    public void setAccountsreceivablepurchasefulfillmentid(String accountsreceivablepurchasefulfillmentid) {
        this.accountsreceivablepurchasefulfillmentid = accountsreceivablepurchasefulfillmentid;
    }

    public String getAccountsreceivablepurchasefulfillmentid() {
        return accountsreceivablepurchasefulfillmentid;
    }

    public void setAccountsReceivablePurchaseFulfillment(org.museframework.bian.factoring.dto.bq.AccountsReceivablePurchaseFulfillment accountsReceivablePurchaseFulfillment) {
        this.accountsReceivablePurchaseFulfillment = accountsReceivablePurchaseFulfillment;
    }

    public org.museframework.bian.factoring.dto.bq.AccountsReceivablePurchaseFulfillment getAccountsReceivablePurchaseFulfillment() {
        return accountsReceivablePurchaseFulfillment;
    }
}