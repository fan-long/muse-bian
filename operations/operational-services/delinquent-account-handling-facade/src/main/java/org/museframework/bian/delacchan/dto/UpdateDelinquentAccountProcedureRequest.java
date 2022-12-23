package org.museframework.bian.delacchan.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateDelinquentAccountProcedureRequest {
    @MetaField
    private String delinquentaccounthandlingid;

    @MetaField(ref=true)
    private org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure delinquentAccountProcedure;

    public void setDelinquentaccounthandlingid(String delinquentaccounthandlingid) {
        this.delinquentaccounthandlingid = delinquentaccounthandlingid;
    }

    public String getDelinquentaccounthandlingid() {
        return delinquentaccounthandlingid;
    }

    public void setDelinquentAccountProcedure(org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure delinquentAccountProcedure) {
        this.delinquentAccountProcedure = delinquentAccountProcedure;
    }

    public org.museframework.bian.delacchan.dto.cr.DelinquentAccountProcedure getDelinquentAccountProcedure() {
        return delinquentAccountProcedure;
    }
}