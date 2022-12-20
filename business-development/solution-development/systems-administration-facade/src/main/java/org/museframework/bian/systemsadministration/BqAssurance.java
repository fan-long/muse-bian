package org.museframework.bian.systemsadministration;

import org.museframework.bian.systemsadministration.dto.CaptureAssuranceRequest;
import org.museframework.bian.systemsadministration.dto.CaptureAssuranceResponse;
import org.museframework.bian.systemsadministration.dto.RequestAssuranceRequest;
import org.museframework.bian.systemsadministration.dto.RequestAssuranceResponse;
import org.museframework.bian.systemsadministration.dto.RetrieveAssuranceRequest;
import org.museframework.bian.systemsadministration.dto.RetrieveAssuranceResponse;
import org.museframework.bian.systemsadministration.dto.UpdateAssuranceRequest;
import org.museframework.bian.systemsadministration.dto.UpdateAssuranceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Handle and assign the day to day activities, capture time, costs and income for an operational unit  within Systems Administration.  Example: Administer the time reporting and billing for the specialist sales support team.")
@GenericDomain(name="SystemsAdministration", group="Assurance")
public interface BqAssurance {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Assurance activity or event related information")
    CaptureAssuranceResponse captureAssurance(CaptureAssuranceRequest req);

    @Description("ReBQ Retrieve details about any aspect of Assurance")
    RetrieveAssuranceResponse retrieveAssurance(RetrieveAssuranceRequest req);

    @GenericDtxEndpoint
    @Description("RqBQ Request manual intervention or a decision with respect to Assurance")
    RequestAssuranceResponse requestAssurance(RequestAssuranceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Assurance")
    UpdateAssuranceResponse updateAssurance(UpdateAssuranceRequest req);
}