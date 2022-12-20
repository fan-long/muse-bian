package org.museframework.bian.custodyadministration;

import org.museframework.bian.custodyadministration.dto.ExecuteSecuritiesReportingRequest;
import org.museframework.bian.custodyadministration.dto.ExecuteSecuritiesReportingResponse;
import org.museframework.bian.custodyadministration.dto.InitiateSecuritiesReportingRequest;
import org.museframework.bian.custodyadministration.dto.InitiateSecuritiesReportingResponse;
import org.museframework.bian.custodyadministration.dto.RequestSecuritiesReportingRequest;
import org.museframework.bian.custodyadministration.dto.RequestSecuritiesReportingResponse;
import org.museframework.bian.custodyadministration.dto.RetrieveSecuritiesReportingRequest;
import org.museframework.bian.custodyadministration.dto.RetrieveSecuritiesReportingResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="CustodyAdministration", group="SecuritiesReporting")
public interface BqSecuritiesReporting {
    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Securities Reporting")
    ExecuteSecuritiesReportingResponse executeSecuritiesReporting(ExecuteSecuritiesReportingRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Securities Reporting")
    InitiateSecuritiesReportingResponse initiateSecuritiesReporting(InitiateSecuritiesReportingRequest req);

    @Description("ReBQ Retrieve details about any aspect of Securities Reporting")
    RetrieveSecuritiesReportingResponse retrieveSecuritiesReporting(RetrieveSecuritiesReportingRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Securities Reporting")
    RequestSecuritiesReportingResponse requestSecuritiesReporting(RequestSecuritiesReportingRequest req);
}