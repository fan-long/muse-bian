package org.museframework.bian.corbanope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RequestReconciliationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.corbanope.dto.bq.Reconciliation reconciliation;

    public void setReconciliation(org.museframework.bian.corbanope.dto.bq.Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }

    public org.museframework.bian.corbanope.dto.bq.Reconciliation getReconciliation() {
        return reconciliation;
    }
}