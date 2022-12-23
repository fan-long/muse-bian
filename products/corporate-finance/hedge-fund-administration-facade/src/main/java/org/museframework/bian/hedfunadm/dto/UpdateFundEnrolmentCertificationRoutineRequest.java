package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateFundEnrolmentCertificationRoutineRequest {
    @MetaField
    private String hedgefundadministrationid;

    @MetaField
    private String fundenrolmentcertificationroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.bq.FundEnrolmentCertificationRoutine fundEnrolmentCertificationRoutine;

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

    public void setFundEnrolmentCertificationRoutine(org.museframework.bian.hedfunadm.dto.bq.FundEnrolmentCertificationRoutine fundEnrolmentCertificationRoutine) {
        this.fundEnrolmentCertificationRoutine = fundEnrolmentCertificationRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundEnrolmentCertificationRoutine getFundEnrolmentCertificationRoutine() {
        return fundEnrolmentCertificationRoutine;
    }
}