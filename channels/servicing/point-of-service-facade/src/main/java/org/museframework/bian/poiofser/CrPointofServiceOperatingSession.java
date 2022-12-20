package org.museframework.bian.poiofser;

import org.museframework.bian.poiofser.dto.ExecutePointofServiceOperatingSessionRequest;
import org.museframework.bian.poiofser.dto.ExecutePointofServiceOperatingSessionResponse;
import org.museframework.bian.poiofser.dto.InitiatePointofServiceOperatingSessionRequest;
import org.museframework.bian.poiofser.dto.InitiatePointofServiceOperatingSessionResponse;
import org.museframework.bian.poiofser.dto.RequestPointofServiceOperatingSessionRequest;
import org.museframework.bian.poiofser.dto.RequestPointofServiceOperatingSessionResponse;
import org.museframework.bian.poiofser.dto.RetrievePointofServiceOperatingSessionRequest;
import org.museframework.bian.poiofser.dto.RetrievePointofServiceOperatingSessionResponse;
import org.museframework.bian.poiofser.dto.UpdatePointofServiceOperatingSessionRequest;
import org.museframework.bian.poiofser.dto.UpdatePointofServiceOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Point of Service. ")
@GenericDomain(name="PointofService", group="PointofServiceOperatingSession")
public interface CrPointofServiceOperatingSession {
    @GenericDtxEndpoint
    @Description("InCR Initiate a point of service session")
    InitiatePointofServiceOperatingSessionResponse initiatePointofServiceOperatingSession(InitiatePointofServiceOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for a point of service session")
    UpdatePointofServiceOperatingSessionResponse updatePointofServiceOperatingSession(UpdatePointofServiceOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated task (e.g. assign a contact)")
    ExecutePointofServiceOperatingSessionResponse executePointofServiceOperatingSession(ExecutePointofServiceOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Request manual intervention (e.g. book future time)")
    RequestPointofServiceOperatingSessionResponse requestPointofServiceOperatingSession(RequestPointofServiceOperatingSessionRequest req);

    @Description("ReCR Retrieve details about a servicing position session")
    RetrievePointofServiceOperatingSessionResponse retrievePointofServiceOperatingSession(RetrievePointofServiceOperatingSessionRequest req);
}