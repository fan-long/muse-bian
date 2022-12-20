package org.museframework.bian.assandliaman;

import org.museframework.bian.assandliaman.dto.RequestAssetAndLiabilityPortfolioStrategyRequest;
import org.museframework.bian.assandliaman.dto.RequestAssetAndLiabilityPortfolioStrategyResponse;
import org.museframework.bian.assandliaman.dto.RetrieveAssetAndLiabilityPortfolioStrategyRequest;
import org.museframework.bian.assandliaman.dto.RetrieveAssetAndLiabilityPortfolioStrategyResponse;
import org.museframework.bian.assandliaman.dto.UpdateAssetAndLiabilityPortfolioStrategyRequest;
import org.museframework.bian.assandliaman.dto.UpdateAssetAndLiabilityPortfolioStrategyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Define the policies, goals & objectives and strategies for an organizational entity or unit  within Asset And Liability Management.  Example: Direct a division of the enterprise.")
@GenericDomain(name="AssetAndLiabilityManagement", group="AssetAndLiabilityPortfolioStrategy")
public interface CrAssetAndLiabilityPortfolioStrategy {
    @GenericDtxEndpoint
    @Description("UpCR Update aspects of the bank's asset and liability policies")
    UpdateAssetAndLiabilityPortfolioStrategyResponse updateAssetAndLiabilityPortfolioStrategy(UpdateAssetAndLiabilityPortfolioStrategyRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention in the policies")
    RequestAssetAndLiabilityPortfolioStrategyResponse requestAssetAndLiabilityPortfolioStrategy(RequestAssetAndLiabilityPortfolioStrategyRequest req);

    @Description("ReCR Retrieve details about the bank's asset and liability policies")
    RetrieveAssetAndLiabilityPortfolioStrategyResponse retrieveAssetAndLiabilityPortfolioStrategy(RetrieveAssetAndLiabilityPortfolioStrategyRequest req);
}