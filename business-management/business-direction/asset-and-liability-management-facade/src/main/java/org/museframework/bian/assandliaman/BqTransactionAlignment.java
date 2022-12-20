package org.museframework.bian.assandliaman;

import org.museframework.bian.assandliaman.dto.CreateTransactionAlignmentRequest;
import org.museframework.bian.assandliaman.dto.CreateTransactionAlignmentResponse;
import org.museframework.bian.assandliaman.dto.RequestTransactionAlignmentRequest;
import org.museframework.bian.assandliaman.dto.RequestTransactionAlignmentResponse;
import org.museframework.bian.assandliaman.dto.RetrieveTransactionAlignmentRequest;
import org.museframework.bian.assandliaman.dto.RetrieveTransactionAlignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of goals and objectives for the enterprise and its main divisions  Example: Increase marketshare")
@GenericDomain(name="AssetAndLiabilityManagement", group="TransactionAlignment")
public interface BqTransactionAlignment {
    @GenericDtxEndpoint
    @Description("CrBQ Create a proposed transaction submission under the policy")
    CreateTransactionAlignmentResponse createTransactionAlignment(CreateTransactionAlignmentRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention during an assessment")
    RequestTransactionAlignmentResponse requestTransactionAlignment(RequestTransactionAlignmentRequest req);

    @Description("ReBQ Retrieve details about a transaction alignment assessment")
    RetrieveTransactionAlignmentResponse retrieveTransactionAlignment(RetrieveTransactionAlignmentRequest req);
}