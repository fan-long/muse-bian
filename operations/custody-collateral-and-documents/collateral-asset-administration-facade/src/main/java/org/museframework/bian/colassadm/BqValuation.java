package org.museframework.bian.colassadm;

import org.museframework.bian.colassadm.dto.CreateValuationRequest;
import org.museframework.bian.colassadm.dto.CreateValuationResponse;
import org.museframework.bian.colassadm.dto.RequestValuationRequest;
import org.museframework.bian.colassadm.dto.RequestValuationResponse;
import org.museframework.bian.colassadm.dto.RetrieveValuationRequest;
import org.museframework.bian.colassadm.dto.RetrieveValuationResponse;
import org.museframework.bian.colassadm.dto.UpdateValuationRequest;
import org.museframework.bian.colassadm.dto.UpdateValuationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="CollateralAssetAdministration", group="Valuation")
public interface BqValuation {
    @GenericDtxEndpoint
    @Description("CrBQ Create a valuation for a collateral asset")
    CreateValuationResponse createValuation(CreateValuationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for a valuation")
    UpdateValuationResponse updateValuation(UpdateValuationRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request an ad-hoc valuation (override the schedule)")
    RequestValuationResponse requestValuation(RequestValuationRequest req);

    @Description("ReBQ Retrieve details about an valuation task")
    RetrieveValuationResponse retrieveValuation(RetrieveValuationRequest req);
}