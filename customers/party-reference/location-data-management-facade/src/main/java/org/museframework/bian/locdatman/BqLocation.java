package org.museframework.bian.locdatman;

import org.museframework.bian.locdatman.dto.RetrieveLocationRequest;
import org.museframework.bian.locdatman.dto.RetrieveLocationResponse;
import org.museframework.bian.locdatman.dto.UpdateLocationRequest;
import org.museframework.bian.locdatman.dto.UpdateLocationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="LocationDataManagement", group="Location")
public interface BqLocation {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about a location entry")
    UpdateLocationResponse updateLocation(UpdateLocationRequest req);

    @Description("ReBQ Retrieve details about location entries in the directory")
    RetrieveLocationResponse retrieveLocation(RetrieveLocationRequest req);
}