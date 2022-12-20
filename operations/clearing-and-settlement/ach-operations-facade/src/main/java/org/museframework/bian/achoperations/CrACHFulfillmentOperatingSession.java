package org.museframework.bian.achoperations;

import org.museframework.bian.achoperations.dto.RetrieveACHFulfillmentOperatingSessionRequest;
import org.museframework.bian.achoperations.dto.RetrieveACHFulfillmentOperatingSessionResponse;
import org.museframework.bian.achoperations.dto.UpdateACHFulfillmentOperatingSessionRequest;
import org.museframework.bian.achoperations.dto.UpdateACHFulfillmentOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within ACH Fulfillment. ")
@GenericDomain(name="ACHOperations", group="ACHFulfillmentOperatingSession")
public interface CrACHFulfillmentOperatingSession {
    @GenericDtxEndpoint
    @Description("UpCR Update the operating schedule parameters")
    UpdateACHFulfillmentOperatingSessionResponse updateACHFulfillmentOperatingSession(UpdateACHFulfillmentOperatingSessionRequest req);

    @Description("ReCR Retrieve details about the ACH access service session")
    RetrieveACHFulfillmentOperatingSessionResponse retrieveACHFulfillmentOperatingSession(RetrieveACHFulfillmentOperatingSessionRequest req);
}