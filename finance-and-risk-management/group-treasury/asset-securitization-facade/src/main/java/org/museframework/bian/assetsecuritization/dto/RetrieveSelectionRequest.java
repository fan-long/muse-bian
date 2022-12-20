package org.museframework.bian.assetsecuritization.dto;

public class RetrieveSelectionRequest {
    private String assetsecuritizationid;

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