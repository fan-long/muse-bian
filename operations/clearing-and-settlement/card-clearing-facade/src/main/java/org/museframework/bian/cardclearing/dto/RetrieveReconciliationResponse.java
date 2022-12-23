package org.museframework.bian.cardclearing.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericResponse)
public class RetrieveReconciliationResponse {
    @MetaField(ref=true)
    private org.museframework.bian.cardclearing.dto.bq.Reconciliation reconciliation;

    public void setReconciliation(org.museframework.bian.cardclearing.dto.bq.Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }

    public org.museframework.bian.cardclearing.dto.bq.Reconciliation getReconciliation() {
        return reconciliation;
    }
}