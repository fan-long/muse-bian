package org.museframework.bian.customerbilling;

import org.museframework.bian.customerbilling.dto.InitiateTrackingandRemindersRequest;
import org.museframework.bian.customerbilling.dto.InitiateTrackingandRemindersResponse;
import org.museframework.bian.customerbilling.dto.RetrieveTrackingandRemindersRequest;
import org.museframework.bian.customerbilling.dto.RetrieveTrackingandRemindersResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="CustomerBilling", group="TrackingandReminders")
public interface BqTrackingandReminders {
    @GenericDtxEndpoint
    @Description("InBQ Initiate tracking and reminder task against an active billing procedure")
    InitiateTrackingandRemindersResponse initiateTrackingandReminders(InitiateTrackingandRemindersRequest req);

    @Description("RwBQ Retrieve details about tracking and reminder activity")
    RetrieveTrackingandRemindersResponse retrieveTrackingandReminders(RetrieveTrackingandRemindersRequest req);
}