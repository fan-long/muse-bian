package org.museframework.bian.issdevadm;

import org.museframework.bian.issdevadm.dto.CaptureQuestionAssignmentRequest;
import org.museframework.bian.issdevadm.dto.CaptureQuestionAssignmentResponse;
import org.museframework.bian.issdevadm.dto.InitiateQuestionAssignmentRequest;
import org.museframework.bian.issdevadm.dto.InitiateQuestionAssignmentResponse;
import org.museframework.bian.issdevadm.dto.RetrieveQuestionAssignmentRequest;
import org.museframework.bian.issdevadm.dto.RetrieveQuestionAssignmentResponse;
import org.museframework.bian.issdevadm.dto.UpdateQuestionAssignmentRequest;
import org.museframework.bian.issdevadm.dto.UpdateQuestionAssignmentResponse;
import org.museframework.common.core.Description;
import org.museframework.common.core.GenericDomain;
import org.museframework.common.core.GenericDtxEndpoint;

@GenericDomain(name="IssuedDeviceAdministration", group="QuestionAssignment")
public interface BqQuestionAssignment {
    @GenericDtxEndpoint
    @Description("PrBQ Provide a secret question assignment")
    InitiateQuestionAssignmentResponse initiateQuestionAssignment(InitiateQuestionAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("UpBQ Update details of an assigned secret question")
    UpdateQuestionAssignmentResponse updateQuestionAssignment(UpdateQuestionAssignmentRequest req);

    @GenericDtxEndpoint
    @Description("CaBQ Capture usage details of an assigned secret question")
    CaptureQuestionAssignmentResponse captureQuestionAssignment(CaptureQuestionAssignmentRequest req);

    @Description("ReBQ Retrieve details about an assigned ser=AndAnd password")
    RetrieveQuestionAssignmentResponse retrieveQuestionAssignment(RetrieveQuestionAssignmentRequest req);
}