package org.museframework.bian.loan;

import org.museframework.bian.loan.dto.InitiateRestructuringRequest;
import org.museframework.bian.loan.dto.InitiateRestructuringResponse;
import org.museframework.bian.loan.dto.RequestRestructuringRequest;
import org.museframework.bian.loan.dto.RequestRestructuringResponse;
import org.museframework.bian.loan.dto.RetrieveRestructuringRequest;
import org.museframework.bian.loan.dto.RetrieveRestructuringResponse;
import org.museframework.bian.loan.dto.UpdateRestructuringRequest;
import org.museframework.bian.loan.dto.UpdateRestructuringResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="Loan", group="Restructuring")
public interface BqRestructuring {
    @GenericDtxEndpoint
    @Description("InBQ Initiate loan account restructuring")
    InitiateRestructuringResponse initiateRestructuring(InitiateRestructuringRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a loan or restructuring activities")
    UpdateRestructuringResponse updateRestructuring(UpdateRestructuringRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request activity associated with a restructuring effort")
    RequestRestructuringResponse requestRestructuring(RequestRestructuringRequest req);

    @Description("ReBQ Retrieve details about a loan restructuring task")
    RetrieveRestructuringResponse retrieveRestructuring(RetrieveRestructuringRequest req);
}