package org.museframework.bian.collections;

import org.museframework.bian.collections.dto.ExchangeCollateralValuationRequest;
import org.museframework.bian.collections.dto.ExchangeCollateralValuationResponse;
import org.museframework.bian.collections.dto.InitiateCollateralValuationRequest;
import org.museframework.bian.collections.dto.InitiateCollateralValuationResponse;
import org.museframework.bian.collections.dto.RetrieveCollateralValuationRequest;
import org.museframework.bian.collections.dto.RetrieveCollateralValuationResponse;
import org.museframework.bian.collections.dto.UpdateCollateralValuationRequest;
import org.museframework.bian.collections.dto.UpdateCollateralValuationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="Collections", group="CollateralValuation")
public interface BqCollateralValuation {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Collateral Valuation processing")
    ExchangeCollateralValuationResponse exchangeCollateralValuation(ExchangeCollateralValuationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Collateral Valuation")
    InitiateCollateralValuationResponse initiateCollateralValuation(InitiateCollateralValuationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Collateral Valuation")
    RetrieveCollateralValuationResponse retrieveCollateralValuation(RetrieveCollateralValuationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Collateral Valuation")
    UpdateCollateralValuationResponse updateCollateralValuation(UpdateCollateralValuationRequest req);
}