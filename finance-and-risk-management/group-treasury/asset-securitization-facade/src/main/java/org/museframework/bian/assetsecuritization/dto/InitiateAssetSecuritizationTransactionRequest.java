package org.museframework.bian.assetsecuritization.dto;

public class InitiateAssetSecuritizationTransactionRequest {
    private org.museframework.bian.assetsecuritization.dto.cr.AssetSecuritizationTransaction assetSecuritizationTransaction;

    public void setAssetSecuritizationTransaction(org.museframework.bian.assetsecuritization.dto.cr.AssetSecuritizationTransaction assetSecuritizationTransaction) {
        this.assetSecuritizationTransaction = assetSecuritizationTransaction;
    }

    public org.museframework.bian.assetsecuritization.dto.cr.AssetSecuritizationTransaction getAssetSecuritizationTransaction() {
        return assetSecuritizationTransaction;
    }
}