package org.museframework.bian.issdevadm;

import org.museframework.bian.issdevadm.dto.InitiateIssuedDeviceAllocationRequest;
import org.museframework.bian.issdevadm.dto.InitiateIssuedDeviceAllocationResponse;
import org.museframework.bian.issdevadm.dto.RetrieveIssuedDeviceAllocationRequest;
import org.museframework.bian.issdevadm.dto.RetrieveIssuedDeviceAllocationResponse;
import org.museframework.bian.issdevadm.dto.UpdateIssuedDeviceAllocationRequest;
import org.museframework.bian.issdevadm.dto.UpdateIssuedDeviceAllocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain an inventory or holding of some resource and make assignments/allocations as requested  within Issued Device Administration.  Example: Track the inventory and administer the distribution of central cash holdings throughout the branch & ATM network.")
@GenericDomain(name="IssuedDeviceAdministration", group="IssuedDeviceAllocation")
public interface CrIssuedDeviceAllocation {
    @GenericDtxEndpoint
    @Description("PrCR Allocate an issued device (selected type will internally invoke assignment type)")
    InitiateIssuedDeviceAllocationResponse initiateIssuedDeviceAllocation(InitiateIssuedDeviceAllocationRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of an allocation")
    UpdateIssuedDeviceAllocationResponse updateIssuedDeviceAllocation(UpdateIssuedDeviceAllocationRequest req);

    @Description("ReCR Retrieve details about an allocation")
    RetrieveIssuedDeviceAllocationResponse retrieveIssuedDeviceAllocation(RetrieveIssuedDeviceAllocationRequest req);
}