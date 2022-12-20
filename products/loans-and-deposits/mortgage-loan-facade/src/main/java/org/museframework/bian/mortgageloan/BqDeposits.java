package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.InitiateDepositsRequest;
import org.museframework.bian.mortgageloan.dto.InitiateDepositsResponse;
import org.museframework.bian.mortgageloan.dto.RetrieveDepositsRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveDepositsResponse;
import org.museframework.bian.mortgageloan.dto.UpdateDepositsRequest;
import org.museframework.bian.mortgageloan.dto.UpdateDepositsResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="Deposits")
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