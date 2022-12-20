package org.museframework.bian.ecmanddcm;

import org.museframework.bian.ecmanddcm.dto.RequestProspectusRequest;
import org.museframework.bian.ecmanddcm.dto.RequestProspectusResponse;
import org.museframework.bian.ecmanddcm.dto.RetrieveProspectusRequest;
import org.museframework.bian.ecmanddcm.dto.RetrieveProspectusResponse;
import org.museframework.bian.ecmanddcm.dto.UpdateProspectusRequest;
import org.museframework.bian.ecmanddcm.dto.UpdateProspectusResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The product features/services available with a financical facility")
@GenericDomain(name="ECMAndDCM", group="Prospectus")
public interface BqProspectus {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of the ECM And DCM prospectus")
    UpdateProspectusResponse updateProspectus(UpdateProspectusRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention with the prospectus development")
    RequestProspectusResponse requestProspectus(RequestProspectusRequest req);

    @Description("ReBQ Retrieve details about the ECM And DCM prospectus development")
    RetrieveProspectusResponse retrieveProspectus(RetrieveProspectusRequest req);
}