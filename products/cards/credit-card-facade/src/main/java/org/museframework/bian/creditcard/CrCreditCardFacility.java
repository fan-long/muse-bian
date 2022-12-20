package org.museframework.bian.creditcard;

import org.museframework.bian.creditcard.dto.InitiateCreditCardFacilityRequest;
import org.museframework.bian.creditcard.dto.InitiateCreditCardFacilityResponse;
import org.museframework.bian.creditcard.dto.RetrieveCreditCardFacilityRequest;
import org.museframework.bian.creditcard.dto.RetrieveCreditCardFacilityResponse;
import org.museframework.bian.creditcard.dto.UpdateCreditCardFacilityRequest;
import org.museframework.bian.creditcard.dto.UpdateCreditCardFacilityResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility within Credit Card. ")
@GenericDomain(name="CreditCard", group="CreditCardFacility")
public interface CrCreditCardFacility {
    @GenericDtxEndpoint
    @Description("InCR Initiate a new card account")
    InitiateCreditCardFacilityResponse initiateCreditCardFacility(InitiateCreditCardFacilityRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about a card account")
    UpdateCreditCardFacilityResponse updateCreditCardFacility(UpdateCreditCardFacilityRequest req);

    @Description("ReCR Retrieve details about a card account")
    RetrieveCreditCardFacilityResponse retrieveCreditCardFacility(RetrieveCreditCardFacilityRequest req);
}