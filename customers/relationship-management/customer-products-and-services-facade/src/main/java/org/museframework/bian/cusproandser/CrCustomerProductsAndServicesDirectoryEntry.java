package org.museframework.bian.cusproandser;

import org.museframework.bian.cusproandser.dto.ControlCustomerProductsAndServicesDirectoryEntryRequest;
import org.museframework.bian.cusproandser.dto.ControlCustomerProductsAndServicesDirectoryEntryResponse;
import org.museframework.bian.cusproandser.dto.ExecuteCustomerProductsAndServicesDirectoryEntryRequest;
import org.museframework.bian.cusproandser.dto.ExecuteCustomerProductsAndServicesDirectoryEntryResponse;
import org.museframework.bian.cusproandser.dto.NotifyCustomerProductsAndServicesDirectoryEntryRequest;
import org.museframework.bian.cusproandser.dto.NotifyCustomerProductsAndServicesDirectoryEntryResponse;
import org.museframework.bian.cusproandser.dto.RegisterCustomerProductsAndServicesDirectoryEntryRequest;
import org.museframework.bian.cusproandser.dto.RegisterCustomerProductsAndServicesDirectoryEntryResponse;
import org.museframework.bian.cusproandser.dto.RequestCustomerProductsAndServicesDirectoryEntryRequest;
import org.museframework.bian.cusproandser.dto.RequestCustomerProductsAndServicesDirectoryEntryResponse;
import org.museframework.bian.cusproandser.dto.UpdateCustomerProductsAndServicesDirectoryEntryRequest;
import org.museframework.bian.cusproandser.dto.UpdateCustomerProductsAndServicesDirectoryEntryResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Capture and maintain reference information about some type of entitity within Customer Products and Services.")
@GenericDomain(name="CustomerProductsandServices", group="CustomerProductsAndServicesDirectoryEntry")
public interface CrCustomerProductsAndServicesDirectoryEntry {
    @GenericDtxEndpoint
    @Description("Control Customer Products And Services Directory Entry")
    ControlCustomerProductsAndServicesDirectoryEntryResponse controlCustomerProductsAndServicesDirectoryEntry(ControlCustomerProductsAndServicesDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Execute Customer Products And Services Directory Entry")
    ExecuteCustomerProductsAndServicesDirectoryEntryResponse executeCustomerProductsAndServicesDirectoryEntry(ExecuteCustomerProductsAndServicesDirectoryEntryRequest req);

    @Description("Notify Customer Products And Services Directory Entry")
    NotifyCustomerProductsAndServicesDirectoryEntryResponse notifyCustomerProductsAndServicesDirectoryEntry(NotifyCustomerProductsAndServicesDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Register Customer Products And Services Directory Entry")
    RegisterCustomerProductsAndServicesDirectoryEntryResponse registerCustomerProductsAndServicesDirectoryEntry(RegisterCustomerProductsAndServicesDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Request Customer Products And Services Directory Entry")
    RequestCustomerProductsAndServicesDirectoryEntryResponse requestCustomerProductsAndServicesDirectoryEntry(RequestCustomerProductsAndServicesDirectoryEntryRequest req);

    @GenericDtxEndpoint
    @Description("Update Customer Products And Services Directory Entry")
    UpdateCustomerProductsAndServicesDirectoryEntryResponse updateCustomerProductsAndServicesDirectoryEntry(UpdateCustomerProductsAndServicesDirectoryEntryRequest req);
}