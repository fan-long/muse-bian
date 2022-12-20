package org.museframework.bian.bracurdis;

import org.museframework.bian.bracurdis.dto.RequestInventoryDistributionOversightRequest;
import org.museframework.bian.bracurdis.dto.RequestInventoryDistributionOversightResponse;
import org.museframework.bian.bracurdis.dto.RetrieveInventoryDistributionOversightRequest;
import org.museframework.bian.bracurdis.dto.RetrieveInventoryDistributionOversightResponse;
import org.museframework.bian.bracurdis.dto.UpdateInventoryDistributionOversightRequest;
import org.museframework.bian.bracurdis.dto.UpdateInventoryDistributionOversightResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="BranchCurrencyDistribution", group="InventoryDistributionOversight")
public interface BqInventoryDistributionOversight {
    @Description("ReBQ Retrieve details about any aspect of Inventory Distribution Oversight")
    RetrieveInventoryDistributionOversightResponse retrieveInventoryDistributionOversight(RetrieveInventoryDistributionOversightRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Inventory Distribution Oversight")
    RequestInventoryDistributionOversightResponse requestInventoryDistributionOversight(RequestInventoryDistributionOversightRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Inventory Distribution Oversight")
    UpdateInventoryDistributionOversightResponse updateInventoryDistributionOversight(UpdateInventoryDistributionOversightRequest req);
}