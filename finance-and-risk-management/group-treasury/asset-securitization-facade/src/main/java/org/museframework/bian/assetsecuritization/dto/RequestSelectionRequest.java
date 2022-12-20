package org.museframework.bian.assetsecuritization.dto;

public class RequestSelectionRequest {
    private String assetsecuritizationid;

    private String selectionid;

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