package org.museframework.bian.poiofser;

import org.museframework.bian.poiofser.dto.ExecuteInventoryRequest;
import org.museframework.bian.poiofser.dto.ExecuteInventoryResponse;
import org.museframework.bian.poiofser.dto.RetrieveInventoryRequest;
import org.museframework.bian.poiofser.dto.RetrieveInventoryResponse;
import org.museframework.bian.poiofser.dto.UpdateInventoryRequest;
import org.museframework.bian.poiofser.dto.UpdateInventoryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="PointofService", group="Inventory")
public interface BqInventory {
    @GenericDtxEndpoint
    @Description("UpBQ Update inventory details")
    UpdateInventoryResponse updateInventory(UpdateInventoryRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute transactions against the inventory position")
    ExecuteInventoryResponse executeInventory(ExecuteInventoryRequest req);

    @Description("ReBQ Retrieve details about inventory holdings and usage")
    RetrieveInventoryResponse retrieveInventory(RetrieveInventoryRequest req);
}