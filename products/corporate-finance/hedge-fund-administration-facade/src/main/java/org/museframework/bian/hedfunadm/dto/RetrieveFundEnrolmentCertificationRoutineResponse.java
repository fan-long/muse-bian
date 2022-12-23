package org.museframework.bian.hedfunadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveFundEnrolmentCertificationRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.hedfunadm.dto.bq.FundEnrolmentCertificationRoutine fundEnrolmentCertificationRoutine;

    public void setFundEnrolmentCertificationRoutine(org.museframework.bian.hedfunadm.dto.bq.FundEnrolmentCertificationRoutine fundEnrolmentCertificationRoutine) {
        this.fundEnrolmentCertificationRoutine = fundEnrolmentCertificationRoutine;
    }

    public org.museframework.bian.hedfunadm.dto.bq.FundEnrolmentCertificationRoutine getFundEnrolmentCertificationRoutine() {
        return fundEnrolmentCertificationRoutine;
    }
}