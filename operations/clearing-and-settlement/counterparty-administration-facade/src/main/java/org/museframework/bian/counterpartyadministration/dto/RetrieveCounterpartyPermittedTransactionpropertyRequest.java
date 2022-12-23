package org.museframework.bian.counterpartyadministration.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCounterpartyPermittedTransactionpropertyRequest {
    @MetaField
    private String counterpartyadministrationid;

    @MetaField
    private String counterpartypermittedtransactionpropertyid;

    public void setCounterpartyadministrationid(String counterpartyadministrationid) {
        this.counterpartyadministrationid = counterpartyadministrationid;
    }

    public String getCounterpartyadministrationid() {
        return counterpartyadministrationid;
    }

    public void setCounterpartypermittedtransactionpropertyid(String counterpartypermittedtransactionpropertyid) {
        this.counterpartypermittedtransactionpropertyid = counterpartypermittedtransactionpropertyid;
    }

    public String getCounterpartypermittedtransactionpropertyid() {
        return counterpartypermittedtransactionpropertyid;
    }
}