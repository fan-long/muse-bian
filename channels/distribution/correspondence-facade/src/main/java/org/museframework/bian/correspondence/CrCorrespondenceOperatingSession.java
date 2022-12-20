package org.museframework.bian.correspondence;

import org.museframework.bian.correspondence.dto.ExecuteCorrespondenceOperatingSessionRequest;
import org.museframework.bian.correspondence.dto.ExecuteCorrespondenceOperatingSessionResponse;
import org.museframework.bian.correspondence.dto.InitiateCorrespondenceOperatingSessionRequest;
import org.museframework.bian.correspondence.dto.InitiateCorrespondenceOperatingSessionResponse;
import org.museframework.bian.correspondence.dto.RetrieveCorrespondenceOperatingSessionRequest;
import org.museframework.bian.correspondence.dto.RetrieveCorrespondenceOperatingSessionResponse;
import org.museframework.bian.correspondence.dto.UpdateCorrespondenceOperatingSessionRequest;
import org.museframework.bian.correspondence.dto.UpdateCorrespondenceOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Correspondence. ")
@GenericDomain(name="Correspondence", group="CorrespondenceOperatingSession")
public interface CrCorrespondenceOperatingSession {
    @GenericDtxEndpoint
    @Description("InCR Initiate the correspondence operational facility")
    InitiateCorrespondenceOperatingSessionResponse initiateCorrespondenceOperatingSession(InitiateCorrespondenceOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update settings and details of the operating session (e.g. change priorities)")
    UpdateCorrespondenceOperatingSessionResponse updateCorrespondenceOperatingSession(UpdateCorrespondenceOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("ExCR Execute an automated task (e.g. statistical analysis)")
    ExecuteCorrespondenceOperatingSessionResponse executeCorrespondenceOperatingSession(ExecuteCorrespondenceOperatingSessionRequest req);

    @Description("ReCR Retrieve details about the correspondence session")
    RetrieveCorrespondenceOperatingSessionResponse retrieveCorrespondenceOperatingSession(RetrieveCorrespondenceOperatingSessionRequest req);
}