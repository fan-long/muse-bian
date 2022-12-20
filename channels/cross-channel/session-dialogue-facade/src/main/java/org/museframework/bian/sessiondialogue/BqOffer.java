package org.museframework.bian.sessiondialogue;

import org.museframework.bian.sessiondialogue.dto.InitiateOfferRequest;
import org.museframework.bian.sessiondialogue.dto.InitiateOfferResponse;
import org.museframework.bian.sessiondialogue.dto.RetrieveOfferRequest;
import org.museframework.bian.sessiondialogue.dto.RetrieveOfferResponse;
import org.museframework.bian.sessiondialogue.dto.UpdateOfferRequest;
import org.museframework.bian.sessiondialogue.dto.UpdateOfferResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="SessionDialogue", group="Offer")
public interface BqOffer {
    @GenericDtxEndpoint
    @Description("InBQ Initiate customer offer handling")
    InitiateOfferResponse initiateOffer(InitiateOfferRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for offer handling")
    UpdateOfferResponse updateOffer(UpdateOfferRequest req);

    @Description("ReBQ Retrieve details about offer handling")
    RetrieveOfferResponse retrieveOffer(RetrieveOfferRequest req);
}