package org.museframework.bian.productcombination;

import org.museframework.bian.productcombination.dto.ControlProductCombinationFacilityRequest;
import org.museframework.bian.productcombination.dto.ControlProductCombinationFacilityResponse;
import org.museframework.bian.productcombination.dto.ExchangeProductCombinationFacilityRequest;
import org.museframework.bian.productcombination.dto.ExchangeProductCombinationFacilityResponse;
import org.museframework.bian.productcombination.dto.ExecuteProductCombinationFacilityRequest;
import org.museframework.bian.productcombination.dto.ExecuteProductCombinationFacilityResponse;
import org.museframework.bian.productcombination.dto.InitiateProductCombinationFacilityRequest;
import org.museframework.bian.productcombination.dto.InitiateProductCombinationFacilityResponse;
import org.museframework.bian.productcombination.dto.RequestProductCombinationFacilityRequest;
import org.museframework.bian.productcombination.dto.RequestProductCombinationFacilityResponse;
import org.museframework.bian.productcombination.dto.RetrieveProductCombinationFacilityRequest;
import org.museframework.bian.productcombination.dto.RetrieveProductCombinationFacilityResponse;
import org.museframework.bian.productcombination.dto.UpdateProductCombinationFacilityRequest;
import org.museframework.bian.productcombination.dto.UpdateProductCombinationFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Product Combination.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="ProductCombination", group="ProductCombinationFacility")
public interface CrProductCombinationFacility {
    @GenericDtxEndpoint
    @Description("CoCR Control the processing of Product Combination Facility")
    ControlProductCombinationFacilityResponse controlProductCombinationFacility(ControlProductCombinationFacilityRequest req);

    @GenericDtxEndpoint
    @Description("EcCR Accept, verify, etc. aspects of Product Combination Facility processing")
    ExchangeProductCombinationFacilityResponse exchangeProductCombinationFacility(ExchangeProductCombinationFacilityRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an available automated action for Product Combination Facility")
    ExecuteProductCombinationFacilityResponse executeProductCombinationFacility(ExecuteProductCombinationFacilityRequest req);

    @GenericDtxEndpoint
    @Description("InCR Instantiate a new Product Combination Facility")
    InitiateProductCombinationFacilityResponse initiateProductCombinationFacility(InitiateProductCombinationFacilityRequest req);

    @Description("ReCR Retrieve details about any aspect of Product Combination Facility")
    RetrieveProductCombinationFacilityResponse retrieveProductCombinationFacility(RetrieveProductCombinationFacilityRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention or a decision with respect to Product Combination Facility")
    RequestProductCombinationFacilityResponse requestProductCombinationFacility(RequestProductCombinationFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details relating to Product Combination Facility")
    UpdateProductCombinationFacilityResponse updateProductCombinationFacility(UpdateProductCombinationFacilityRequest req);
}