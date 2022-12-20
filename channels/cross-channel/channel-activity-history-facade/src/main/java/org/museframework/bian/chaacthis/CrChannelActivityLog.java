package org.museframework.bian.chaacthis;

import org.museframework.bian.chaacthis.dto.InitiateChannelActivityLogRequest;
import org.museframework.bian.chaacthis.dto.InitiateChannelActivityLogResponse;
import org.museframework.bian.chaacthis.dto.RetrieveChannelActivityLogRequest;
import org.museframework.bian.chaacthis.dto.RetrieveChannelActivityLogResponse;
import org.museframework.bian.chaacthis.dto.UpdateChannelActivityLogRequest;
import org.museframework.bian.chaacthis.dto.UpdateChannelActivityLogResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Channel Activity History. ")
@GenericDomain(name="ChannelActivityHistory", group="ChannelActivityLog")
public interface CrChannelActivityLog {
    @GenericDtxEndpoint
    @Description("InCR Initiate channel activity logging for a customer")
    InitiateChannelActivityLogResponse initiateChannelActivityLog(InitiateChannelActivityLogRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update channel activity logging details for a customer")
    UpdateChannelActivityLogResponse updateChannelActivityLog(UpdateChannelActivityLogRequest req);

    @Description("ReCR Retrieve details about customer channel activity logging")
    RetrieveChannelActivityLogResponse retrieveChannelActivityLog(RetrieveChannelActivityLogRequest req);
}