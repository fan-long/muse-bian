package org.museframework.bian.collections;

import org.museframework.bian.collections.dto.InitiateCollectionsAssessmentRequest;
import org.museframework.bian.collections.dto.InitiateCollectionsAssessmentResponse;
import org.museframework.bian.collections.dto.RetrieveCollectionsAssessmentRequest;
import org.museframework.bian.collections.dto.RetrieveCollectionsAssessmentResponse;
import org.museframework.bian.collections.dto.UpdateCollectionsAssessmentRequest;
import org.museframework.bian.collections.dto.UpdateCollectionsAssessmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@Description("Complete work tasks following a defined procedure in support of general office activities and product and service delivery  within Collections.  Example: Process the evaluation and completion of customer offers.")
@GenericDomain(name="Collections", group="CollectionsAssessment")
public interface BqCollectionsAssessment {
    @GenericDtxEndpoint
    @Description("InBQ Instantiate a new Collections Assessment")
    InitiateCollectionsAssessmentResponse initiateCollectionsAssessment(InitiateCollectionsAssessmentRequest req);

    @Description("ReBQ Retrieve details about any aspect of Collections Assessment")
    RetrieveCollectionsAssessmentResponse retrieveCollectionsAssessment(RetrieveCollectionsAssessmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details relating to Collections Assessment")
    UpdateCollectionsAssessmentResponse updateCollectionsAssessment(UpdateCollectionsAssessmentRequest req);
}