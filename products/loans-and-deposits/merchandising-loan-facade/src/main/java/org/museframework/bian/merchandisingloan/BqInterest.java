package org.museframework.bian.merchandisingloan;

import org.museframework.bian.merchandisingloan.dto.RetrieveInterestRequest;
import org.museframework.bian.merchandisingloan.dto.RetrieveInterestResponse;
import org.museframework.bian.merchandisingloan.dto.UpdateInterestRequest;
import org.museframework.bian.merchandisingloan.dto.UpdateInterestResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="MerchandisingLoan", group="Interest")
public interface BqInterest {
    @Description("ReBQ Retrieve details about any aspect of Interest")
    RetrieveInterestResponse retrieveInterest(RetrieveInterestRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Interest")
    UpdateInterestResponse updateInterest(UpdateInterestRequest req);
}