package org.museframework.bian.corporateloan;

import org.museframework.bian.corporateloan.dto.InitiateRestructuringRequest;
import org.museframework.bian.corporateloan.dto.InitiateRestructuringResponse;
import org.museframework.bian.corporateloan.dto.RequestRestructuringRequest;
import org.museframework.bian.corporateloan.dto.RequestRestructuringResponse;
import org.museframework.bian.corporateloan.dto.RetrieveRestructuringRequest;
import org.museframework.bian.corporateloan.dto.RetrieveRestructuringResponse;
import org.museframework.bian.corporateloan.dto.UpdateRestructuringRequest;
import org.museframework.bian.corporateloan.dto.UpdateRestructuringResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="CorporateLoan", group="Restructuring")
public interface BqRestructuring {
    @GenericDtxEndpoint
    @Description("InBQ Initiate corporate loan account restructuring")
    InitiateRestructuringResponse initiateRestructuring(InitiateRestructuringRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a corporate loan or restructuring activities")
    UpdateRestructuringResponse updateRestructuring(UpdateRestructuringRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request activity associated with a restructuring effort")
    RequestRestructuringResponse requestRestructuring(RequestRestructuringRequest req);

    @Description("ReBQ Retrieve details about a corporate loan restructuring task")
    RetrieveRestructuringResponse retrieveRestructuring(RetrieveRestructuringRequest req);
}