package org.museframework.bian.corporateloan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveDisbursementResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corporateloan.dto.bq.Disbursement disbursement;

    public void setDisbursement(org.museframework.bian.corporateloan.dto.bq.Disbursement disbursement) {
        this.disbursement = disbursement;
    }

    public org.museframework.bian.corporateloan.dto.bq.Disbursement getDisbursement() {
        return disbursement;
    }
}