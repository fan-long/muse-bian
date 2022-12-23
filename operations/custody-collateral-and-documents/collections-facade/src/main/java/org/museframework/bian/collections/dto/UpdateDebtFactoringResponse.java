package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class UpdateDebtFactoringResponse {
    @MetaField(ref=true)
    private org.museframework.bian.collections.dto.bq.DebtFactoring debtFactoring;

    public void setDebtFactoring(org.museframework.bian.collections.dto.bq.DebtFactoring debtFactoring) {
        this.debtFactoring = debtFactoring;
    }

    public org.museframework.bian.collections.dto.bq.DebtFactoring getDebtFactoring() {
        return debtFactoring;
    }
}