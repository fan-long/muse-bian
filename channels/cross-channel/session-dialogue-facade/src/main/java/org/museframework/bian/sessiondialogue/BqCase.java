package org.museframework.bian.sessiondialogue;

import org.museframework.bian.sessiondialogue.dto.InitiateCaseRequest;
import org.museframework.bian.sessiondialogue.dto.InitiateCaseResponse;
import org.museframework.bian.sessiondialogue.dto.RetrieveCaseRequest;
import org.museframework.bian.sessiondialogue.dto.RetrieveCaseResponse;
import org.museframework.bian.sessiondialogue.dto.UpdateCaseRequest;
import org.museframework.bian.sessiondialogue.dto.UpdateCaseResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="SessionDialogue", group="Case")
public interface BqCase {
    @GenericDtxEndpoint
    @Description("InBQ Initiate customer case handling")
    InitiateCaseResponse initiateCase(InitiateCaseRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details for case handling")
    UpdateCaseResponse updateCase(UpdateCaseRequest req);

    @Description("ReBQ Retrieve details about case handling")
    RetrieveCaseResponse retrieveCase(RetrieveCaseRequest req);
}