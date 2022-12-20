package org.museframework.bian.leasing;

import org.museframework.bian.leasing.dto.ExchangeSweepRequest;
import org.museframework.bian.leasing.dto.ExchangeSweepResponse;
import org.museframework.bian.leasing.dto.InitiateSweepRequest;
import org.museframework.bian.leasing.dto.InitiateSweepResponse;
import org.museframework.bian.leasing.dto.RetrieveSweepRequest;
import org.museframework.bian.leasing.dto.RetrieveSweepResponse;
import org.museframework.bian.leasing.dto.UpdateSweepRequest;
import org.museframework.bian.leasing.dto.UpdateSweepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Fulfill any scheduled and ad-hoc obligations under a service arrangement, most typically for a financial product or facility  within Leasing.  Example: Perform the scheduled (e.g. statements, standing orders) and ad-hoc/requested (e.g. balance inquiries, fund transfers) fulfillment tasks for a customer current account facility.")
@GenericDomain(name="Leasing", group="Sweep")
public interface BqSweep {
    @GenericDtxEndpoint
    @Description("EcBQ Accept, verify, etc. aspects of Sweep processing")
    ExchangeSweepResponse exchangeSweep(ExchangeSweepRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Sweep")
    InitiateSweepResponse initiateSweep(InitiateSweepRequest req);

    @Description("ReBQ Retrieve details about any aspect of Sweep")
    RetrieveSweepResponse retrieveSweep(RetrieveSweepRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Sweep")
    UpdateSweepResponse updateSweep(UpdateSweepRequest req);
}