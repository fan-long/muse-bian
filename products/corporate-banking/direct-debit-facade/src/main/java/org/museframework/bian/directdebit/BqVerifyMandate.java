package org.museframework.bian.directdebit;

import org.museframework.bian.directdebit.dto.ExecuteVerifyMandateRequest;
import org.museframework.bian.directdebit.dto.ExecuteVerifyMandateResponse;
import org.museframework.bian.directdebit.dto.RetrieveVerifyMandateRequest;
import org.museframework.bian.directdebit.dto.RetrieveVerifyMandateResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Batch Debit arrangement within the Direct Debit Facility")
@GenericDomain(name="DirectDebit", group="VerifyMandate")
public interface BqVerifyMandate {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Verify Mandate processing")
    ExecuteVerifyMandateResponse executeVerifyMandate(ExecuteVerifyMandateRequest req);

    @Description("ReBQ Retrieve details about any aspect of Verify Mandate")
    RetrieveVerifyMandateResponse retrieveVerifyMandate(RetrieveVerifyMandateRequest req);
}