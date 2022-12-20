package org.museframework.bian.consumerloan;

import org.museframework.bian.consumerloan.dto.InitiateRestructuringRequest;
import org.museframework.bian.consumerloan.dto.InitiateRestructuringResponse;
import org.museframework.bian.consumerloan.dto.RequestRestructuringRequest;
import org.museframework.bian.consumerloan.dto.RequestRestructuringResponse;
import org.museframework.bian.consumerloan.dto.RetrieveRestructuringRequest;
import org.museframework.bian.consumerloan.dto.RetrieveRestructuringResponse;
import org.museframework.bian.consumerloan.dto.UpdateRestructuringRequest;
import org.museframework.bian.consumerloan.dto.UpdateRestructuringResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="ConsumerLoan", group="Restructuring")
public interface BqRestructuring {
    @GenericDtxEndpoint
    @Description("InBQ Initiate consumer loan account restructuring")
    InitiateRestructuringResponse initiateRestructuring(InitiateRestructuringRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a consumer loan or restructuring activities")
    UpdateRestructuringResponse updateRestructuring(UpdateRestructuringRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request activity associated with a restructuring effort (e.g. negotiate)")
    RequestRestructuringResponse requestRestructuring(RequestRestructuringRequest req);

    @Description("ReBQ Retrieve details about a consumer loan restructuring task")
    RetrieveRestructuringResponse retrieveRestructuring(RetrieveRestructuringRequest req);
}