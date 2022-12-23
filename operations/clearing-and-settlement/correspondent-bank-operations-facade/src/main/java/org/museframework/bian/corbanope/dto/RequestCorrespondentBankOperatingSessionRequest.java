package org.museframework.bian.corbanope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RequestCorrespondentBankOperatingSessionRequest {
    @MetaField
    private String correspondentbankoperationsid;

    @MetaField(ref=true)
    private org.museframework.bian.corbanope.dto.cr.CorrespondentBankOperatingSession correspondentBankOperatingSession;

    public void setCorrespondentbankoperationsid(String correspondentbankoperationsid) {
        this.correspondentbankoperationsid = correspondentbankoperationsid;
    }

    public String getCorrespondentbankoperationsid() {
        return correspondentbankoperationsid;
    }

    public void setCorrespondentBankOperatingSession(org.museframework.bian.corbanope.dto.cr.CorrespondentBankOperatingSession correspondentBankOperatingSession) {
        this.correspondentBankOperatingSession = correspondentBankOperatingSession;
    }

    public org.museframework.bian.corbanope.dto.cr.CorrespondentBankOperatingSession getCorrespondentBankOperatingSession() {
        return correspondentBankOperatingSession;
    }
}