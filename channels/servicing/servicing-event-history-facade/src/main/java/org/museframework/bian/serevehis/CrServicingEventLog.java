package org.museframework.bian.serevehis;

import org.museframework.bian.serevehis.dto.InitiateServicingEventLogRequest;
import org.museframework.bian.serevehis.dto.InitiateServicingEventLogResponse;
import org.museframework.bian.serevehis.dto.RetrieveServicingEventLogRequest;
import org.museframework.bian.serevehis.dto.RetrieveServicingEventLogResponse;
import org.museframework.bian.serevehis.dto.UpdateServicingEventLogRequest;
import org.museframework.bian.serevehis.dto.UpdateServicingEventLogResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Servicing Event History. ")
@GenericDomain(name="ServicingEventHistory", group="ServicingEventLog")
public interface CrServicingEventLog {
    @GenericDtxEndpoint
    @Description("InCR Initiate servicing event history tracking for a servicing resource")
    InitiateServicingEventLogResponse initiateServicingEventLog(InitiateServicingEventLogRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about the log")
    UpdateServicingEventLogResponse updateServicingEventLog(UpdateServicingEventLogRequest req);

    @Description("ReCR Retrieve details about the servicing event log")
    RetrieveServicingEventLogResponse retrieveServicingEventLog(RetrieveServicingEventLogRequest req);
}