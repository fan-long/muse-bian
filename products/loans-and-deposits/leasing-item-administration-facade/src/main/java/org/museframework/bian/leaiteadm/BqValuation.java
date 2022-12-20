package org.museframework.bian.leaiteadm;

import org.museframework.bian.leaiteadm.dto.CaptureValuationRequest;
import org.museframework.bian.leaiteadm.dto.CaptureValuationResponse;
import org.museframework.bian.leaiteadm.dto.InitiateValuationRequest;
import org.museframework.bian.leaiteadm.dto.InitiateValuationResponse;
import org.museframework.bian.leaiteadm.dto.RetrieveValuationRequest;
import org.museframework.bian.leaiteadm.dto.RetrieveValuationResponse;
import org.museframework.bian.leaiteadm.dto.UpdateValuationRequest;
import org.museframework.bian.leaiteadm.dto.UpdateValuationResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("A collection of one or more clerical routines that are to be followed to administer the operational unit/function  Examples: Time-sheet recording")
@GenericDomain(name="LeasingItemAdministration", group="Valuation")
public interface BqValuation {
    @GenericDtxEndpoint
    @Description("CaBQ Capture Valuation activity or event related information")
    CaptureValuationResponse captureValuation(CaptureValuationRequest req);

    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Valuation")
    InitiateValuationResponse initiateValuation(InitiateValuationRequest req);

    @Description("ReBQ Retrieve details about any aspect of Valuation")
    RetrieveValuationResponse retrieveValuation(RetrieveValuationRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Valuation")
    UpdateValuationResponse updateValuation(UpdateValuationRequest req);
}