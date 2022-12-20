package org.museframework.bian.interactivehelp;

import org.museframework.bian.interactivehelp.dto.CaptureHelpServiceSelectionRequest;
import org.museframework.bian.interactivehelp.dto.CaptureHelpServiceSelectionResponse;
import org.museframework.bian.interactivehelp.dto.ExecuteHelpServiceSelectionRequest;
import org.museframework.bian.interactivehelp.dto.ExecuteHelpServiceSelectionResponse;
import org.museframework.bian.interactivehelp.dto.InitiateHelpServiceSelectionRequest;
import org.museframework.bian.interactivehelp.dto.InitiateHelpServiceSelectionResponse;
import org.museframework.bian.interactivehelp.dto.RetrieveHelpServiceSelectionRequest;
import org.museframework.bian.interactivehelp.dto.RetrieveHelpServiceSelectionResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The collection of operational serivces/functions offered by the operational facility  Examples: messages, capture, routines")
@GenericDomain(name="InteractiveHelp", group="HelpServiceSelection")
public interface BqHelpServiceSelection {
    @GenericDtxEndpoint
    @Description("InBQ Initiate an interactive help service exchange")
    InitiateHelpServiceSelectionResponse initiateHelpServiceSelection(InitiateHelpServiceSelectionRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture user feedback relating to the service exchange")
    CaptureHelpServiceSelectionResponse captureHelpServiceSelection(CaptureHelpServiceSelectionRequest req);

    @GenericDtxEndpoint
    @Description("ExBQ Execute an automated action within the exchange")
    ExecuteHelpServiceSelectionResponse executeHelpServiceSelection(ExecuteHelpServiceSelectionRequest req);

    @Description("ReBQ Retrieve details about an interactive help service exchange")
    RetrieveHelpServiceSelectionResponse retrieveHelpServiceSelection(RetrieveHelpServiceSelectionRequest req);
}