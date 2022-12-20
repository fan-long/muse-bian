package org.museframework.bian.cusevehis;

import org.museframework.bian.cusevehis.dto.InitiateCustomerEventLogRequest;
import org.museframework.bian.cusevehis.dto.InitiateCustomerEventLogResponse;
import org.museframework.bian.cusevehis.dto.RetrieveCustomerEventLogRequest;
import org.museframework.bian.cusevehis.dto.RetrieveCustomerEventLogResponse;
import org.museframework.bian.cusevehis.dto.UpdateCustomerEventLogRequest;
import org.museframework.bian.cusevehis.dto.UpdateCustomerEventLogResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Maintain a log of transactions or activity, typically a financial account/journal or a log of activity to support behavioral analysis within Customer Event History. ")
@GenericDomain(name="CustomerEventHistory", group="CustomerEventLog")
public interface CrCustomerEventLog {
    @GenericDtxEndpoint
    @Description("InCR Initiate customer event history tracking for a customer")
    InitiateCustomerEventLogResponse initiateCustomerEventLog(InitiateCustomerEventLogRequest req);

    @GenericDtxEndpoint
    @Description("UpCR Update details about the log")
    UpdateCustomerEventLogResponse updateCustomerEventLog(UpdateCustomerEventLogRequest req);

    @Description("ReCR Retrieve details about the customer event log")
    RetrieveCustomerEventLogResponse retrieveCustomerEventLog(RetrieveCustomerEventLogRequest req);
}