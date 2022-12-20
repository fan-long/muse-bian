package org.museframework.bian.mortgageloan;

import org.museframework.bian.mortgageloan.dto.RetrieveInterestRequest;
import org.museframework.bian.mortgageloan.dto.RetrieveInterestResponse;
import org.museframework.bian.mortgageloan.dto.UpdateInterestRequest;
import org.museframework.bian.mortgageloan.dto.UpdateInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MortgageLoan", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details about any aspect of Interest")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Interest")
    UpdateInterestResponse updateInterest(UpdateInterestRequest req);
}