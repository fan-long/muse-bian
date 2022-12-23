package org.museframework.bian.corbanope.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateReconciliationRequest {
    @MetaField
    private String correspondentbankoperationsid;

    @MetaField
    private String reconciliationid;

    @MetaField(ref=true)
    private org.museframework.bian.corbanope.dto.bq.Reconciliation reconciliation;

    public void setCorrespondentbankoperationsid(String correspondentbankoperationsid) {
        this.correspondentbankoperationsid = correspondentbankoperationsid;
    }

    public String getCorrespondentbankoperationsid() {
        return correspondentbankoperationsid;
    }

    public void setReconciliationid(String reconciliationid) {
        this.reconciliationid = reconciliationid;
    }

    public String getReconciliationid() {
        return reconciliationid;
    }

    public void setReconciliation(org.museframework.bian.corbanope.dto.bq.Reconciliation reconciliation) {
        this.reconciliation = reconciliation;
    }

    public org.museframework.bian.corbanope.dto.bq.Reconciliation getReconciliation() {
        return reconciliation;
    }
}