package org.museframework.bian.casmanandaccser.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrievePositivePayRequest {
    @MetaField
    private String cashmanagementandaccountservicesid;

    @MetaField
    private String positivepayid;

    public void setCashmanagementandaccountservicesid(String cashmanagementandaccountservicesid) {
        this.cashmanagementandaccountservicesid = cashmanagementandaccountservicesid;
    }

    public String getCashmanagementandaccountservicesid() {
        return cashmanagementandaccountservicesid;
    }

    public void setPositivepayid(String positivepayid) {
        this.positivepayid = positivepayid;
    }

    public String getPositivepayid() {
        return positivepayid;
    }
}