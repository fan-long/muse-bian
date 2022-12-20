package org.museframework.bian.bracurdis;

import org.museframework.bian.bracurdis.dto.ExchangeInventoryProvisioningRequest;
import org.museframework.bian.bracurdis.dto.ExchangeInventoryProvisioningResponse;
import org.museframework.bian.bracurdis.dto.RequestInventoryProvisioningRequest;
import org.museframework.bian.bracurdis.dto.RequestInventoryProvisioningResponse;
import org.museframework.bian.bracurdis.dto.RetrieveInventoryProvisioningRequest;
import org.museframework.bian.bracurdis.dto.RetrieveInventoryProvisioningResponse;
import org.museframework.bian.bracurdis.dto.UpdateInventoryProvisioningRequest;
import org.museframework.bian.bracurdis.dto.UpdateInventoryProvisioningResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="BranchCurrencyDistribution", group="InventoryProvisioning")
public interface BqInventoryProvisioning {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Inventory Provisioning processing")
    ExchangeInventoryProvisioningResponse exchangeInventoryProvisioning(ExchangeInventoryProvisioningRequest req);

    @Description("ReBQ Retrieve details about any aspect of Inventory Provisioning")
    RetrieveInventoryProvisioningResponse retrieveInventoryProvisioning(RetrieveInventoryProvisioningRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Inventory Provisioning")
    RequestInventoryProvisioningResponse requestInventoryProvisioning(RequestInventoryProvisioningRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Inventory Provisioning")
    UpdateInventoryProvisioningResponse updateInventoryProvisioning(UpdateInventoryProvisioningRequest req);
}