package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.InitiateCorporateActionRequest;
import org.museframework.bian.leasing.dto.InitiateCorporateActionResponse;
import org.museframework.bian.leasing.dto.RetrieveCorporateActionRequest;
import org.museframework.bian.leasing.dto.RetrieveCorporateActionResponse;
import org.museframework.bian.leasing.dto.UpdateCorporateActionRequest;
import org.museframework.bian.leasing.dto.UpdateCorporateActionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="CorporateAction")
public interface BqCorporateAction {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Corporate Action")
    InitiateCorporateActionResponse initiateCorporateAction(InitiateCorporateActionRequest req);

    @Description("ReBQ Retrieve details about any aspect of Corporate Action")
    RetrieveCorporateActionResponse retrieveCorporateAction(RetrieveCorporateActionRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Corporate Action")
    UpdateCorporateActionResponse updateCorporateAction(UpdateCorporateActionRequest req);
}