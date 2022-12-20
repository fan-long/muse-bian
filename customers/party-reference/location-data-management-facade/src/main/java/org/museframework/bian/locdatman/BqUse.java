package org.museframework.bian.locdatman;

import org.museframework.bian.locdatman.dto.RetrieveUseRequest;
import org.museframework.bian.locdatman.dto.RetrieveUseResponse;
import org.museframework.bian.locdatman.dto.UpdateUseRequest;
import org.museframework.bian.locdatman.dto.UpdateUseResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="LocationDataManagement", group="Use")
public interface BqUse {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about an usage entry for the location")
    UpdateUseResponse updateUse(UpdateUseRequest req);

    @Description("ReBQ Retrieve details about usage entries in the location directory")
    RetrieveUseResponse retrieveUse(RetrieveUseRequest req);
}