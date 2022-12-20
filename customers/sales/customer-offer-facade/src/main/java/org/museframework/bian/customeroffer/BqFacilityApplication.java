package org.museframework.bian.customeroffer;

import org.museframework.bian.customeroffer.dto.RetrieveFacilityApplicationRequest;
import org.museframework.bian.customeroffer.dto.RetrieveFacilityApplicationResponse;
import org.museframework.bian.customeroffer.dto.UpdateFacilityApplicationRequest;
import org.museframework.bian.customeroffer.dto.UpdateFacilityApplicationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handles the booking of the asset or liability to the appropriate unit")
@GenericDomain(name="CustomerOffer", group="FacilityApplication")
public interface BqFacilityApplication {
    @GenericDtxEndpoint
    @Description("UpBQ Update product options and pricing terms")
    UpdateFacilityApplicationResponse updateFacilityApplication(UpdateFacilityApplicationRequest req);

    @Description("ReBQ Retrieve details about product options and pricing terms")
    RetrieveFacilityApplicationResponse retrieveFacilityApplication(RetrieveFacilityApplicationRequest req);
}