package org.museframework.bian.accountrecovery;

import org.museframework.bian.accountrecovery.dto.RetrieveAssessmentRequest;
import org.museframework.bian.accountrecovery.dto.RetrieveAssessmentResponse;
import org.museframework.bian.accountrecovery.dto.UpdateAssessmentRequest;
import org.museframework.bian.accountrecovery.dto.UpdateAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("The main worsteps to be followed in th eexecution of the procedure  Examples: Invoice generation")
@GenericDomain(name="AccountRecovery", group="Assessment")
public interface BqAssessment {
    @GenericDtxEndpoint
    @Description("UpBQ Update details of an active case assessment")
    UpdateAssessmentResponse updateAssessment(UpdateAssessmentRequest req);

    @Description("ReBQ Retrieve details of an active case assessment")
    RetrieveAssessmentResponse retrieveAssessment(RetrieveAssessmentRequest req);
}