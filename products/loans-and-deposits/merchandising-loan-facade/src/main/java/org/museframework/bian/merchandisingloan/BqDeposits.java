package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.InitiateDepositsRequest;
import org.museframework.bian.merchandisingloan.dto.InitiateDepositsResponse;
import org.museframework.bian.merchandisingloan.dto.RetrieveDepositsRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveDepositsResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateDepositsRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateDepositsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="Deposits")
public interface BqDeposits {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Deposits")
    InitiateDepositsResponse initiateDeposits(InitiateDepositsRequest req);

    @Description("ReBQ Retrieve details about any aspect of Deposits")
    RetrieveDepositsResponse retrieveDeposits(RetrieveDepositsRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Deposits")
    UpdateDepositsResponse updateDeposits(UpdateDepositsRequest req);
}