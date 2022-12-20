package org.museframework.bian.transactionengine;

import org.museframework.bian.transactionengine.dto.ExecuteTransactionScheduleFacilityRequest;
import org.museframework.bian.transactionengine.dto.ExecuteTransactionScheduleFacilityResponse;
import org.museframework.bian.transactionengine.dto.InitiateTransactionScheduleFacilityRequest;
import org.museframework.bian.transactionengine.dto.InitiateTransactionScheduleFacilityResponse;
import org.museframework.bian.transactionengine.dto.RetrieveTransactionScheduleFacilityRequest;
import org.museframework.bian.transactionengine.dto.RetrieveTransactionScheduleFacilityResponse;
import org.museframework.bian.transactionengine.dto.UpdateTransactionScheduleFacilityRequest;
import org.museframework.bian.transactionengine.dto.UpdateTransactionScheduleFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Transaction Engine. ")
@GenericDomain(name="TransactionEngine", group="TransactionScheduleFacility")
public interface CrTransactionScheduleFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate delegated transaction processing for a product instance")
    InitiateTransactionScheduleFacilityResponse initiateTransactionScheduleFacility(InitiateTransactionScheduleFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an active transaction processing arrangement")
    UpdateTransactionScheduleFacilityResponse updateTransactionScheduleFacility(UpdateTransactionScheduleFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated function for a transaction processing arrangement")
    ExecuteTransactionScheduleFacilityResponse executeTransactionScheduleFacility(ExecuteTransactionScheduleFacilityRequest req);

    @Description("ReCR Retrieve details about delegated transaction processing for a product instance")
    RetrieveTransactionScheduleFacilityResponse retrieveTransactionScheduleFacility(RetrieveTransactionScheduleFacilityRequest req);
}