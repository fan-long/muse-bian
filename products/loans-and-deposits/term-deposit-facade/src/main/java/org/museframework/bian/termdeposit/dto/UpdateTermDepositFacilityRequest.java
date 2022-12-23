package org.museframework.bian.termdeposit.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateTermDepositFacilityRequest {
    @MetaField
    private String termdepositid;

    @MetaField(ref=true)
    private org.museframework.bian.termdeposit.dto.cr.TermDepositFacility termDepositFacility;

    public void setTermdepositid(String termdepositid) {
        this.termdepositid = termdepositid;
    }

    public String getTermdepositid() {
        return termdepositid;
    }

    public void setTermDepositFacility(org.museframework.bian.termdeposit.dto.cr.TermDepositFacility termDepositFacility) {
        this.termDepositFacility = termDepositFacility;
    }

    public org.museframework.bian.termdeposit.dto.cr.TermDepositFacility getTermDepositFacility() {
        return termDepositFacility;
    }
}