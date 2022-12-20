package org.museframework.bian.assetsecuritization.dto;

public class ControlAssetSecuritizationTransactionRequest {
    private String assetsecuritizationid;

    private org.museframework.bian.assetsecuritization.dto.cr.AssetSecuritizationTransaction assetSecuritizationTransaction;

    public void setAssetsecuritizationid(String assetsecuritizationid) {
        this.assetsecuritizationid = assetsecuritizationid;
    }

    public String getAssetsecuritizationid() {
        return assetsecuritizationid;
    }

    public void setAssetSecuritizationTransaction(org.museframework.bian.assetsecuritization.dto.cr.AssetSecuritizationTransaction assetSecuritizationTransaction) {
        this.assetSecuritizationTransaction = assetSecuritizationTransaction;
    }

    public org.museframework.bian.assetsecuritization.dto.cr.AssetSecuritizationTransaction getAssetSecuritizationTransaction() {
        return assetSecuritizationTransaction;
    }
}