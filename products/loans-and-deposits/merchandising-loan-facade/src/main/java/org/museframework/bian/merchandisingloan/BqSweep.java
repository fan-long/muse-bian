package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.ExchangeSweepRequest;
import org.museframework.bian.merchandisingloan.dto.ExchangeSweepResponse;
import org.museframework.bian.merchandisingloan.dto.InitiateSweepRequest;
import org.museframework.bian.merchandisingloan.dto.InitiateSweepResponse;
import org.museframework.bian.merchandisingloan.dto.RetrieveSweepRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveSweepResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateSweepRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateSweepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="Sweep")
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