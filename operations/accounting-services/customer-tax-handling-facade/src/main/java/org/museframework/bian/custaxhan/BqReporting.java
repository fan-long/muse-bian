package org.museframework.bian.custaxhan;

import org.museframework.bian.custaxhan.dto.RetrieveReportingRequest;
import org.museframework.bian.custaxhan.dto.RetrieveReportingResponse;
import org.museframework.bian.custaxhan.dto.UpdateReportingRequest;
import org.museframework.bian.custaxhan.dto.UpdateReportingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="CustomerTaxHandling", group="Reporting")
public interface BqReporting {
    @GenericDtxEndpoint
    @Description("UpBQ Update customer tax reporting details")
    UpdateReportingResponse updateReporting(UpdateReportingRequest req);

    @Description("ReBQ Retrieve details about the customer tax reporting")
    RetrieveReportingResponse retrieveReporting(RetrieveReportingRequest req);
}