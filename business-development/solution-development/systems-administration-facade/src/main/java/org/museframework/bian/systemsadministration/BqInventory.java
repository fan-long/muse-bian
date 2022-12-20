package org.museframework.bian.systemsadministration;

import org.museframework.bian.systemsadministration.dto.CaptureInventoryRequest;
import org.museframework.bian.systemsadministration.dto.CaptureInventoryResponse;
import org.museframework.bian.systemsadministration.dto.RequestInventoryRequest;
import org.museframework.bian.systemsadministration.dto.RequestInventoryResponse;
import org.museframework.bian.systemsadministration.dto.RetrieveInventoryRequest;
import org.museframework.bian.systemsadministration.dto.RetrieveInventoryResponse;
import org.museframework.bian.systemsadministration.dto.UpdateInventoryRequest;
import org.museframework.bian.systemsadministration.dto.UpdateInventoryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="SystemsAdministration", group="Inventory")
public interface BqInventory {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Inventory activity or event related information")
    CaptureInventoryResponse captureInventory(CaptureInventoryRequest req);

    @Description("ReBQ Retrieve details about any aspect of Inventory")
    RetrieveInventoryResponse retrieveInventory(RetrieveInventoryRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Inventory")
    RequestInventoryResponse requestInventory(RequestInventoryRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Inventory")
    UpdateInventoryResponse updateInventory(UpdateInventoryRequest req);
}