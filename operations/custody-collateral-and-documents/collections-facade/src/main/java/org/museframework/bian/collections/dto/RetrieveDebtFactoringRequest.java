package org.museframework.bian.collections.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveDebtFactoringRequest {
    @MetaField
    private String collectionsid;

    @MetaField
    private String debtfactoringid;

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
}