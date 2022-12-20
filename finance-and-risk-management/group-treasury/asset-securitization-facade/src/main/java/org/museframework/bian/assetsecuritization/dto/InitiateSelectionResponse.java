package org.museframework.bian.assetsecuritization.dto;

public class InitiateSelectionResponse {
    private org.museframework.bian.assetsecuritization.dto.bq.Selection selection;

    public void setSelection(org.museframework.bian.assetsecuritization.dto.bq.Selection selection) {
        this.selection = selection;
    }

    public org.museframework.bian.assetsecuritization.dto.bq.Selection getSelection() {
        return selection;
    }
}