package org.museframework.bian.creditcard.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveCreditPlanRequest {
    @MetaField
    private String creditcardid;

    @MetaField
    private String creditplanid;

    public void setCreditcardid(String creditcardid) {
        this.creditcardid = creditcardid;
    }

    public String getCreditcardid() {
        return creditcardid;
    }

    public void setCreditplanid(String creditplanid) {
        this.creditplanid = creditplanid;
    }

    public String getCreditplanid() {
        return creditplanid;
    }
}