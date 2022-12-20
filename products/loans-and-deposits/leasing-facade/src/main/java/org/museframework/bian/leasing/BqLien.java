package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.ExchangeLienRequest;
import org.museframework.bian.leasing.dto.ExchangeLienResponse;
import org.museframework.bian.leasing.dto.InitiateLienRequest;
import org.museframework.bian.leasing.dto.InitiateLienResponse;
import org.museframework.bian.leasing.dto.RetrieveLienRequest;
import org.museframework.bian.leasing.dto.RetrieveLienResponse;
import org.museframework.bian.leasing.dto.UpdateLienRequest;
import org.museframework.bian.leasing.dto.UpdateLienResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="Lien")
public interface BqLien {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Lien processing")
    ExchangeLienResponse exchangeLien(ExchangeLienRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Lien")
    InitiateLienResponse initiateLien(InitiateLienRequest req);

    @Description("ReBQ Retrieve details about any aspect of Lien")
    RetrieveLienResponse retrieveLien(RetrieveLienRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Lien")
    UpdateLienResponse updateLien(UpdateLienRequest req);
}