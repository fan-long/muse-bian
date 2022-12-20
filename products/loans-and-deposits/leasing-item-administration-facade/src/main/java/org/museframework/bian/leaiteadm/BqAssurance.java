package org.museframework.bian.leaiteadm;

import org.museframework.bian.leaiteadm.dto.CaptureAssuranceRequest;
import org.museframework.bian.leaiteadm.dto.CaptureAssuranceResponse;
import org.museframework.bian.leaiteadm.dto.InitiateAssuranceRequest;
import org.museframework.bian.leaiteadm.dto.InitiateAssuranceResponse;
import org.museframework.bian.leaiteadm.dto.RetrieveAssuranceRequest;
import org.museframework.bian.leaiteadm.dto.RetrieveAssuranceResponse;
import org.museframework.bian.leaiteadm.dto.UpdateAssuranceRequest;
import org.museframework.bian.leaiteadm.dto.UpdateAssuranceResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="LeasingItemAdministration", group="Assurance")
public interface BqAssurance {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Assurance activity or event related information")
    CaptureAssuranceResponse captureAssurance(CaptureAssuranceRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Assurance")
    InitiateAssuranceResponse initiateAssurance(InitiateAssuranceRequest req);

    @Description("ReBQ Retrieve details about any aspect of Assurance")
    RetrieveAssuranceResponse retrieveAssurance(RetrieveAssuranceRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Assurance")
    UpdateAssuranceResponse updateAssurance(UpdateAssuranceRequest req);
}