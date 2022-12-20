package org.museframework.bian.carteradm;

import org.museframework.bian.carteradm.dto.ProvideCardPOSDeviceAllocationRequest;
import org.museframework.bian.carteradm.dto.ProvideCardPOSDeviceAllocationResponse;
import org.museframework.bian.carteradm.dto.RetrieveCardPOSDeviceAllocationRequest;
import org.museframework.bian.carteradm.dto.RetrieveCardPOSDeviceAllocationResponse;
import org.museframework.bian.carteradm.dto.UpdateCardPOSDeviceAllocationRequest;
import org.museframework.bian.carteradm.dto.UpdateCardPOSDeviceAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Card Terminal Administration.  Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.")
@GenericDomain(name="CardTerminalAdministration", group="CardPOSDeviceAllocation")
public interface CrCardPOSDeviceAllocation {
    @GenericDtxEndpoint
    @Description("PrCR Initial provision and registering of a point of sale (POS) device")
    ProvideCardPOSDeviceAllocationResponse provideCardPOSDeviceAllocation(ProvideCardPOSDeviceAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about the POS device")
    UpdateCardPOSDeviceAllocationResponse updateCardPOSDeviceAllocation(UpdateCardPOSDeviceAllocationRequest req);

    @Description("ReCR Retrieve details about the POS device")
    RetrieveCardPOSDeviceAllocationResponse retrieveCardPOSDeviceAllocation(RetrieveCardPOSDeviceAllocationRequest req);
}