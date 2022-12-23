package org.museframework.bian.assetsecuritization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class RetrieveSelectionRequest {
    @MetaField
    private String assetsecuritizationid;

    @MetaField
    private String selectionid;

    public void setAssetsecuritizationid(String assetsecuritizationid) {
        this.assetsecuritizationid = assetsecuritizationid;
    }

    public String getAssetsecuritizationid() {
        return assetsecuritizationid;
    }

    public void setSelectionid(String selectionid) {
        this.selectionid = selectionid;
    }

    public String getSelectionid() {
        return selectionid;
    }
}