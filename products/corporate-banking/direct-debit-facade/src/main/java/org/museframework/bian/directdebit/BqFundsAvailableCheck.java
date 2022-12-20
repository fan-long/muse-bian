package org.museframework.bian.directdebit;

import org.museframework.bian.directdebit.dto.ExecuteFundsAvailableCheckRequest;
import org.museframework.bian.directdebit.dto.ExecuteFundsAvailableCheckResponse;
import org.museframework.bian.directdebit.dto.RequestFundsAvailableCheckRequest;
import org.museframework.bian.directdebit.dto.RequestFundsAvailableCheckResponse;
import org.museframework.bian.directdebit.dto.RetrieveFundsAvailableCheckRequest;
import org.museframework.bian.directdebit.dto.RetrieveFundsAvailableCheckResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The configuration and execution of Batch Debit arrangement within the Direct Debit Facility")
@GenericDomain(name="DirectDebit", group="FundsAvailableCheck")
public interface BqFundsAvailableCheck {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Funds Available Check processing")
    ExecuteFundsAvailableCheckResponse executeFundsAvailableCheck(ExecuteFundsAvailableCheckRequest req);

    @Description("ReBQ Retrieve details about any aspect of Funds Available Check")
    RetrieveFundsAvailableCheckResponse retrieveFundsAvailableCheck(RetrieveFundsAvailableCheckRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Funds Available Check")
    RequestFundsAvailableCheckResponse requestFundsAvailableCheck(RequestFundsAvailableCheckRequest req);
}