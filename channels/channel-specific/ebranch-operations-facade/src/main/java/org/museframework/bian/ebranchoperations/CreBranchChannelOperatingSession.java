package org.museframework.bian.ebranchoperations;

import org.museframework.bian.ebranchoperations.dto.InitiateeBranchChannelOperatingSessionRequest;
import org.museframework.bian.ebranchoperations.dto.InitiateeBranchChannelOperatingSessionResponse;
import org.museframework.bian.ebranchoperations.dto.RequesteBranchChannelOperatingSessionRequest;
import org.museframework.bian.ebranchoperations.dto.RequesteBranchChannelOperatingSessionResponse;
import org.museframework.bian.ebranchoperations.dto.RetrieveeBranchChannelOperatingSessionRequest;
import org.museframework.bian.ebranchoperations.dto.RetrieveeBranchChannelOperatingSessionResponse;
import org.museframework.bian.ebranchoperations.dto.UpdateeBranchChannelOperatingSessionRequest;
import org.museframework.bian.ebranchoperations.dto.UpdateeBranchChannelOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within eBranch Operations. ")
@GenericDomain(name="eBranchOperations", group="eBranchChannelOperatingSession")
public interface CreBranchChannelOperatingSession {
    @GenericDtxEndpoint
    @Description("InCR Initiate the eBranch channel service")
    InitiateeBranchChannelOperatingSessionResponse initiateeBranchChannelOperatingSession(InitiateeBranchChannelOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update the eBranch access service menu during the session")
    UpdateeBranchChannelOperatingSessionResponse updateeBranchChannelOperatingSession(UpdateeBranchChannelOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("RqCR Report an issue with the production service")
    RequesteBranchChannelOperatingSessionResponse requesteBranchChannelOperatingSession(RequesteBranchChannelOperatingSessionRequest req);

    @Description("ReCR Retrieve details and statistics relating to a session")
    RetrieveeBranchChannelOperatingSessionResponse retrieveeBranchChannelOperatingSession(RetrieveeBranchChannelOperatingSessionRequest req);
}