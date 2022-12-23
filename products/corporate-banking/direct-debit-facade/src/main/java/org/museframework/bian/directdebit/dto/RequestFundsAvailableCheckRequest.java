package org.museframework.bian.directdebit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestFundsAvailableCheckRequest {
    @MetaField
    private String directdebitid;

    @MetaField
    private String fundsavailablecheckid;

    @MetaField(ref=true)
    private org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck fundsAvailableCheck;

    public void setDirectdebitid(String directdebitid) {
        this.directdebitid = directdebitid;
    }

    public String getDirectdebitid() {
        return directdebitid;
    }

    public void setFundsavailablecheckid(String fundsavailablecheckid) {
        this.fundsavailablecheckid = fundsavailablecheckid;
    }

    public String getFundsavailablecheckid() {
        return fundsavailablecheckid;
    }

    public void setFundsAvailableCheck(org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck fundsAvailableCheck) {
        this.fundsAvailableCheck = fundsAvailableCheck;
    }

    public org.museframework.bian.directdebit.dto.bq.FundsAvailableCheck getFundsAvailableCheck() {
        return fundsAvailableCheck;
    }
}