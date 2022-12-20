package org.museframework.bian.custodyadministration;

import org.museframework.bian.custodyadministration.dto.ExecuteSettlementRequest;
import org.museframework.bian.custodyadministration.dto.ExecuteSettlementResponse;
import org.museframework.bian.custodyadministration.dto.InitiateSettlementRequest;
import org.museframework.bian.custodyadministration.dto.InitiateSettlementResponse;
import org.museframework.bian.custodyadministration.dto.RequestSettlementRequest;
import org.museframework.bian.custodyadministration.dto.RequestSettlementResponse;
import org.museframework.bian.custodyadministration.dto.RetrieveSettlementRequest;
import org.museframework.bian.custodyadministration.dto.RetrieveSettlementResponse;
import org.museframework.bian.custodyadministration.dto.UpdateSettlementRequest;
import org.museframework.bian.custodyadministration.dto.UpdateSettlementResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Custody Administration.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="CustodyAdministration", group="Settlement")
public interface BqSettlement {
    @GenericDtxEndpoint
    @Description("ExBQ Execute an available automated action for Settlement")
    ExecuteSettlementResponse executeSettlement(ExecuteSettlementRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Settlement")
    InitiateSettlementResponse initiateSettlement(InitiateSettlementRequest req);

    @Description("ReBQ Retrieve details about any aspect of Settlement")
    RetrieveSettlementResponse retrieveSettlement(RetrieveSettlementRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Settlement")
    RequestSettlementResponse requestSettlement(RequestSettlementRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Settlement")
    UpdateSettlementResponse updateSettlement(UpdateSettlementRequest req);
}