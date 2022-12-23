package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class NotifyFundEnrolmentCertificationRoutineRequest {
    @MetaField
    private String hedgefundadministrationid;

    @MetaField
    private String fundenrolmentcertificationroutineid;

    public void setHedgefundadministrationid(String hedgefundadministrationid) {
        this.hedgefundadministrationid = hedgefundadministrationid;
    }

    public String getHedgefundadministrationid() {
        return hedgefundadministrationid;
    }

    public void setFundenrolmentcertificationroutineid(String fundenrolmentcertificationroutineid) {
        this.fundenrolmentcertificationroutineid = fundenrolmentcertificationroutineid;
    }

    public String getFundenrolmentcertificationroutineid() {
        return fundenrolmentcertificationroutineid;
    }
}