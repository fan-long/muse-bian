package org.museframework.bian.businessdevelopment;

import org.museframework.bian.businessdevelopment.dto.CaptureInitiativeRequest;
import org.museframework.bian.businessdevelopment.dto.CaptureInitiativeResponse;
import org.museframework.bian.businessdevelopment.dto.CreateInitiativeRequest;
import org.museframework.bian.businessdevelopment.dto.CreateInitiativeResponse;
import org.museframework.bian.businessdevelopment.dto.RequestInitiativeRequest;
import org.museframework.bian.businessdevelopment.dto.RequestInitiativeResponse;
import org.museframework.bian.businessdevelopment.dto.RetrieveInitiativeRequest;
import org.museframework.bian.businessdevelopment.dto.RetrieveInitiativeResponse;
import org.museframework.bian.businessdevelopment.dto.UpdateInitiativeRequest;
import org.museframework.bian.businessdevelopment.dto.UpdateInitiativeResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of goals and objectives for the enterprise and its main divisions  Example: Increase marketshare")
@GenericDomain(name="BusinessDevelopment", group="Initiative")
public interface BqInitiative {
    @GenericDtxEndpoint
    @Description("CrBQ Create/instigate a supporting business development initiative")
    CreateInitiativeResponse createInitiative(CreateInitiativeRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for a business development initiative")
    UpdateInitiativeResponse updateInitiative(UpdateInitiativeRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture activity details for a business development initiative")
    CaptureInitiativeResponse captureInitiative(CaptureInitiativeRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention into a business development initiative")
    RequestInitiativeResponse requestInitiative(RequestInitiativeRequest req);

    @Description("ReBQ Retrieve details about a business development initiative")
    RetrieveInitiativeResponse retrieveInitiative(RetrieveInitiativeRequest req);
}