package org.museframework.bian.achoperations.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateReconciliationRequest {
    @MetaField
    private String achoperationsid;

    @MetaField
    private String reconciliationid;

    @MetaField(ref=true)
    private org.museframework.bian.achoperations.dto.bq.Reconciliation reconciliation;

    public void setAchoperationsid(String achoperationsid) {
        this.achoperationsid = achoperationsid;
    }

    public String getAchoperationsid() {
        return achoperationsid;
    }

    public void setReconciliationid(String reconciliationid) {
        this.reconciliationid = reconciliationid;
    }

    public String getReconciliationid() {
        return reconciliationid;
    }

    public void setReconciliation(org.museframework.bian.achoperations.dto.bq.Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }

    public org.museframework.bian.achoperations.dto.bq.Reconciliation getReconciliation() {
        return reconciliation;
    }
}