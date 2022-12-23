package org.museframework.bian.intbanacc.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class CaptureInternalBankAccountLogRequest {
    @MetaField
    private String internalbankaccountid;

    @MetaField(ref=true)
    private org.museframework.bian.intbanacc.dto.cr.InternalBankAccountLog internalBankAccountLog;

    public void setInternalbankaccountid(String internalbankaccountid) {
        this.internalbankaccountid = internalbankaccountid;
    }

    public String getInternalbankaccountid() {
        return internalbankaccountid;
    }

    public void setInternalBankAccountLog(org.museframework.bian.intbanacc.dto.cr.InternalBankAccountLog internalBankAccountLog) {
        this.internalBankAccountLog = internalBankAccountLog;
    }

    public org.museframework.bian.intbanacc.dto.cr.InternalBankAccountLog getInternalBankAccountLog() {
        return internalBankAccountLog;
    }
}