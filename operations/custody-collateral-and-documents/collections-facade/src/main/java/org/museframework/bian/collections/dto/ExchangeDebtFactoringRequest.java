package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class ExchangeDebtFactoringRequest {
    @MetaField
    private String collectionsid;

    @MetaField
    private String debtfactoringid;

    @MetaField(ref=true)
    private org.museframework.bian.collections.dto.bq.DebtFactoring debtFactoring;

    public void setCollectionsid(String collectionsid) {
        this.collectionsid = collectionsid;
    }

    public String getCollectionsid() {
        return collectionsid;
    }

    public void setDebtfactoringid(String debtfactoringid) {
        this.debtfactoringid = debtfactoringid;
    }

    public String getDebtfactoringid() {
        return debtfactoringid;
    }

    public void setDebtFactoring(org.museframework.bian.collections.dto.bq.DebtFactoring debtFactoring) {
        this.debtFactoring = debtFactoring;
    }

    public org.museframework.bian.collections.dto.bq.DebtFactoring getDebtFactoring() {
        return debtFactoring;
    }
}