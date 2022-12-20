package org.museframework.bian.assandliaman.dto;

public class RequestAssetAndLiabilityPortfolioStrategyRequest {
    private String assetandliabilitymanagementid;

    private org.museframework.bian.assandliaman.dto.cr.AssetAndLiabilityPortfolioStrategy assetAndLiabilityPortfolioStrategy;

    public void setAssetandliabilitymanagementid(String assetandliabilitymanagementid) {
        this.assetandliabilitymanagementid = assetandliabilitymanagementid;
    }

    public String getAssetandliabilitymanagementid() {
        return assetandliabilitymanagementid;
    }

    public void setAssetAndLiabilityPortfolioStrategy(org.museframework.bian.assandliaman.dto.cr.AssetAndLiabilityPortfolioStrategy assetAndLiabilityPortfolioStrategy) {
        this.assetAndLiabilityPortfolioStrategy = assetAndLiabilityPortfolioStrategy;
    }

    public org.museframework.bian.assandliaman.dto.cr.AssetAndLiabilityPortfolioStrategy getAssetAndLiabilityPortfolioStrategy() {
        return assetAndLiabilityPortfolioStrategy;
    }
}