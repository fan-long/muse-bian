package org.museframework.bian.assandliaman.dto;

import org.museframework.common.core.MetaDto.DtoType;
import org.museframework.common.core.MetaDto;
import org.museframework.common.core.MetaField;

@MetaDto(DtoType.GenericRequest)
public class UpdateAssetAndLiabilityPortfolioStrategyRequest {
    @MetaField
    private String assetandliabilitymanagementid;

    @MetaField(ref=true)
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