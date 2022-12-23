package org.museframework.bian.unitruadm.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class GrantFundTaxAdministrationRoutineRequest {
    @MetaField
    private String unittrustadministrationid;

    @MetaField
    private String fundtaxadministrationroutineid;

    @MetaField(ref=true)
    private org.museframework.bian.unitruadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine;

    public void setUnittrustadministrationid(String unittrustadministrationid) {
        this.unittrustadministrationid = unittrustadministrationid;
    }

    public String getUnittrustadministrationid() {
        return unittrustadministrationid;
    }

    public void setFundtaxadministrationroutineid(String fundtaxadministrationroutineid) {
        this.fundtaxadministrationroutineid = fundtaxadministrationroutineid;
    }

    public String getFundtaxadministrationroutineid() {
        return fundtaxadministrationroutineid;
    }

    public void setFundTaxAdministrationRoutine(org.museframework.bian.unitruadm.dto.bq.FundTaxAdministrationRoutine fundTaxAdministrationRoutine) {
        this.fundTaxAdministrationRoutine = fundTaxAdministrationRoutine;
    }

    public org.museframework.bian.unitruadm.dto.bq.FundTaxAdministrationRoutine getFundTaxAdministrationRoutine() {
        return fundTaxAdministrationRoutine;
    }
}