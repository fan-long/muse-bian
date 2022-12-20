package org.museframework.bian.locdatman;

import org.museframework.bian.locdatman.dto.RetrieveOccupancyRequest;
import org.museframework.bian.locdatman.dto.RetrieveOccupancyResponse;
import org.museframework.bian.locdatman.dto.UpdateOccupancyRequest;
import org.museframework.bian.locdatman.dto.UpdateOccupancyResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("An assertion or statement with regard to a concept, a characteristic.  Examples: Product pricing rules, Customer reference details  A descriptor can be atomic or composed. Prospect Management")
@GenericDomain(name="LocationDataManagement", group="Occupancy")
public interface BqOccupancy {
    @GenericDtxEndpoint
    @Description("UpBQ Update details about a location's occupancy")
    UpdateOccupancyResponse updateOccupancy(UpdateOccupancyRequest req);

    @Description("ReBQ Retrieve details about location's occupancy entry in the directory")
    RetrieveOccupancyResponse retrieveOccupancy(RetrieveOccupancyRequest req);
}