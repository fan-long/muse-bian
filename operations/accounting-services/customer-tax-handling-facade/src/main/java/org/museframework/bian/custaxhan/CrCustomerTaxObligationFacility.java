package org.museframework.bian.custaxhan;

import org.museframework.bian.custaxhan.dto.InitiateCustomerTaxObligationFacilityRequest;
import org.museframework.bian.custaxhan.dto.InitiateCustomerTaxObligationFacilityResponse;
import org.museframework.bian.custaxhan.dto.RetrieveCustomerTaxObligationFacilityRequest;
import org.museframework.bian.custaxhan.dto.RetrieveCustomerTaxObligationFacilityResponse;
import org.museframework.bian.custaxhan.dto.UpdateCustomerTaxObligationFacilityRequest;
import org.museframework.bian.custaxhan.dto.UpdateCustomerTaxObligationFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Customer Tax Handling. ")
@GenericDomain(name="CustomerTaxHandling", group="CustomerTaxObligationFacility")
public interface CrCustomerTaxObligationFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate customer tax handling")
    InitiateCustomerTaxObligationFacilityResponse initiateCustomerTaxObligationFacility(InitiateCustomerTaxObligationFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details of the customer tax handling facility")
    UpdateCustomerTaxObligationFacilityResponse updateCustomerTaxObligationFacility(UpdateCustomerTaxObligationFacilityRequest req);

    @Description("ReCR Retrieve details relating to the customer tax handling")
    RetrieveCustomerTaxObligationFacilityResponse retrieveCustomerTaxObligationFacility(RetrieveCustomerTaxObligationFacilityRequest req);
}