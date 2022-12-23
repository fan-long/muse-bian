package org.museframework.bian.unitruadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestFundTaxAdministrationRoutineResponse {
    @MetaField(ref=true)
    private org.museframework.bian.unitruadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine;

    public void setFundTaxAdministrationRoutine(org.museframework.bian.unitruadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine) {
        this.fundTaxAdministrationRoutine = fundTaxAdministrationRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundTaxAdministrationRoutine getFundTaxAdministrationRoutine() {
        return fundTaxAdministrationRoutine;
    }
}