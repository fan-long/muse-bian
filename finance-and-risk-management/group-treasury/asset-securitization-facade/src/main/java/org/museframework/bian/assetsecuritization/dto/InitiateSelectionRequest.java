package org.museframework.bian.assetsecuritization.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class InitiateSelectionRequest {
    @MetaField
    private String assetsecuritizationid;

    @MetaField
    private String selectionid;

    @MetaField(ref=true)
    private org.museframework.bian.assetsecuritization.dto.bq.Selection selection;

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

    public void setSelection(org.museframework.bian.assetsecuritization.dto.bq.Selection selection) {
        this.selection = selection;
    }

    public org.museframework.bian.assetsecuritization.dto.bq.Selection getSelection() {
        return selection;
    }
}