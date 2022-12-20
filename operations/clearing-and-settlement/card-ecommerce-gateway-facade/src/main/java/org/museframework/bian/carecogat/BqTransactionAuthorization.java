package org.museframework.bian.carecogat;

import org.museframework.bian.carecogat.dto.InitiateTransactionAuthorizationRequest;
import org.museframework.bian.carecogat.dto.InitiateTransactionAuthorizationResponse;
import org.museframework.bian.carecogat.dto.RetrieveTransactionAuthorizationRequest;
import org.museframework.bian.carecogat.dto.RetrieveTransactionAuthorizationResponse;
import org.museframework.bian.carecogat.dto.UpdateTransactionAuthorizationRequest;
import org.museframework.bian.carecogat.dto.UpdateTransactionAuthorizationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="CardeCommerceGateway", group="TransactionAuthorization")
public interface BqTransactionAuthorization {
    @GenericDtxEndpoint
    @Description("InBQ Initiate card transaction authorization (routed to issuing bank)")
    InitiateTransactionAuthorizationResponse initiateTransactionAuthorization(InitiateTransactionAuthorizationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of a card transaction used for authorization")
    UpdateTransactionAuthorizationResponse updateTransactionAuthorization(UpdateTransactionAuthorizationRequest req);

    @Description("ReBQ Retrieve details about a card transaction authorization")
    RetrieveTransactionAuthorizationResponse retrieveTransactionAuthorization(RetrieveTransactionAuthorizationRequest req);
}