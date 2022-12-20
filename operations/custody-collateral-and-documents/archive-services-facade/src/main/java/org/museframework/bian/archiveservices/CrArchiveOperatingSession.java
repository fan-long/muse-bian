package org.museframework.bian.archiveservices;

import org.museframework.bian.archiveservices.dto.ControlArchiveOperatingSessionRequest;
import org.museframework.bian.archiveservices.dto.ControlArchiveOperatingSessionResponse;
import org.museframework.bian.archiveservices.dto.ExchangeArchiveOperatingSessionRequest;
import org.museframework.bian.archiveservices.dto.ExchangeArchiveOperatingSessionResponse;
import org.museframework.bian.archiveservices.dto.ExecuteArchiveOperatingSessionRequest;
import org.museframework.bian.archiveservices.dto.ExecuteArchiveOperatingSessionResponse;
import org.museframework.bian.archiveservices.dto.InitiateArchiveOperatingSessionRequest;
import org.museframework.bian.archiveservices.dto.InitiateArchiveOperatingSessionResponse;
import org.museframework.bian.archiveservices.dto.NotifyArchiveOperatingSessionRequest;
import org.museframework.bian.archiveservices.dto.NotifyArchiveOperatingSessionResponse;
import org.museframework.bian.archiveservices.dto.RequestArchiveOperatingSessionRequest;
import org.museframework.bian.archiveservices.dto.RequestArchiveOperatingSessionResponse;
import org.museframework.bian.archiveservices.dto.RetrieveArchiveOperatingSessionRequest;
import org.museframework.bian.archiveservices.dto.RetrieveArchiveOperatingSessionResponse;
import org.museframework.bian.archiveservices.dto.UpdateArchiveOperatingSessionRequest;
import org.museframework.bian.archiveservices.dto.UpdateArchiveOperatingSessionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Operate equipment and/or a largely automated facility within Archive Services. ")
@GenericDomain(name="ArchiveServices", group="ArchiveOperatingSession")
public interface CrArchiveOperatingSession {
    @GenericDtxEndpoint
    @Description("Control Archive Operating Session")
    ControlArchiveOperatingSessionResponse controlArchiveOperatingSession(ControlArchiveOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Exchange Archive Operating Session")
    ExchangeArchiveOperatingSessionResponse exchangeArchiveOperatingSession(ExchangeArchiveOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Execute Archive Operating Session")
    ExecuteArchiveOperatingSessionResponse executeArchiveOperatingSession(ExecuteArchiveOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Initiate Archive Operating Session")
    InitiateArchiveOperatingSessionResponse initiateArchiveOperatingSession(InitiateArchiveOperatingSessionRequest req);

    @Description("Notify Archive Operating Session")
    NotifyArchiveOperatingSessionResponse notifyArchiveOperatingSession(NotifyArchiveOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Request Archive Operating Session")
    RequestArchiveOperatingSessionResponse requestArchiveOperatingSession(RequestArchiveOperatingSessionRequest req);

    @Description("Retrieve Archive Operating Session")
    RetrieveArchiveOperatingSessionResponse retrieveArchiveOperatingSession(RetrieveArchiveOperatingSessionRequest req);

    @GenericDtxEndpoint
    @Description("Update Archive Operating Session")
    UpdateArchiveOperatingSessionResponse updateArchiveOperatingSession(UpdateArchiveOperatingSessionRequest req);
}