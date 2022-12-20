package org.museframework.bian.regulatoryreporting;

import org.museframework.bian.regulatoryreporting.dto.CaptureEnquiriesRequest;
import org.museframework.bian.regulatoryreporting.dto.CaptureEnquiriesResponse;
import org.museframework.bian.regulatoryreporting.dto.RetrieveEnquiriesRequest;
import org.museframework.bian.regulatoryreporting.dto.RetrieveEnquiriesResponse;
import org.museframework.bian.regulatoryreporting.dto.UpdateEnquiriesRequest;
import org.museframework.bian.regulatoryreporting.dto.UpdateEnquiriesResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="RegulatoryReporting", group="Enquiries")
public interface BqEnquiries {
    @GenericDtxEndpoint
    @Description("UpBQ Update or augment consolidated information to support enquiry handling")
    UpdateEnquiriesResponse updateEnquiries(UpdateEnquiriesRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Provide transaction records as required to support regulatory enquiry")
    CaptureEnquiriesResponse captureEnquiries(CaptureEnquiriesRequest req);

    @Description("ReBQ Retrieve regulatory enquiry detail and response for review")
    RetrieveEnquiriesResponse retrieveEnquiries(RetrieveEnquiriesRequest req);
}