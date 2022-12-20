package org.museframework.bian.leaiteadm;

import org.museframework.bian.leaiteadm.dto.CaptureRegistrationRequest;
import org.museframework.bian.leaiteadm.dto.CaptureRegistrationResponse;
import org.museframework.bian.leaiteadm.dto.InitiateRegistrationRequest;
import org.museframework.bian.leaiteadm.dto.InitiateRegistrationResponse;
import org.museframework.bian.leaiteadm.dto.RetrieveRegistrationRequest;
import org.museframework.bian.leaiteadm.dto.RetrieveRegistrationResponse;
import org.museframework.bian.leaiteadm.dto.UpdateRegistrationRequest;
import org.museframework.bian.leaiteadm.dto.UpdateRegistrationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="LeasingItemAdministration", group="Registration")
public interface BqRegistration {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Registration activity or event related information")
    CaptureRegistrationResponse captureRegistration(CaptureRegistrationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Registration")
    InitiateRegistrationResponse initiateRegistration(InitiateRegistrationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Registration")
    RetrieveRegistrationResponse retrieveRegistration(RetrieveRegistrationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Registration")
    UpdateRegistrationResponse updateRegistration(UpdateRegistrationRequest req);
}