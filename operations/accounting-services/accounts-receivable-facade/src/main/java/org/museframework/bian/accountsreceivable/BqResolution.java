package org.museframework.bian.accountsreceivable;

import org.museframework.bian.accountsreceivable.dto.InitiateResolutionRequest;
import org.museframework.bian.accountsreceivable.dto.InitiateResolutionResponse;
import org.museframework.bian.accountsreceivable.dto.RetrieveResolutionRequest;
import org.museframework.bian.accountsreceivable.dto.RetrieveResolutionResponse;
import org.museframework.bian.accountsreceivable.dto.UpdateResolutionRequest;
import org.museframework.bian.accountsreceivable.dto.UpdateResolutionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Accounts Receivable.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="AccountsReceivable", group="Resolution")
public interface BqResolution {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Resolution")
    InitiateResolutionResponse initiateResolution(InitiateResolutionRequest req);

    @Description("ReBQ Retrieve details about any aspect of Resolution")
    RetrieveResolutionResponse retrieveResolution(RetrieveResolutionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Resolution")
    UpdateResolutionResponse updateResolution(UpdateResolutionRequest req);
}