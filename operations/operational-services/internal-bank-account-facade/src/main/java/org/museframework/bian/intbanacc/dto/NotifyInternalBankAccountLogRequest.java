package org.museframework.bian.intbanacc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyInternalBankAccountLogRequest {
    @MetaField
    private String internalbankaccountid;

    public void setInternalbankaccountid(String internalbankaccountid) {
        this.internalbankaccountid = internalbankaccountid;
    }

    public String getInternalbankaccountid() {
        return internalbankaccountid;
    }
}