package org.museframework.bian.directdebit;

import org.museframework.bian.directdebit.dto.InitiateReportingRequest;
import org.museframework.bian.directdebit.dto.InitiateReportingResponse;
import org.museframework.bian.directdebit.dto.RetrieveReportingRequest;
import org.museframework.bian.directdebit.dto.RetrieveReportingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Batch Debit arrangement within the Direct Debit Facility")
@GenericDomain(name="DirectDebit", group="Reporting")
public interface BqReporting {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Reporting")
    InitiateReportingResponse initiateReporting(InitiateReportingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Reporting")
    RetrieveReportingResponse retrieveReporting(RetrieveReportingRequest req);
}