package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.ExchangeSweepRequest;
import org.museframework.bian.mortgageloan.dto.ExchangeSweepResponse;
import org.museframework.bian.mortgageloan.dto.InitiateSweepRequest;
import org.museframework.bian.mortgageloan.dto.InitiateSweepResponse;
import org.museframework.bian.mortgageloan.dto.RetrieveSweepRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveSweepResponse;
import org.museframework.bian.mortgageloan.dto.UpdateSweepRequest;
import org.museframework.bian.mortgageloan.dto.UpdateSweepResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="Sweep")
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