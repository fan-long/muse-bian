package org.museframework.bian.secposkee;

import org.museframework.bian.secposkee.dto.InitiateSecuritiesPositionLogRequest;
import org.museframework.bian.secposkee.dto.InitiateSecuritiesPositionLogResponse;
import org.museframework.bian.secposkee.dto.RetrieveSecuritiesPositionLogRequest;
import org.museframework.bian.secposkee.dto.RetrieveSecuritiesPositionLogResponse;
import org.museframework.bian.secposkee.dto.UpdateSecuritiesPositionLogRequest;
import org.museframework.bian.secposkee.dto.UpdateSecuritiesPositionLogResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Securities Position Keeping. ")
@GenericDomain(name="SecuritiesPositionKeeping", group="SecuritiesPositionLog")
public interface CrSecuritiesPositionLog {
    @GenericDtxEndpoint
    @Description("InCR Initiate a position keeping transaction log")
    InitiateSecuritiesPositionLogResponse initiateSecuritiesPositionLog(InitiateSecuritiesPositionLogRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details for an active securities transaction log, including reflecting an account block")
    UpdateSecuritiesPositionLogResponse updateSecuritiesPositionLog(UpdateSecuritiesPositionLogRequest req);

    @Description("ReCR Retrieve information about the log")
    RetrieveSecuritiesPositionLogResponse retrieveSecuritiesPositionLog(RetrieveSecuritiesPositionLogRequest req);
}